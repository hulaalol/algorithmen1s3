package boyerMoore;

import java.util.ArrayList;

public class BoyerMoore {

	static String pattern = "whatthefuck";
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		ArrayList<Integer> lastocc = calculateLastOcc(pattern, alphabet);
		
		System.out.print("alphabet");
		for (int i = 0; i < alphabet.toCharArray().length; i++) {
			System.out.print("\t" + alphabet.toCharArray()[i]);
		}
		System.out.println();
		System.out.print("last_occ");
		for (int i = 0; i < lastocc.size(); i++) {
			System.out.print("\t" + lastocc.get(i));
		}
		System.out.println();
		System.out.println();	
				
		int[] suffix = calculateSuffix(pattern);
		int[] match_u = calculateMatchUnsafe(pattern);
		int[] match = calculateMatch(pattern);

		System.out.println();		
		System.out.print("pattern\t");
		for (int i = 0; i < pattern.toCharArray().length; i++) {
			System.out.print("\t" + pattern.toCharArray()[i]);
		}
		System.out.println();
		System.out.print("index\t");
		for (int i = 0; i < pattern.toCharArray().length; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		System.out.println();	
		System.out.print("suffix\t");
		for (int i = 0; i < suffix.length; i++) {
			System.out.print("\t" + suffix[i]);
		}
		System.out.println();
		System.out.println();
		System.out.print("match unsafe");
		for (int i = 0; i < match_u.length; i++) {
			System.out.print("\t" + match_u[i]);
		}
		System.out.println();
		System.out.println();
		System.out.print("match\t");
		for (int i = 0; i < match.length; i++) {
			System.out.print("\t" + match[i]);
		}
		System.out.println();
	}

	static ArrayList<Integer> calculateLastOcc(String pattern, String alphabet) {
		ArrayList<Integer> lastocc = new ArrayList<Integer>();
		
		char[] pattern_arr = pattern.toCharArray();
		int pattern_len = pattern_arr.length;
		
		for (char c : alphabet.toCharArray()) {
			for (int i = pattern_len - 1; i >= 0; i--) {
				if (c == pattern.charAt(i)) {
					lastocc.add(pattern_len - 1 - i);
					break;
				} else {
					if (i == 0) {
						lastocc.add(pattern_len);
					}
				}
			}
		}
		return lastocc;
	}

	static int[] calculateSuffix(String pattern) {
		int len = pattern.length();
		int[] result = new int[len];

		result[len - 1] = len;
		for (int i = 0; i < len - 1; i++) {
			int j = i;
			for (j = i; j >= 0; j--) {
				if (pattern.charAt(j) != pattern.charAt(len - 1 - i + j)) {
					result[i] = i - j;
					break;
				}
			}
			if (j == -1) {
				result[i] = i + 1;
			}
		}
		return result;
	}

	static int[] calculateMatchUnsafe(String pattern) {
		int len = pattern.length();
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = len;
		}

		int[] shift = calculateSuffix(pattern);

		for (int i = len - 1; i >= 0; i--) {
			for (int j = len - 1; j >= 0; j--) {
				if (shift[j] == len - i) {
					result[i] = len - j - 1;
					break;
				}
			}
		}
		return result;
	}

	static int[] calculateMatch(String pattern) {
		int[] matchUnsafe = calculateMatchUnsafe(pattern);

		int len = pattern.length();
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			int prefix = max_prefix(pattern, i);
			result[i] = Math.min(matchUnsafe[i], len - prefix);
		}
		return result;
	}

	static int max_prefix(String pattern, int last_match_index) {
		
		// Der maximale Match geht von last_match_index bis length - 1.
		// Suche in diesem Match das l�ngste Suffix, welches Pr�fix des
		// ganzen Musters ist. Gib die L�nge dieses Suffix zur�ck.
		
		int len = pattern.length();
		int result = 0;
		int i = 0, j = 0;
		boolean hit = true;
		
		for (i = 0; i < len - last_match_index; i++) {
			for (j = i; j >= 0; j--) {
				if (pattern.charAt(j) != pattern.charAt(len - 1 - i + j)) {
					hit = false;
					break;
				}
			}
			if (j == -1 && hit)
				result = i + 1;
			hit = true;
		}
		return result;
	}
}
