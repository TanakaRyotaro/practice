package practice;//数値を繰り返し入力し、合計が100を超えたら入力をやめ、合計を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice11 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		
		while(sum <=100)
			sum += Integer.parseInt(br.readLine());

		System.out.println("合計は"+sum);
	}
}