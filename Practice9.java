package practice;//個数を示す数値を入力し、その個数分だけ'*'を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice9 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		
		while(count>0) {
			System.out.print("＊");
			count--;
		}
	}
}