import java.util.Random;

public class MyClass {
	public MyClass(){
		
	}
	// 돈을 넣으면 1000원을 더해주는 메소드
	public void coin() {
		System.out.println("1000원을 더했어여");
	}
	public void coin2() {
		System.out.println("2000원을 더했어여");
	}
	public void coin3() {
		System.out.println("눈알이 빠질것 같아여");
	}
	public int coin(int money) {
		money += 1000;
		System.out.println("당신의 돈은?" +money);
		return money;
	} 
	public int coinRandom(int money) {
		Random rd = new Random();
//		System.out.println("랜덤 숫자는? " +rd.nextInt(3));
		int num = rd.nextInt(3);
		if(num == 0) {
			money += 1000;
    }else if(num == 1) { 
			money += 2000;
    }else if(num == 2) { 
			money += 3000;
    }else {
			System.out.println("꽝");
	}
		
		return money;
	}

}
