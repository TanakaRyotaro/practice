package practice;//���l���J��Ԃ����͂��A0�����͂��ꂽ����͂���߁A����܂ł̍��v��\��������۸���

import java.io.*;

public class Practice17 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		
		for( ; ; ) {
			int value=Integer.parseInt(br.readLine());
			
			if(value==0)
				break;
			sum += value;
		}
		System.out.println("���v��"+sum);
	}
}