package testOcp;

public class StudentUtil {

	public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] result = new double[studentIdList.length];
		int studentNumber = 0;
		for (int i = 0; i < studentsGrades.length; i++) {
			// for (char[] a : studentsGrades) {
			int sum = 0;
			int count = 0;
			studentNumber++;
			for (int j = 0; j < studentsGrades[i].length; j++) {
				// for (char b : a) {
				count++;

				switch (studentsGrades[i][j]) {
				case 'A':
					sum += 4;
					break;
				case 'B':
					sum += 3;
					break;
				case 'C':
					sum += 2;
					break;
				}

			}
			result[studentNumber - 1] = (double) sum / count;
		}

		return result;
	}

	/*
	 * public static double[] calculateGPA(int[] studentIdList, char[][]
	 * studentsGrades) { double[] result = new double[studentIdList.length]; int
	 * studentNumber = 0; for (char[] a : studentsGrades) { int sum = 0; int count =
	 * 0; studentNumber++; for (char b : a) { count++;
	 * 
	 * switch (b) { case 'A': sum += 4; break; case 'B': sum += 3; break; case 'C':
	 * sum += 2; break; }
	 * 
	 * } result[studentNumber - 1] = (double) sum / count; }
	 * 
	 * return result; }
	 */
	public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
		// perform parameter validation. Return null if passed parameters are not valid
		if (lower < 0 || higher < 0 || lower > higher) {
			return null;
		} else {
			int position = 0;
			int studentsCount = 0;
			double[] gpa = calculateGPA(studentIdList, studentsGrades);
			for (double a : gpa) {
				studentsCount += ((a < lower) || (a > higher)) ? 0 : 1;
			}
			int[] studentsIDs = new int[studentsCount];

			for (int i = 0; i < gpa.length; i++) {
				if (((gpa[i] < lower) || (gpa[i] > higher))) {

				} else {
					studentsIDs[position] = studentIdList[i];
					position++;
				}
			}

			return studentsIDs;
		}
		// invoke calculateGPA

		// construct the result array and return it. You would need an extra for loop to
		// compute the size of the resulting array

	}

	public static void main(String[] args) {
		int[] pokus = getStudentsByGPA(3.2, 3.5, new int[] { 1001, 1002, 1003 },
				new char[][] { { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' }, { 'A', 'B', 'B' } });
		for (int a : pokus) {
			System.out.println(a);
		}
		int f= 'a';
		System.out.println(f);
		
		Integer i1 = Integer.valueOf(5000);
		Integer i2 = Integer.valueOf(5000);
		System.out.println(i1==i2);

	}

}
