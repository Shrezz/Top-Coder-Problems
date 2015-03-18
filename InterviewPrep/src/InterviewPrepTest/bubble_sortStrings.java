package InterviewPrepTest;

import java.util.Arrays;

public class bubble_sortStrings {
	public static void main(String[] args) {

		//char[] s1 = "eoksb".toCharArray();
		//char[] s2 = "sboek".toCharArray();
		char[] s1 = "abc".toCharArray();
		char[] s2 = "bac".toCharArray();
		
		transpose(s1, s2);
	}

	public static void transpose(char[] s1, char[] s2) {

		int i = 0; int count =0;
		while (i < s2.length) {
			if (s2[i] == s1[i]) {
				i++;
				continue;
			} else {
				for (int j = i; j < s1.length - 1; j++) {
					char temp = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = temp;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(count);
	}
}
