package anonymous;

public class Ground {
	public static void main(String[] args) {
		Animal dog=new Animal() { //�޼ҵ带 ���ΰ� �ִ� �ٵ� -> Ŭ������ �����ϰ� ����. �׷��� �ٵ� �տ� �̸��� ����.->�͸�Ŭ����
			
			int size=10; //�������� �����ϴ�.
			
			@Override
			void move() {
				System.out.println("�׹߷� �ظ��� "+size+"��ŭ �پ��");
				
			}
		};
		dog.move();
		Cat cat=new Cat() {
			void move() {
				System.out.println("������ ����� �ζѸ��� �ö󰡴���");
			}
		};
		cat.move();
	}
}
