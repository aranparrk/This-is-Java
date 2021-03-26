package Day02;

//028 문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "박아란";
		String strVar2 = "박아란";
		String strVar3 = new String("박아란");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}
