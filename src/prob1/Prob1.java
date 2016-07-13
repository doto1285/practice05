package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		String result = "";
		for(char c : s.toCharArray()){
			result += c;
			System.out.println(result);
		}
		scanner.close();
	}
}