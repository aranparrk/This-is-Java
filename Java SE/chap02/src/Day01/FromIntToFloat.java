package Day01;

//013 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다
public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result); // int값을 float타입으로 자동 변환하면서 문제가 발생했기 때문에 0이 나오지 않는다
	}

}
