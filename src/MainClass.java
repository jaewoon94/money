import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// �����Լ� �̿��Ͽ� 1000,2000,3000 ��
	    // �������� �ݴ°� �ڵ�
		
		// ���� ������Ѿ��� �޼ҵ� ���
		
		int money = 0;
		
		
	
		// �� ����� Ŭ������ �޼ҵ�� ���� �ҷ�����.
		
		MyClass mc = new MyClass();
//		money = mc.coin(money);
//		mc.coin2();
//		mc.coin3();
		money = mc.coinRandom(money);
		
		
		System.out.println("������?" + money);

	}

}
