package practice;//整数を10回入力し対戦成績とする。0を負け、1を勝ち。
				 //勝ちの総数、負けの総数を表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice5 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int wins=0;
		for(int i=0; i<10; i++) {
			int result = Integer.parseInt(br.readLine());
			if(result==1)
				wins +=1;
		}
		System.out.println("勝ち"+wins+"回、負け"+(10-wins)+"回");
	}
}