package cafe;

public class Starbucks {
	void regist(Cafe c) { //������
		String[] arMenu = c.getMenu(); //���� ���x . ����� ���� c�� �̹� �����ǵ� ���¿��� �Ѱܹ��� ���� �׷��� c.getMenu() ��밡��
		int[] arPrice = c.getPrice();
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]+"\t:\t"+arPrice[i]+"��");
		}
	
		c.sell("�Ƹ޸�ī��");
		c.sell("�Ƹ޸�ī��");
		c.sell("�Ƹ޸�ī��");
		c.sell("�Ƹ޸�ī��");
		c.sell("�Ƹ޸�ī��");
	}



}
