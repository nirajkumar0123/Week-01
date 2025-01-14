public class SpringSeason {
	
    public static boolean isSpringSeason(int month, int day) {
        if (month > 3 && month < 6) {
            return true; // March, April, May
			} else if (month == 3 && day >= 20) {
            return true; // March 20 or later
			} else if (month == 6 && day <= 20) {
            return true; // June 20 or earlier
		}
        return false;
	}
	
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
			} else {
            System.out.println("Not a Spring Season.");
		}
	}
}
