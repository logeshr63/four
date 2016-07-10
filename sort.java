# four
package demo;

import com.mtsystems.coot.String8;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		String8 s = new String8(5, 20);
		String8 t = new String8(20);
		System.out.print("\nEnter any five strings : ");
		for(int i = 0; i < 5; i++) {
			s.shift(i, 0).copyFrom(STDIN_SCANNER.next());
		}

		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(s.shift(j - 1, 0).compareTo(s.shift(j, 0)) > 0) {
					t.copyFrom(s.shift(j - 1, 0));
					s.shift(j - 1, 0).copyFrom(s.shift(j, 0));
					s.shift(j, 0).copyFrom(t);
				}
			}
		}

		System.out.print("\nStrings in order are : ");
		for(int i = 0; i < 5; i++) {
			System.out.print("\n" + s.shift(i, 0));
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
