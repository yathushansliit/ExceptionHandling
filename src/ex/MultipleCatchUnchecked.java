package ex;

public class MultipleCatchUnchecked {

	public static void main(String[] args) {
		int i,j,k=0;
		int a[] = new int[4];
		i=20;
		j=10;
		try {
			k=i/j;
			for(int c=0;c<=4;c++) {
				a[c]=c+1;
				
			}
			
			for(int value :a) {
				System.out.println(value);
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("Cannot devide by Zero  "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Maximum number value is 4  "+e);
		}
		System.out.println(k);		

	}

}
