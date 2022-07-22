package practice;//数値を繰り返し入力し、0が入力されたら入力をやめ、平均値を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice18 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		int count=0;
		
		for( ; ; ) {
			int value=Integer.parseInt(br.readLine());
			
			if(value == 0)
				break;
			sum += value;
			count++;
		}
		System.out.println("合計は"+sum);
		System.out.println("平均は"+(sum/count));
	}
}