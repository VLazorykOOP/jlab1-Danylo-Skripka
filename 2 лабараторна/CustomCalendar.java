import java.util.Calendar;
import java.util.Scanner;

public class CustomCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int day = scanner.nextInt();

        System.out.print("Введіть рік: ");
        int year = scanner.nextInt();

        scanner.close();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, day);

        int month = calendar.get(Calendar.MONTH);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);

        String[] months = new String[]{
            "січня", "лютого", "березня", "квітня", "травня", "червня",
            "липня", "серпня", "вересня", "жовтня", "листопада", "грудня"
        };

        String[] daysOfWeek = new String[]{
            "неділя", "понеділок", "вівторок", "середа",
            "четвер", "п'ятниця", "субота"
        };

        String monthName = months[month];
        String dayOfWeek = daysOfWeek[weekDay];

        System.out.println(day + " " + monthName + ", " + year + ", " + dayOfWeek);
    }
}
