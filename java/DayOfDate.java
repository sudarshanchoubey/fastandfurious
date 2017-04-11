import java.time.LocalDate;

public class DayOfDate {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java DayOfDate <yyyy> <mm> <dd>");
        }
        LocalDate ld = LocalDate.of(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println(ld.getDayOfWeek());
    }
}

