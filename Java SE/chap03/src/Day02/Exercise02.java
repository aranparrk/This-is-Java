package Day02;

// 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
public class Exercise02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 11 + 20 
		System.out.println(z); // 31?
	}
}
