package practice;//���͂��ꂽ�����f�����ǂ����𔻒肷����۸���

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
			System.out.println(value + "�͑f�G�ł�");
		else
			System.out.println(value + "�͑f���ł͂���܂���");
	}
}