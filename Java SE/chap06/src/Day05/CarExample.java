package Day05;

public class CarExample {

	public static void main(String[] args) {
		//066 외부 클래스에서 Car 필드값 읽기와 변경
//		//객체 생성
//		Car myCar = new Car("검정", 3000);
//		
//		//필드값 읽기
//		System.out.println("제작회사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색깔 : " + myCar.color);
//		System.out.println("최고의 속도 : " + myCar.maxSpeed);
//		System.out.println("현재의 속도 : " + myCar.speed);
//		
//		//필드값 변경
//		myCar.speed = 60;
//		System.out.println("수정된 속도 : " + myCar.speed);

		//070 객체 생성 시 생성자 선택
		//072 객체 생성 시 생선자 선택
//		Car car1 = new Car(); // 1번 생성자
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("자가용"); // 2번 생성자
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		Car car3 = new Car("자가용","빨강"); // 3번 생성자
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		Car car4 = new Car("택시", "검정", 200); // 4번 생성자
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
//		System.out.println();
		
//		//078 return문
//		Car myCar = new Car();
//		
//		myCar.setGas(5); //Car의 setGas() 메소드 호출
//		
//		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas() 메소드 호출
//		if(gasState) {
//			System.out.println("출발합니다");
//			myCar.run(); //Car의 run메소드 호출
//		}
//		
//		if(myCar.isLeftGas()) { //Car의 isLeftGas() 메소드 호출
//			System.out.println("gas를 주입할 필요가 없습니다");
//		}else {
//			System.out.println("gas를 주입해주세요");
//		}
		
		//082
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
	}
}
