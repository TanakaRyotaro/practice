package practice;//“ü—Í‚³‚ê‚½”‚ª‘f”‚©‚Ç‚¤‚©‚ğ”»’è‚·‚éÌßÛ¸Ş×Ñ

import java.io.*;

public class Practice14 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int value=Integer.parseInt(br.readLine());
		int n;
		
		for(n=2; n<=(value/2); n++) {
			if((value%n) ==0)
				break;
		}
		if(n>(value/2))
			System.out.println(value + "‚Í‘f“G‚Å‚·");
		else
			System.out.println(value + "‚Í‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
	}
}