package practice;//�t�B�{�i�b�`�����\��������۸��с@�ŏ���2�̍���0�C1�Ƃ��A1000�܂ł�\��������̂Ƃ���

import java.io.*;

public class Practice21 {

	public static void main(String[] args)throws IOException {
		int n1=0;
		int n2=1;
		int n3= n1 + n2;
		
		while(n1 <= 1000) {
			System.out.print(n1 + ",");
			
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}