package kr.ac.kopo.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		final int inputNum = 6;
		
		List<Integer> X = new ArrayList<Integer>();
		List<Integer> Y = new ArrayList<Integer>();
		
		System.out.printf("총 %d개 좌표를 입력합니다.\n", inputNum);
		for(int i = 0; i < inputNum; i++) {
			System.out.printf("%d번째 좌표 X: ", i+1);
			X.add(Integer.parseInt(sc.nextLine()));
			System.out.printf("%d번째 좌표 Y: ", i+1);
			Y.add(Integer.parseInt(sc.nextLine()));
		}
		
		double A = 0;
		
		System.out.println("Learning Rate을 설정합니다.(0 < A < 1)");
		while(!(A > 0 && A < 1)) {
			System.out.print("Lerning Rate: ");
			A = Double.parseDouble(sc.nextLine());
		}
		
		int Epoch = 0;
		
		System.out.println("Epoch를 설정합니다. (양수)");
		while(!(Epoch>0)) {
			System.out.print("Epoch: ");
			Epoch = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("");
		System.out.println("실행중...");

		List<Double> YHat;
		double curWeight = rd.nextDouble();
		double preWeight = 0;
		double curBias = rd.nextInt(1,10);
		double preBias = 0;
		double weightIncrenation = 0;
		double biasIncrenation = 0;
		boolean flagWeightOver = false;
		boolean flagBiasOver = false;
		double mse = 0;
		double preMse = 0;
		
		for(int i = 0; i<Epoch; i++) {
			YHat = new ArrayList<Double>();
			for (var item : X) {
				YHat.add(curWeight * item + curBias);
			}
			
			mse = 0;
			for (int j = 0; j<YHat.size(); j++) {
				mse += Math.pow(YHat.get(j) - Y.get(j),2);
			}
			
			weightIncrenation = (preMse-mse)/(preWeight-curWeight);
			biasIncrenation = (preMse-mse)/(preBias-curBias);
			
			flagWeightOver = false;
			if(weightIncrenation == 0)
				flagWeightOver = true;
			
			flagBiasOver = false;
			if(biasIncrenation == 0)
				flagBiasOver = true;
			
			if(flagWeightOver && flagBiasOver) {
				System.out.println("조기종료");
				break;
			}
			
			System.out.printf("%d번째 시도 MSE : %.4f\n",i+1,mse);
			System.out.println(curWeight);
			System.out.println(preWeight);
			System.out.println(curBias);
			System.out.println(preBias);
			System.out.println(mse);
			System.out.println(preMse);
			System.out.println();
			
			double tmpPreWeight = curWeight;
			double tmpPreBias = curBias;
			
			curWeight = curWeight - A*weightIncrenation;
			curBias = curBias - A*biasIncrenation;

			preWeight = tmpPreWeight;
			preBias = tmpPreBias;
			preMse = mse;
		}
		
		System.out.println();
		System.out.println("결과:");
		System.out.printf("weight: %.4f\n", curWeight);
		System.out.printf("bios: %.4f\n", curBias);
		System.out.printf("Loss: %.4f\n", mse);
	}
}
