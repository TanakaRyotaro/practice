package practice;//個数を示す数値を入力し、その個数分だけ0～9の数値を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice10 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
							new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	
	for(int i=0, out=0; i<count; i++) {
		System.out.print(out++);
			if(out >9)
				out=0;
		}
	}
}