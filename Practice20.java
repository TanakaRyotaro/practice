package practice;//�T�C�Y���������l����͂��A���̃T�C�Y��X����������̕����ŕ\��������۸���

import java.io.*;

public class Practice20 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(i==j || (size - i -1) == j)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}
}