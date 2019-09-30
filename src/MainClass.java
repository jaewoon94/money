
public class MainClass {

	public static void main(String[] args) {
		// 길을 가다가 돈을 3번 주워야되는 설정으로 프로그램을 작성
	    // 돈을 저장 시켜야 할 돈 변수 설정
		// 길을 간다라고 화면에 출력
		// 돈을 주우면 돈 변수 값이 변경이 되고 얼마가 되었다 출력
		
		int money = 0;
		/*System.out.println("현재" +money+ "원 있습니다.");
		System.out.println("길을 가다가 3000원을 주웠습니다.");
		money = 3000;
		System.out.println("현재" +money+ "원 있습니다.");
		System.out.println("길을 가다가 10000원을 주웠습니다.");
		money = money + 10000;
		System.out.println("현재" +money+ "원 있습니다.");
		System.out.println("길을 가다가 5000원 주웠습니다.");
		money = money + 5000;
		System.out.println("현재" +money+ "원 있습니다.");*/
		
		for(int i=1; i<=5; i++) {
			System.out.println("길을 가다가 1000원을 주웠스빈다.");
			money += 1000;
			System.out.println("현재" +money+ "원 있스빈다.");
		}
		if(money >= 5000) {
			System.out.println("밥을 먹을 수 있스빈다.");
		} else {
			System.out.println("돈을 더 주워야하빈다.");
		}
		
		// 위 기능을 클래스에 메소드로 만들어서 불러보자.
		MyClass mc = new MyClass();
		money = mc.coin(money);
		mc.coin2();
		mc.coin3();
		System.out.println("현재" +money+ "원 있스빈다.");

	}

}
