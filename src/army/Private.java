package army;

public class Private implements Soldier{

	@Override
	public void eat() {
		System.out.println("식사");
		
	}

	@Override
	public void work() {
		System.out.println("이곳저곳 뛰어다니기");
		
	}

	@Override
	public void sleep() {
		System.out.println("잔다");
		
	}

	@Override
	public void hello() {
		System.out.println("충!!성!!");
		
	}

}
