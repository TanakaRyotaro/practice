package practice;//フィボナッチ数列を表示するﾌﾟﾛｸﾞﾗﾑ　最初の2つの項を0，1とし、1000までを表示するものとする

import java.io.*;

public class Practice21 {

	public static void main(String[] args)throws IOException {
		int n1=0;
		int n2=1;
		int n3= n1 + n2;
		
		while(n1 <= 1000) {
			System.out.print(n1 + ",");
			
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}