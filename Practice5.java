package practice;//������10����͂��ΐ퐬�тƂ���B0�𕉂��A1�������B
				 //�����̑����A�����̑�����\��������۸���

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
		System.out.println("����"+wins+"��A����"+(10-wins)+"��");
	}
}