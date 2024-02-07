/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int i =1; i<13; i++){
			System.out.println("The month " + i + " has " + nDaysInMonth(i, year));
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		return year % 4 ==0 || (year % 4 == 0 && year % 100 != 0);
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		if ( month == 2){
			if (isLeapYear(year)){
				return 29;
			}else{
				return 28;
			}
		}
		if (has30(month)){
			return 30;
		}
		if (has31(month)){
			return 31;
		}
	return 0;
	}

	


	public static boolean has31(int i){
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
			return true;
		}else{
			return false;
		}
	
	}
	public static boolean has30(int i){
		if (i == 4 || i == 6 || i == 9 || i == 11 ){
			return true;
		}else{
			return false;
		}
	}
}


