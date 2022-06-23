package Polindrom;

import java.util.Scanner;

public class PalindromKelime {

	static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word= input.nextLine();
        if (isPalindrome(word)){
            System.out.println(word+" Palindrom kelime!");
        }else {
            System.out.println(word+" Palindrom kelime degil!");
        }	
        input.close();
	}	
}
