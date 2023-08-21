import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number between 1 and 7: ");
        int daynumber = scan.nextInt();

        String dayOfWeek;

        switch (daynumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }

        System.out.println("Corresponding day of the week: " + dayOfWeek);

        scan.close();
    }
}
