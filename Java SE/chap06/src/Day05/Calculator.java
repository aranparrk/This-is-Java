package Day05;

//073 메소드 선언
public class Calculator {
	//메소드
//	void powerOn() {
//		System.out.println("전원을 켭니다");
//	}
//	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double divide(int x, int y) {
//		double result = (double)x / (double)y;
//		return result;
//	}
//	
//	void powerOff() {
//		System.out.println("전원을 끕니다");
//	}
	
	//079 클래스 내부에서 메소드호출
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		System.out.println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
