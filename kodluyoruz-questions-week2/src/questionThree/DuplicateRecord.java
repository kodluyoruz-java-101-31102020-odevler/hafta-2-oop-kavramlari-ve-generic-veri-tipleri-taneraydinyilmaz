package questionThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRecord {

	private static StringBuilder builder = new StringBuilder();
	private static Random rnd = new Random();

	private static List<Integer> fullRecord = new ArrayList<>();
	private static Set<Integer> duplicateRecord = new TreeSet<Integer>();

	public static int[] array(int arraySize) {
		int[] array = new int[arraySize];

		for (int iterator = 0; iterator < array.length; iterator++) {
			array[iterator] = rnd.nextInt(10);
			fullRecord.add(array[iterator]);
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					duplicateRecord.add(array[i]);
			}
		}
		return array;
	}

	public static void printRecord() {
		builder.append("Duplicate Record - ");
		builder.append(duplicateRecord);
		builder.append("\n");
		builder.append("Full Record - ");
		builder.append(fullRecord);
		System.out.println(builder);
	}
 

}
