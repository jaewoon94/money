import java.util.Random;

public class MyClass {
	public MyClass(){
		
	}
	// ���� ������ 1000���� �����ִ� �޼ҵ�
	public void coin() {
		System.out.println("1000���� ���߾");
	}
	public void coin2() {
		System.out.println("2000���� ���߾");
	}
	public void coin3() {
		System.out.println("������ ������ ���ƿ�");
	}
	public int coin(int money) {
		money += 1000;
		System.out.println("����� ����?" +money);
		return money;
	} 
	public int coinRandom(int money) {
		Random rd = new Random();
//		System.out.println("���� ���ڴ�? " +rd.nextInt(3));
		int num = rd.nextInt(3);
		if(num == 0) {
			money += 1000;
    }else if(num == 1) { 
			money += 2000;
    }else if(num == 2) { 
			money += 3000;
    }else {
			System.out.println("��");
	}
		
		return money;
	}

}
