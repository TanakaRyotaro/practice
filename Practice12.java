package practice;//�X�g���C�N��J�E���g�𐔂�����۸��с@1�����ɁA�X�g���C�Nor�{�[�������
				 //3�X�g���C�N���́A4�{�[���ɂȂ�������͂���߁A�X�g���C�N�ƃ{�[���̃J�E���g��\������

import java.io.*;

public class Practice12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(
								new InputStreamReader(System.in));
		int strike=0;
		int ball=0;
		
		while(strike<3 && ball<4) {
			System.out.print("�X�g���C�N=1 or �{�[��=2 ?");
			
			int judge=Integer.parseInt(br.readLine());
			
			if(judge == 1)
				strike++;
			else if(judge == 2)
				ball++;
		}
		System.out.println(ball + "�{�[��" +strike+ "�X�g���C�N");
	}
}