package ua.lviv.lgs.Lesson_11_2;

import java.util.Random;
import java.util.Arrays;

public class Application2 {
public static void main(String[] args) {
	


	
	String [] material = {"leather", "alcantara"};
    int sizeCol = rand(1,3);
    int sizeRow = rand(1,3);
   
    Auto [] [] array = new Auto[sizeCol][sizeRow];
  
	for (int i=0;i<sizeCol;i++) {
		for (int j=0;j<sizeRow;j++) {
			array[i][j] = new Auto(rand(10,120),rand(2000,2019), new Kermo(rand(30,90), material[rand(0,1)]), new Engine(rand(4,12)));
		}
	}
	
	
   System.out.println(Arrays.deepToString(array));
	
	Auto auto = new Auto(rand(10,120),rand(2000,2019), new Kermo(rand(30,90), material[rand(0,1)]), new Engine(rand(4,12)));

	Auto array1[] = new Auto[1];

	Arrays.fill(array1, auto);
	
	System.out.println(Arrays.deepToString(array1));


}    
static int rand(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("Error min_max");
	}
	Random arrValue = new Random();
	return arrValue.nextInt(max - min + 1) + min;
}
}