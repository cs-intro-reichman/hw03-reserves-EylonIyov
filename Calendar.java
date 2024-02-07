public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
        int newYear = Integer.parseInt(args[0]);
	 	while (year < newYear) { 		
	 	    advance();
		}
		while (year == newYear) {
            if(dayOfWeek == 2){
                System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                }
            else{
                System.out.println(dayOfMonth + "/" + month + "/" + year);
        }
        advance();
        }
    }
	 private static void advance() {
		dayOfWeek ++;
		dayOfMonth ++;
		if (dayOfWeek == 8){
            dayOfWeek = 1;
        }
        if (dayOfMonth > nDaysInMonth(month, year)){
            dayOfMonth = 1;
            month ++;
        }
        if (month == 13) {
            month = 1;
            year ++;
        }  
		}

		
	
 
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year1) {
		return year1 % 4 ==0 || (year1 % 4 == 0 && year1 % 100 != 0);
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month1, int year) {
		if ( month1 == 2){
			if (isLeapYear(year)){
				return 29;
			}else{
				return 28;
			}
		}
		if (has30(month1)){
			return 30;
		}
		if (has31(month1)){
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

