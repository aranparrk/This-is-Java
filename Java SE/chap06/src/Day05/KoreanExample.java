package Day05;

//068 객체 생성 후 필드값 출력
public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박아란", "940315-2000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("노성봉", "941009-1000000");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
