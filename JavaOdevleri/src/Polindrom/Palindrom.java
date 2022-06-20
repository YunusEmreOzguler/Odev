package Polindrom;

public class Palindrom {
	
	static boolean isPalindrom(int n) {
        int temp=n,lastNumber,reverseNumber = 0;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) +lastNumber;
            temp /= 10;
        }
        if(reverseNumber == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(1907091));

    }
}
