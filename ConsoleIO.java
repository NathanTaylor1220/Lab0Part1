import java.util.Scanner;
/**
 * Console I/O example
 * @author Nathan Taylor
 * @version 9/14/2026
 */
public class ConsoleIO
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        keyboard.close();
        System.out.println(name + " says Java is fun.");
    }
}