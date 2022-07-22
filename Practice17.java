package practice;//数値を繰り返し入力し、0が入力されたら入力をやめ、それまでの合計を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice17 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		
		for( ; ; ) {
			int value=Integer.parseInt(br.readLine());
			
			if(value==0)
				break;
			sum += value;
		}
		System.out.println("合計は"+sum);
	}
}