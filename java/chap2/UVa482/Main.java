import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++) {
            sc.nextLine();
            String indexLine = sc.nextLine();
            String[] indices = indexLine.split(" ");
            String[] values = new String[indices.length + 1];
            for (int j = 1; j <= indices.length; j++) {
                values[Integer.parseInt(indices[j-1])] = sc.next();
            }
            for (int j = 0; j < indices.length; j++) {
                System.out.println(values[j+1]);
            }
            if (i != (N - 1))
                System.out.println();
            sc.nextLine();
        }
    }
}

