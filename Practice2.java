package practice;//2の1乗から8乗までを計算し表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;
public class Practice2 {

	public static void main(String[] args) throws IOException{
		int x=1;
		for(int n=1; n<=8; n++)
		{
			x *= 2;
			System.out.println("2の"+n+"乗="+ x );
		}
	}
}