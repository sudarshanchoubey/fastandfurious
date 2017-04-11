import java.util.Scanner;

/*
 * 3n + 1 problem
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.format("%d %d %d\n", i, j, solution(Math.min(i,j), Math.max(j,i)));
        }
    }

    private static int solution(int i, int j) {
        int max = 0;
        for (int c = i; c <= j; c++) {
            int res = runAlgo(c);
            max = Math.max(res, max);
        }
        return max;
    }

    private static int runAlgo(int n) {
        int count = 1;
        while(n != 1) {
            if (n % 2 != 0) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
            count++;
        }
        return count;
    }
}
