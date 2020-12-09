package questionOne;

public class QuestionOne {

	// genel iþlem kýsaca þudur:
	// iþaretlenen satýr ve sütunun kesiþimleri alýnýr ve yazdýrýlýr.
	static void spiralMatix(int endRowIndex, int endColumnIndex, int matrix[][]) {
		int iterator;
		int startRowIndex = 0;
		int startColumnIndex = 0;

		while (startRowIndex < endRowIndex && startColumnIndex < endRowIndex) {
			
			// Soldan saða
			for (iterator = startColumnIndex; iterator < endColumnIndex; ++iterator) {
				System.out.print(matrix[startRowIndex][iterator] + " ");
			} 
			startRowIndex++;

			// Yukarýdan aþaðý
			for (iterator = startRowIndex; iterator < endRowIndex; ++iterator) {
				System.out.print(matrix[iterator][endColumnIndex - 1] + " ");
			}
			endColumnIndex--;

			// Saðdan sola
			if (startRowIndex < endRowIndex) {
				for (iterator = endColumnIndex - 1; iterator >= startColumnIndex; --iterator) {
					System.out.print(matrix[endRowIndex - 1][iterator] + " ");
				}
				endRowIndex--;
			}
			
			// Aþaðýdan yukarý
			if (startColumnIndex < endRowIndex) { 
				for (iterator = endColumnIndex - 1; iterator >= startRowIndex; --iterator) {
					System.out.print(matrix[iterator][startColumnIndex] + " ");
				}
				startColumnIndex++;
			}
		}

	}

	public static void main(String[] args) {

		int rowNumber = 5;
		int columnNumber = 5;

		int matrix[][] = {
				{ 1, 2, 3, 4, 5 }, 
				{ 16, 17, 18, 19, 6 }, 
				{ 15, 24, 25, 20, 7 }, 
				{ 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } 
				};
		
		spiralMatix(rowNumber, columnNumber, matrix);

	}
}