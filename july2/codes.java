package july2;

import java.util.Scanner;

public class codes {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = scn.nextLine();
		printCodes(S1,"");
	}
	private static void printCodes(String str, String ans) {
	    if (str.length() == 0) {
	        System.out.println(ans);
	        return;
	    }

	    String ch1 = str.substring(0, 1);
	    String ros1 = str.substring(1);

	    if (Integer.parseInt(ch1, 10) > 0) {
	        char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);
	        printCodes(ros1, ans + code);
	    }

	    if (str.length() >= 2) {
	        String ch12 = str.substring(0, 2);
	        String ros2 = str.substring(2);

	        if (Integer.parseInt(ch12, 10) > 0 && Integer.parseInt(ch12) <= 26) {
	            char code = (char) (Integer.parseInt(ch12, 10) + 'a' - 1);
	            printCodes(ros2, ans + code);
	        }
	        if (Integer.parseInt(ch12, 10) == 0) {
	            printCodes(ros2, ans);
	        }
	    }
	}

}
