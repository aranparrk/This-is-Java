package Day03;

//050 continue를 사용한 for문
public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) { //2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue; //반복문을 제외하고 재실행 된다
			}
		System.out.println(i); //홀수는 실행되지 않는다
		}

	}

}
