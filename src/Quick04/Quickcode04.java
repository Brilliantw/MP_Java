package Quick04;
import java.util.*;

class Value<V> {
	V[] a ;
	Value(V[] arr1){
		a = arr1;
	}
	void print(int idx){
		for ( int i = 0 ; i < idx ; i ++ )
			System.out.print(a[i] + " ");
		
		System.out.println("");
	}
	
}
public class Quickcode04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		int int_idx = 0;
		int idx = 0;
		Integer[] arr1 = new Integer[100];
		String[] str1 = new String[100];
		
		Value<Integer> int_arr = null;
		Value<String> str_arr = null;
		
		while ( str.equals("-q") == false ){
			System.out.print("숫자나 문자열을 입력하세요 (입력을 중단하려면 -q를 입력) : ");
			str = in.next();
			if ( str.equals("-q") )
				break;
			else {
			try {
				Integer.parseInt(str);
				arr1[int_idx++] = Integer.parseInt(str);
				
				
			}
			catch(NumberFormatException e){
				str1[idx++] = str;
				
			}
			}
		}
		int_arr = new Value(arr1);
		str_arr = new Value(str1);
		System.out.print("입력된 숫자 : " );
		int_arr.print(int_idx);
		System.out.print("입력된 문자열 : ");
		str_arr.print(idx);
		
		
		
		
		
		
	}

}
