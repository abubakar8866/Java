package string_stringBuffer_stringBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str1 = new String("abuidpofa");

		// Write a program to reverse a String.

		/*for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i) + " ");
		}*/

		// Write a program to check whether a String is palindrome.

		/*
		 * int left = 0, right = str1.length() - 1; int mid = left + (right - left) / 2;
		 * boolean isPalindrome = true; for (int i = 0; i <= mid; i++) { if
		 * (str1.charAt(left) != str1.charAt(right)) { isPalindrome = false; break; }
		 * left++; right--; } System.out.println(isPalindrome);
		 */

		// Write a program to count vowels and consonants in a String.

		/*
		 * int vowCount = 0; String vow = "aeiouAEIOU"; for (int i = str1.length() - 1;
		 * i >= 0; i--) {
		 * 
		 * if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
		 * || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') { vowCount++; } else {
		 * consCount++; }
		 * 
		 * for (int j = 0; j < vow.length(); j++) { if (vow.charAt(j) == str1.charAt(i))
		 * { vowCount++; } }
		 * 
		 * }
		 * 
		 * System.out.println(vowCount); System.out.println(str1.length() - vowCount);
		 */

		// Write a program to count number of words in a sentence.

		/*
		 * String sentence = "Hello! from Java    Programming!!"; String[] words =
		 * sentence.trim().split("\\s+"); System.out.println(words.length);
		 */

		// Write a program to find duplicate characters in a String.
		// String str = "bbu";

		/*
		 * HashSet<Character> charSet = new HashSet<Character>(); boolean isDuplicate =
		 * false;
		 * 
		 * for (Character character : str.toCharArray()) { if (!charSet.add(character))
		 * { isDuplicate = true; break; } }
		 * 
		 * System.out.println(isDuplicate);
		 */

		/*
		 * boolean isDuplicate = false;
		 * 
		 * for (int i = 0; i < str.length(); i++) { for (int j = 1; j < str.length();
		 * j++) { if (str.charAt(i) == str.charAt(j)) { isDuplicate = true; break; } } }
		 * System.out.println(isDuplicate);
		 */

		// Write a program to remove duplicate characters from a String.

		/*
		 * String str = "aabaau"; String result = "";
		 * 
		 * for (int i = 0; i < str.length(); i++) { if (result.indexOf(str.charAt(i)) ==
		 * -1) { result += str.charAt(i); } } System.out.println(result);
		 */

		// Write a program to find first non-repeating character in a String.
		// String str = "!abu#";

		/*
		 * Map<Character, Integer> charCount = new LinkedHashMap<>();
		 * 
		 * for (Character c : str.toCharArray()) { charCount.put(c,
		 * charCount.getOrDefault(c, 0) + 1); }
		 * 
		 * for (Map.Entry<Character, Integer> mapChar : charCount.entrySet()) { if
		 * (mapChar.getValue() == 1) {
		 * System.out.println("so first non repeating character is " +
		 * mapChar.getKey()); break; } }
		 * 
		 * String str = "abubakar";
		 * 
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i); if
		 * (str.indexOf(c) == str.lastIndexOf(c)) { System.out.println(c); break; } }
		 */

		// Check whether two Strings are Anagrams

		/*String s1 = "listen";
		String s2 = "silent";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(Arrays.equals(c1, c2));
*/
		// Count frequency of each character
		// str = "aabaau";

		/*
		 * Map<Character, Integer> map = new HashMap<>();
		 * 
		 * for (char ch : str.toCharArray()) { map.put(ch, map.getOrDefault(ch, 0) + 1);
		 * }
		 * 
		 * System.out.println(map);
		 * 
		 * int[] count = new int[128];
		 * 
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i); count[c]++;
		 * }
		 * 
		 * for (int i = 0; i < count.length; i++) { if (count[i] >= 1) {
		 * System.out.println((char) i + " : " + count[i]); } }
		 */

		// Replace spaces with special characters
		// String str = "Java is fun";
		// System.out.println(str.replace(" ", "@"));

		// Convert String to upper & lower case

		/*
		 * String str = "Java";
		 * 
		 * System.out.println(str.toUpperCase()); System.out.println(str.toLowerCase());
		 */

		// Check whether String contains only digits

		/*
		 * String str = "1@#$ADFdfgDELETE2346as"; int[] arr = new int[128]; int
		 * controlChar = 0, space = 0, digits = 0, upperCase = 0, lowerCase = 0, symbol
		 * = 0, del = 0;
		 * 
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i); arr[c]++; }
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (i >= 0 && i <= 31 && arr[i] >= 1)
		 * { controlChar += arr[i]; } else if (i == 32 && arr[i] >= 1) { space +=
		 * arr[i]; } else if (i >= 48 && i <= 57 && arr[i] >= 1) { digits += arr[i]; }
		 * else if (i >= 65 && i <= 90 && arr[i] >= 1) { upperCase += arr[i]; } else if
		 * (i >= 97 && i <= 122 && arr[i] >= 1) { lowerCase += arr[i]; } else if ((i >=
		 * 33 && i <= 47 && arr[i] >= 1) || (i >= 58 && i <= 64 && arr[i] >= 1) || (i >=
		 * 91 && i <= 96 && arr[i] >= 1) || (i >= 123 && i <= 126 && arr[i] >= 1)) {
		 * symbol += arr[i]; } else if (i == 127 && arr[i] >= 1) { del += arr[i]; } }
		 * 
		 * System.out.println( "Control character = " + controlChar + ",Space = " +
		 * space + ",digits = " + digits + ",Uppercase = " + upperCase + ",Lowercase = "
		 * + lowerCase + ",Symbol = " + symbol + ",delete = " + del);
		 */

		// Remove all white spaces from String
		// String str = "I love to code in java language";
		// System.out.println(str.replaceAll("\\s+", ""));

		// Find longest word in a sentence

		/*
		 * String str = "Java is very powerful  language!!"; String[] words =
		 * str.split(" ");
		 * 
		 * String longest = "";
		 * 
		 * for (String word : words) { if (word.length() > longest.length()) { longest =
		 * word; } }
		 * 
		 * System.out.println(longest);
		 */

		// Swap two Strings without third variable

		/*
		 * String a = "Hello"; String b = "World";
		 * 
		 * a = a + b; b = a.substring(0, a.length() - b.length()); a =
		 * a.substring(b.length());
		 * 
		 * System.out.println(a + " " + b);
		 */

		// Check substring present or not

		/*
		 * String str = "Java Programming"; String sub = "Program";
		 * 
		 * System.out.println(str.contains(sub));
		 */

		// Compare Strings using equals() and ==

		/*
		 * String s1 = new String("Java"); String s2 = new String("Java");
		 * 
		 * System.out.println(s1.equals(s2)); System.out.println(s1 == s2);
		 */

		// Count occurrences of a character

		/*
		 * String str = "aabaau"; char target = 'a'; int count = 0;
		 * 
		 * for (char ch : str.toCharArray()) { if (ch == target) count++; }
		 * 
		 * System.out.println(count);
		 */

		// Convert String ↔ char array

		/*
		 * String str = "Java";
		 * 
		 * char[] arr = str.toCharArray(); String newStr = new String(arr);
		 * 
		 * System.out.println(newStr);
		 */

		// Reverse words in a sentence
		String str = "Java is rakabuba";
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
