public class BaseConverter {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java BaseConverter <number> <original base> <final base>");
        }
        System.out.println(Integer.toString(Integer.parseInt(args[0], Integer.parseInt(args[1])),Integer.parseInt(args[2])));
    }
}
