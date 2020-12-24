package inner;

public class InnerTest {
	public static void main(String[] args) {
		Out out=new Out();
		out.outData=20;
		Out.In in=out.new In();
		in.f();
	}
}

class Out{
	int outData;
	
	class In{
		void f() {
			System.out.println(outData);
		}
	}
	
}