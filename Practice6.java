package practice;//���l�A��_��Ŗ���̓��_����͂���i1��`9��j
				 //���͌�A���ꂼ��̓��_�ƁA�ǂ��炪����������\��������۸���

import java.io.*;

public class Practice6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(
								new InputStreamReader(System.in));
		int giants=0;
		int tigers=0;
		
		for(int game=1; game<=9; game++) {
			System.out.print(game+"��\�A���l�̓��_��?");
			giants += Integer.parseInt(br.readLine());
			
			System.out.print(game+"�񗠁A��_�̓��_��?");
			tigers += Integer.parseInt(br.readLine());
		}
		System.out.println("���l:"+giants+"�_�C��_:"+tigers+"�_");
		
		
		if(giants > tigers)
			System.out.println("���l�̏���");
		else if(giants < tigers)
			System.out.println("��_�̏���");
		else
			System.out.println("��������");
	}
}