package practice;//���l���J��Ԃ����͂��A���v��100�𒴂�������͂���߁A���v��\��������۸���

import java.io.*;

public class Practice11 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int sum=0;
		
		while(sum <=100)
			sum += Integer.parseInt(br.readLine());

		System.out.println("���v��"+sum);
	}
}