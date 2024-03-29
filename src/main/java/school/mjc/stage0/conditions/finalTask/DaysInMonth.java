package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (year <= 0) {
            System.out.println("Invalid year. Please enter a positive year.");
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a valid month (1-12).");
        }

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println(31);
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println(30);
            case 2:  // February
                System.out.println(((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28);
            default:
                System.out.println("invalid date");
        }

    }
}