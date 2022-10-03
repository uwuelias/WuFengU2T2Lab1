import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ChatBot debbie=new ChatBot("Debbie", 21);
        System.out.println("What is your name?");
        String username=scan.nextLine();
        debbie.greeting(username);
        System.out.println("How old are you?");
        int age=scan.nextInt();
        debbie.agediff(age);
        System.out.println("What is your hobby?");
        debbie.hobby();
        System.out.println("Pick a number between 1-10 inclusive.");
        int number=scan.nextInt();
        System.out.println("My number is "+debbie.number());
        if (debbie.number()==number) {
            System.out.println("You got it right!");
        }
        else {
            System.out.println("You got it wrong.");
        }
        System.out.println("The product of the 3 and 10 is "+debbie.product());
        System.out.println("What is 10*5?");
        int answer=scan.nextInt();
        if (debbie.answer()==answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong!.");
        }
        debbie.joke();
        debbie.farewell();
    }

}
