package day11;

public class Test2 {
	public static void main(String[] args) {
		Test2 t=new Test2();
		try {
			t.badMethod("오류발생");
		} catch (MyException me) {
			// TODO Auto-generated catch block
			System.out.println(me);
		}}
	
		void badMethod(String msg) throws MyException {
			if(msg.equals("오류발생")) {
				//오류발생시키기
				throw new MyException();
				
			}
		}

	}
	class MyException extends Exception{

		@Override
		public String toString() {
			
			return "내가만든오류";
		}
		
	}


