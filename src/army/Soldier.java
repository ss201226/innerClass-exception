package army;

public interface Soldier {
	int arm=2;
	int leg=2;
	
	void eat(); 	//interface는 상수와 추상메소드만 선언되기 때문에 abstract를 붙이지 않아도 자동적으로 선언이 된다.
	void work();
	void sleep();
	void hello();
}
