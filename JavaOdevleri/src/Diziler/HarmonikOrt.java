package Diziler;

public class HarmonikOrt {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double harmonicSum = 0;
        for (double j : numbers){
        	harmonicSum += (1 / j);
        }
        System.out.println("Dizinin Harmonik ortalamasi : " + (double)(sum/harmonicSum));
	}

}
