package july2;

import java.util.ArrayList;
import java.util.Scanner;

public class recursionget {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// String str = "abc";
		// int n = scn.nextInt();
//		int curr = scn.nextInt();
//		int end = scn.nextInt();
		int n = scn.nextInt();
		int m = scn.nextInt();

		ArrayList<String> ans = getmazepath(0,0, n-1, m-1);
		System.out.println(ans.size());
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(ch + rrs);
			mr.add((int) ch + rrs);
		}
		return mr;
	}

	public static String getCode(char ch) {

		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jklm";
		} else if (ch == '5') {
			return "nop";
		} else if (ch == '6') {
			return "qr";
		} else if (ch == '7') {
			return "stu";
		} else if (ch == '8') {
			return "vw";
		} else if (ch == '9') {
			return "xyz";
		} else if (ch == '0') {
			return "#$";
		} else {
			return "";
		}
	}

	public static ArrayList<String> getKeypad(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getKeypad(ros);
		ArrayList<String> mr = new ArrayList<>();
		String s = getCode(ch);

		for (int i = 0; i < s.length(); i++) {
			for (String rrs : rr) {
				mr.add(s.charAt(i) + rrs);
			}
		}
		return mr;

	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getPermutation(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (int i = 0; i < rr.size(); i++) {

			// ros = str.substring(1);
			String str1 = rr.get(i);
			for (int j = 0; j <= ros.length(); j++) {
				mr.add(str1.substring(0, j) + ch + str1.substring(j));

			}
		}
		return mr;

	}

	public static ArrayList<String> getcointoss(int n) {
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		ArrayList<String> rr = getcointoss(n - 1);
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {

			mr.add("H" + rrs);
			mr.add("T" + rrs);

		}

		return mr;

	}

	public static ArrayList<String> getboardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (curr > end) {
			return new ArrayList<>();
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = getboardpath(curr + dice, end);
			for (String rrs : rr) {
				mr.add(dice + rrs);
			}

		}
		return mr;
	}

	public static ArrayList<String> getmazepath(int cr,int cc,int er,int ec) {
		if(cc==ec && er==cr){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
}         
		if(cc>ec || cr>er){
	    ArrayList<String> br = new ArrayList<>();
	    return br;
}
		ArrayList<String> mr = new ArrayList<>();
		
		ArrayList<String> rrh = getmazepath(cr+1,cc,er,ec);
		for(String rrs : rrh) {
			mr.add("V"+rrs);
		}
		
	
		ArrayList<String> rrv = getmazepath(cr,cc+1,er,ec);
		for(String rrs : rrv) {
			mr.add("H"+rrs);
		
		
	}
		return mr;
}
}
