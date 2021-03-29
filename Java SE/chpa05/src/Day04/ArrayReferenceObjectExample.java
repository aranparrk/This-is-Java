package Day04;

//057 객체를 참조하는 배열
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");

		System.out.println(strArray[0] == strArray[1]); //true (같은 객체)
		System.out.println(strArray[0] == strArray[2]); //false (다른 객체)
		System.out.println(strArray[0].equals(strArray[2]));//true (같은 문자열)

	}

}
