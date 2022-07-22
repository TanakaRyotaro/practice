package practice;//整数を10回入力し、平均値を求めるﾌﾟﾛｸﾞﾗﾑ

import  java.io.*;

public class Practice4 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		for(int i=0; i<10; i++) {
			int value=Integer.parseInt(br.readLine());
			sum += value;
		}
		System.out.println("平均は"+(sum/10));
	}
}