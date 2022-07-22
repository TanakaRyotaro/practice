package practice;//1球毎に、ストライク･ボール･ファールの何かを入力する
//ファールの場合、2ストライクまではストライクにカウントするが、3ストライクにはならない
//3ストライク又は、4ボールになったら入力をやめ、ストライクとボールのカウントを表示する

import java.io.*;

public class Practice13 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int strike=0;
		int ball=0;
		
		while(strike<3 && ball <4) {
			System.out.print("ストライク=1 or ボール=2 or ファウル=3?");
			
			int judge=Integer.parseInt(br.readLine());
			
			if(judge==1)
				strike++;
			else if(judge==2)
				ball++;
			else if(judge==3 && strike <2)
				strike++;
		}
		System.out.println(ball+"ボール,"+strike+"ストライク");
	}
}
