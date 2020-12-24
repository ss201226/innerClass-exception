package cafe;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
//		gangnam.regist(new Cafe() {
//			
//			@Override
//			public void sell(String menu) {
//				String[] arMenu= getMenu();
//				int[] arPrice= getPrice();
//				for (int i = 0; i < arMenu.length; i++) {
//					if(arMenu[i].equals(menu)) {
//						System.out.println(arPrice[i]+"원");
//					}
//				}
//			}
//			@Override
//			public int[] getPrice() {
//				int[] arPrice = {3500,4000,6000};
//				return arPrice;
//			}
//			@Override
//			public String[] getMenu() {
//				String[] arMenu = {"아메리카노","카페라떼","허니브레드"};
//				return arMenu;
//			}
//		});
		Starbucks shinchon=new Starbucks();
		shinchon.regist(new Cafe() {
			
			
			
			@Override
			public void sell(String menu) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int[] getPrice() {
				int[] arPrice= {3500,4000,6000};
				
				return arPrice;
			}
			@Override
			public String[] getMenu() {
				String[] arMenu= {"아메리카노","카푸치노","카페라떼"};
				return ㅁ그두ㅕ;
			}


			
			
		
	});
}
}