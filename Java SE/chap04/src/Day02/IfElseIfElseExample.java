package Day02;

//034 if-else if-else문
public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90~100입니다");
			System.out.println("등급은 A입니다");
		}else if(score >= 80) { // 80 <= score < 90
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}else if(score >= 70) { // 70 <= score < 79
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다"); 
		}else{ // 70 > score
			System.out.println("점수가 70미만입니다");
			System.out.println("등급은 D입니다");
		}
	}
}
