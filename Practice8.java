package practice;//������10����͂��A�ő�l�ƍŏ��l�����߂���۸���

import java.io.*;

public class Practice8 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
							new InputStreamReader(System.in));
		int max_value=0, min_value=0;
		
		for(int i=0; i<10; i++) {
			int value=Integer.parseInt(br.readLine());
			
			if(i==0) {
				max_value=value;
				min_value=value;
			}
			else {
				if(value > max_value)
					max_value=value;
				
				if(value < min_value)
					min_value=value;
			}
		}
		System.out.println("�ő�l="+max_value+"�ŏ��l="+min_value);
	}
}