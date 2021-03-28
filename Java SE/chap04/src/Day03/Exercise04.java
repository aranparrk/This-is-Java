package Day03;

// while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 건지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성 해보세요. 눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)입니다
public class Exercise04 {

	public static void main(String[] args) {
		
		while(true) {
			int a = (int)(Math.random()*6) + 1;
			int b = (int)(Math.random()*6) + 1;
			System.out.println("(" + a + ", " + b + ")");
			if(a+b == 5) {
				break;
			}
		}
	}
}
