package cafe;

public class Starbucks {
	void regist(Cafe c) { //선언중
		String[] arMenu = c.getMenu(); //아직 사용x . 사용할 때는 c가 이미 재정의된 상태에서 넘겨받을 것임 그래서 c.getMenu() 사용가능
		int[] arPrice = c.getPrice();
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]+"\t:\t"+arPrice[i]+"원");
		}
	
		c.sell("아메리카노");
		c.sell("아메리카노");
		c.sell("아메리카노");
		c.sell("아메리카노");
		c.sell("아메리카노");
	}



}
