import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter(;
        while (sc.hasNext()) {
            char[] token = sc.next("[^\"]*\"[^\"]*\"").toCharArray();
            int first = 0;
            for (int i = 0; i < token.length; i++) {
                if (token[i] == '"') {
                    if(first == 0) {
            

