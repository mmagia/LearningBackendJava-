package hometask1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Command cmd;
        do {
            String cmdText = console.nextLine();
            cmd = Command.fromText(cmdText);
            System.out.println(cmd.getReply());
        } while (!cmd.equals(Command.EXIT));
    }
}
