package practice;//正の整数を10回入力し、最大値を求めるﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice7 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int max_value=0;
		for(int i=0; i<10; i++) {
			int value=Integer.parseInt(br.readLine());
			
			if(value > max_value)
				max_value=value;
		}
		System.out.println("最大値="+ max_value);
	}
}