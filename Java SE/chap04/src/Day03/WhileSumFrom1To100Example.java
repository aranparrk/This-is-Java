package Day03;

//046 1부터 100까지 합을 출력
public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1~" + (i-1) + "의 합 : " + sum);
	}
}
