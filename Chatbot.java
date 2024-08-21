import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();
  
        scan.nextLine();
        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String city = scan.nextLine();
                        
        scan.nextLine();
        System.out.println("I hear it's beautiful at " + city + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("So you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (double)(400/age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language?");
        String code = scan.nextLine();

        scan.nextLine();
        System.out.println(code + ", that's great! Nice chatting with you <name>. I have to log off now. See ya!");
        scan.close();
    }
}