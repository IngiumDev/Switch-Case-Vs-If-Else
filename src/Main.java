public class Main {
    public static void main(String[] args) {
        // Months of the year as if & else
        int currentmonth = 2;
        // Checks what currentmonth is and prints the month using if-else
        System.out.println("The month is ");
        if (currentmonth == 1) {
            System.out.println("January");
        } else if (currentmonth == 2) {
            System.out.println("February");
        } else if (currentmonth == 3) {
            System.out.println("March");
        } else if (currentmonth == 4) {
            System.out.println("April");
        } else if (currentmonth == 5) {
            System.out.println("May");
        } else if (currentmonth == 6) {
            System.out.println("June");
        } else if (currentmonth == 7) {
            System.out.println("July");
        } else if (currentmonth == 8) {
            System.out.println("August");
        } else if (currentmonth == 9) {
            System.out.println("September");
        } else if (currentmonth == 10) {
            System.out.println("October");
        } else if (currentmonth == 11) {
            System.out.println("November");
        } else if (currentmonth == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid month");
        }
        // Checks what currentmonth is and prints the month using switch-case
        System.out.println("The month is ");
        switch (currentmonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        // Checks what currentmonth is and prints the month using enhanced switch-case
        System.out.println("The month is ");
        switch (currentmonth) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        }
    }

}
