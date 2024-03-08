package kr.ac.kopo.day04;

/*
 4. 달팽이가 100M깊이의 우물에 빠졌습니다
   달팽이는 한시간에 5M씩 기어오릅니다
   달팽이가 올라간 높이가 50M미만일때는 한시간에 1M 미끌어지고,
                     50Md이상일때는 한시간에 2M 미끌어집니다
   달팽이가 총 몇시만에 탈출하는 코드를 작성하시오.
   
   [1시간후] 달팽이가 올라간 총 높이 : 4M
   [2시간후] 달팽이가 올라간 총 높이 : 
   ...
   [XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
 */
public class Assignment04 {

	
	
	public static void main(String[] args) {
		final int WELL_DEPTH = 100;		//우물깊이
		final int BELOW_SPEED = 1;		//일정 깊이 미만일 때 속도
		final int OVER_SPEED = 2;		//일정 깊이 이상일 때 속도
		final int CHANGE_DEPTH = 50;	//속도가 변하는 깊이
		
		int passedHour = 0;
		int climbedHeight = 0;
		int currentSpeed = 0;
		
		while(climbedHeight < WELL_DEPTH) {
			//현재 위치에 따른 속도 변경
			if(climbedHeight < CHANGE_DEPTH) {
				currentSpeed = BELOW_SPEED;
			}else {
				currentSpeed = OVER_SPEED;				
			}
			
			//1시간이 지남에 따라 변경 계산
			passedHour++;
			climbedHeight += currentSpeed * 1;	//1로 1시간이 지났음을 표현함
			
			//출력
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", passedHour, climbedHeight);
		}
	}
}
