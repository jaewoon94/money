
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
		System.out.println("현재" +money+ "원 있스빈다.");
		return money;
	}

}
