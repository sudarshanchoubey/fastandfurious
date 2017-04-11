import java.util.Scanner;
import java.util.regex.MatchResult;

public class FormattedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(sc.next("(0.\\d+)..."));
        }
    }
}
