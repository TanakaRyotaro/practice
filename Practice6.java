package practice;//巨人、阪神戦で毎回の得点を入力する（1回～9回）
				 //入力後、それぞれの得点と、どちらが勝ったかを表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(
								new InputStreamReader(System.in));
		int giants=0;
		int tigers=0;
		
		for(int game=1; game<=9; game++) {
			System.out.print(game+"回表、巨人の得点は?");
			giants += Integer.parseInt(br.readLine());
			
			System.out.print(game+"回裏、阪神の得点は?");
			tigers += Integer.parseInt(br.readLine());
		}
		System.out.println("巨人:"+giants+"点，阪神:"+tigers+"点");
		
		
		if(giants > tigers)
			System.out.println("巨人の勝ち");
		else if(giants < tigers)
			System.out.println("阪神の勝ち");
		else
			System.out.println("引き分け");
	}
}