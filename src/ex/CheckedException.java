package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) {
		int i,j = 0,k=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=20;
		
		try {
			j=Integer.parseInt(br.readLine());
			k=i/j;
			
			
		}
		catch(IOException e){
			System.out.println("Some IO error"+e);

			
		}
		catch(ArithmeticException e){
			System.out.println("Cannot devide by Zero  "+e);
		}		
		System.out.println(k);	

	}

}
