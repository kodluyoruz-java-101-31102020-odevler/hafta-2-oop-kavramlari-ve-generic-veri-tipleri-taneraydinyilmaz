package questionThree;

import java.util.*;

public class QuestionThree { 
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Önerilen Boyut 10 :) \nDizi Boyutu Girin: ");
		DuplicateRecord.array(input.nextInt());
		DuplicateRecord.printRecord();

	}
}
