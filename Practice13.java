package practice;//1�����ɁA�X�g���C�N��{�[����t�@�[���̉�������͂���
//�t�@�[���̏ꍇ�A2�X�g���C�N�܂ł̓X�g���C�N�ɃJ�E���g���邪�A3�X�g���C�N�ɂ͂Ȃ�Ȃ�
//3�X�g���C�N���́A4�{�[���ɂȂ�������͂���߁A�X�g���C�N�ƃ{�[���̃J�E���g��\������

import java.io.*;

public class Practice13 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		int strike=0;
		int ball=0;
		
		while(strike<3 && ball <4) {
			System.out.print("�X�g���C�N=1 or �{�[��=2 or �t�@�E��=3?");
			
			int judge=Integer.parseInt(br.readLine());
			
			if(judge==1)
				strike++;
			else if(judge==2)
				ball++;
			else if(judge==3 && strike <2)
				strike++;
		}
		System.out.println(ball+"�{�[��,"+strike+"�X�g���C�N");
	}
}
