package practice;//7の階乗を計算し、表示するﾌﾟﾛｸﾞﾗﾑ

import java.io.*;

public class Practice3 {

	public static void main(String[] args) throws IOException{
		int x=1;
		for(int i=1; i<=7; i++)
			x *= i;
		System.out.println(x);
	}
}