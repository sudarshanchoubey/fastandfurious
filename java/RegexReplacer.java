public class RegexReplacer {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println(
              "Usage: java RegexReplacer <string> <regex> <replacement>");
        }
        System.out.println(args[0].replaceAll(args[1], args[2]));
    }
}
//java RegexReplacer "a70 z72 and aa23 a872" "\b\w\p{Digit}{2}" "***"
