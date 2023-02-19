package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int isLeapYear;
        isLeapYear = year % 4 == 0 ? 0 : 1;
        isLeapYear = (isLeapYear == 0) && (year % 100 != 0 || year % 400 == 0) ? 0 : 1;


        switch (isLeapYear) {
        case 0:
            System.out.println("leap");
            break;
        case 1:
            System.out.println("not leap");
            break;
        default:
            break;
        }
    }
}
