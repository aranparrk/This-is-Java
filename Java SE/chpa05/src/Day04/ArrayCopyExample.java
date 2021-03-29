package Day04;

//059 System.arraycopy()로 배열 복사
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newstrArray = new String[5];
		
		System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);
		
		for(int i = 0; i < newstrArray.length; i++) {
			System.out.print(newstrArray[i] + ", ");
		}

	}

}
