package Day04;

//060 향상된 for문
public class AdvaceForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int socre : scores) {
			sum = sum + socre;
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
