package practice;//ストライク･カウントを数えるﾌﾟﾛｸﾞﾗﾑ　1球毎に、ストライクorボールを入力
				 //3ストライク又は、4ボールになったら入力をやめ、ストライクとボールのカウントを表示する

import java.io.*;

public class Practice12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int strike=0;
		int ball=0;
		
		while(strike<3 && ball<4) {
			System.out.print("ストライク=1 or ボール=2 ?");
			
			int judge=Integer.parseInt(br.readLine());
			
			if(judge == 1)
				strike++;
			else if(judge == 2)
				ball++;
		}
		System.out.println(ball + "ボール" +strike+ "ストライク");
	}
}