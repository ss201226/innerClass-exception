package anonymous;

public class Ground {
	public static void main(String[] args) {
		Animal dog=new Animal() { //메소드를 감싸고 있는 바디 -> 클래스를 선언하고 있음. 그런데 바디 앞에 이름이 없다.->익명클래스
			
			int size=10; //변수선언도 가능하다.
			
			@Override
			void move() {
				System.out.println("네발로 해맑게 "+size+"만큼 뛰어간다");
				
			}
		};
		dog.move();
		Cat cat=new Cat() {
			void move() {
				System.out.println("얌전한 고양이 부뚜막에 올라가는중");
			}
		};
		cat.move();
	}
}
