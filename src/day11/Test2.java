package day11;

public class Test2 {
	public static void main(String[] args) {
		Test2 t=new Test2();
		try {
			t.badMethod("�����߻�");
		} catch (MyException me) {
			// TODO Auto-generated catch block
			System.out.println(me);
		}}
	
		void badMethod(String msg) throws MyException {
			if(msg.equals("�����߻�")) {
				//�����߻���Ű��
				throw new MyException();
				
			}
		}

	}
	class MyException extends Exception{

		@Override
		public String toString() {
			
			return "�����������";
		}
		
	}


