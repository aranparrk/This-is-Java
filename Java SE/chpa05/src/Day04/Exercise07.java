package Day04;

//주어진 배열의 항목에서 최대값을 구해보세요. (for문을 이용하세요)
public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);

	}

}
