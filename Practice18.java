package practice;//���l���J��Ԃ����͂��A0�����͂��ꂽ����͂���߁A���ϒl��\��������۸���

import java.io.*;

public class Practice18 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		int count=0;
		
		for( ; ; ) {
			int value=Integer.parseInt(br.readLine());
			
			if(value == 0)
				break;
			sum += value;
			count++;
		}
		System.out.println("���v��"+sum);
		System.out.println("���ς�"+(sum/count));
	}
}