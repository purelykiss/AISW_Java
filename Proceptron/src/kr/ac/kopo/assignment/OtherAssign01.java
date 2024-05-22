package kr.ac.kopo.assignment;

public class OtherAssign01 {
	public static void main(String[] args) {
		
		double[] x = {3, 5, 7, 8, 4};
		double[] y = {7, 11, 15, 17, 9};
		
		double w = 1;
		double b = 0;
		
		double loss = 0;
		for (int i = 0; i < 5; i++) {
			loss += ((y[i] - (w * x[i] + b)) * (y[i] - (w * x[i] + b)));
		}
		loss /= 5;
		
		double inclination = (0 - loss) / (0 - w);		
		double beforeLoss = loss;
		double beforeW = w;
//		int lossCnt = 0;
		
		double alpha = 0.01;
		for (int j = 0; j < 100000; j++) {
			System.out.println(j + "번째 loss : " + loss);
			if (Double.isNaN(inclination)) break;
			
			w = w - alpha * inclination;
			b = b - alpha * inclination;
			loss = 0;
			for (int i = 0; i < 5; i++) {
				loss += (y[i] - (w * x[i] + b)) * (y[i] - (w * x[i] + b));
			}
			loss /= 5;
			
			inclination = (loss - beforeLoss) / (w - beforeW);
			beforeLoss = loss;
			beforeW = w;
			
		}
		
		System.out.println("w : " + w + ", b : " + b);
		
	}
}
