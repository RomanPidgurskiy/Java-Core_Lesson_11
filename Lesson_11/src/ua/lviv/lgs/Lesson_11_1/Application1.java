package ua.lviv.lgs.Lesson_11_1;

import java.util.Random;
import java.util.Arrays;

import java.util.Collections;

public class Application1 {

	public static void main(String[] args) {
 
		Integer [] arrayInt = {getRandom(),getRandom(),getRandom(),getRandom(),getRandom(),getRandom()}; 
	    System.out.println(Arrays.toString(arrayInt));
		Arrays.sort(arrayInt);
		System.out.println(Arrays.toString(arrayInt));
	    
		Arrays.sort(arrayInt, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrayInt));
}	
	
  public static int getRandom() {
	
	  
	  int max = 100;
	  int min = 0;
	  Random rand = new Random();
	  return rand.nextInt(max-min+1)+min;
	  
}

}
