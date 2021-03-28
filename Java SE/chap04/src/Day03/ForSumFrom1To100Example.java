package Day03;

//042 1부터 100까지 합을 출력
public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; //합계변수
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합 : " + sum); //합계변수
		
		int sum1 = 0; //합계 변수
		int i = 0; //카운트 변수
		for(i=1; i <= 100; i++) {
			sum1 += i;
		}
		System.out.println("1~" + (i-1) + "의 합 : " + sum1); // (i-1) 카운트 변수, sum1 합계 변수
	}

}
