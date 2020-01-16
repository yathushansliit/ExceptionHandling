package ex;

public class UncheckedException {

	public static void main(String[] args) {
		int i,j,k=0;
		i=0;
		j=0;
		try {
			k=i/j;			
		}
		catch(ArithmeticException e){
			System.out.println("Cannot devide by Zero  "+e);
		}		
		System.out.println(k);			
		}
}
//its is an unchecked exception because its arithmetic exception which is the sub class of Runtime exception so that can't be handled