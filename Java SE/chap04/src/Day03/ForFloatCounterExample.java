package Day03;

//043 float 타입 카운터 변수
public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x = 0; x <= 1.0f; x+=0.1f) {
			System.out.println(x); // 0.1을 float타입으로 정확하게 표현할 수 없기 때문에 루프는 9번만 반복 된다
		}
	}
}
