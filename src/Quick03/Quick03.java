package Quick03;

import java.util.*;
import java.io.*;


public class Q03 {

	public static void main(String[] args) throws Exception{
		
			Scanner in = new Scanner(System.in);
			
			String str1 = in.nextLine();
			String str2 = in.nextLine();
			
			int num1, num2;
			
			try{
				num1 = Integer.parseInt(str1);
				num2 = Integer.parseInt(str2);
				
				if ( num1 >= 1000 || num2 >= 1000 )
					throw new Exception();
				num1 /= num2;
			}
			catch (NumberFormatException exc1){
				System.out.println("NumberFormatException Occured");
			}
			catch (ArithmeticException exc2){
				System.out.println("Devided by Zero");
			}
			catch (Exception exc3){
				System.out.println("number is too big");
			}
			
	}
}

