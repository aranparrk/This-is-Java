package Day04;

import java.util.Scanner;

//다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다. 실행 결과를 보고, 알맞게 작성해보세요(참고로 16라인에서 Scanner의 nextInt()메소드는 콘솔에 입련된 숫자를 읽고 리턴합니다)
public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum += scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores["+ i +"] > ");
					int score = scanner.nextInt();
					scores[i] = score;
				}
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i +"] > " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				int max = 0;
				double avg = 0.0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			}else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
