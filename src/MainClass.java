
public class MainClass {

	public static void main(String[] args) {
		// ���� ���ٰ� ���� 3�� �ֿ��ߵǴ� �������� ���α׷��� �ۼ�
	    // ���� ���� ���Ѿ� �� �� ���� ����
		// ���� ���ٶ�� ȭ�鿡 ���
		// ���� �ֿ�� �� ���� ���� ������ �ǰ� �󸶰� �Ǿ��� ���
		
		int money = 0;
		/*System.out.println("����" +money+ "�� �ֽ��ϴ�.");
		System.out.println("���� ���ٰ� 3000���� �ֿ����ϴ�.");
		money = 3000;
		System.out.println("����" +money+ "�� �ֽ��ϴ�.");
		System.out.println("���� ���ٰ� 10000���� �ֿ����ϴ�.");
		money = money + 10000;
		System.out.println("����" +money+ "�� �ֽ��ϴ�.");
		System.out.println("���� ���ٰ� 5000�� �ֿ����ϴ�.");
		money = money + 5000;
		System.out.println("����" +money+ "�� �ֽ��ϴ�.");*/
		
		for(int i=1; i<=5; i++) {
			System.out.println("���� ���ٰ� 1000���� �ֿ������.");
			money += 1000;
			System.out.println("����" +money+ "�� �ֽ����.");
		}
		if(money >= 5000) {
			System.out.println("���� ���� �� �ֽ����.");
		} else {
			System.out.println("���� �� �ֿ����Ϻ��.");
		}
		
		// �� ����� Ŭ������ �޼ҵ�� ���� �ҷ�����.
		MyClass mc = new MyClass();
		money = mc.coin(money);
		mc.coin2();
		mc.coin3();
		System.out.println("����" +money+ "�� �ֽ����.");

	}

}
