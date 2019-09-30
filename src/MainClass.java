import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// 랜덤함수 이용하여 1000,2000,3000 원
	    // 랜덤으로 줍는거 코딩
		
		// 돈을 저장시켜야할 메소드 출력
		
		int money = 0;
		
		
	
		// 위 기능을 클래스에 메소드로 만들어서 불러보자.
		
		MyClass mc = new MyClass();
//		money = mc.coin(money);
//		mc.coin2();
//		mc.coin3();
		money = mc.coinRandom(money);
		
		
		System.out.println("내돈은?" + money);

	}

}
