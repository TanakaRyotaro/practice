package practice;//2�ȏ�̐��l����͂��A�f���������������ʂ�\������

import java.io.*;

public class Practice15 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		for(int x=2; n>1; x++) {
			while((n%x)==0) {
				System.out.print(x+" ");
				n /= x;
			}
		}
	}
}