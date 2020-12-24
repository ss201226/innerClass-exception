package army;

public class Sergeant extends SoldierAdapter {

	@Override
	public void eat() {
		System.out.println("밥 대충");
		
	}

	

	@Override
	public void sleep() {
		System.out.println("내집 마냥 ");
		
	}




}
