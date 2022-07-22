package practice;//サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice19 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("$");
			System.out.println();
		}
	}
}