
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
		System.out.println("����" +money+ "�� �ֽ����.");
		return money;
	}

}
