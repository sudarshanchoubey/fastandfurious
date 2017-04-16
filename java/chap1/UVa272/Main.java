import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        
        int c;
        while((c = System.in.read()) != -1) {
            if (c == '"') {
                System.out.format("``");
                boolean found = true;
                while(found && (c = System.in.read()) != -1) {
                    if (c == '"') {
                        System.out.format("''");
                        found = false;
                    } else {
                        System.out.write(c);
                    }
                }
            } else {
                System.out.write(c);
            }
        }
    }
}
