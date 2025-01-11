public class DayOfTheWeek {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three command-line arguments: month (m), day (d), and year (y).");
            return;
		}
		
        // Parse the command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year
		
        // Calculate y0, x, m0, and d0
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
		
        
        System.out.println(d0); // It Prints the day of the week (0 = Sunday, 1 = Monday);
	}
}
