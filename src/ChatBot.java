public class ChatBot {
    public ChatBot(String name, int age) {
        name=name;
        age=age;
    }
    public void greeting(String username) {
        System.out.println("Hello "+username+"! Today is a great day.");
    }
    public void agediff(int age) {
        System.out.println("I am 21 years old and you are " + age + " years old.");
        if (21 > age) {
            System.out.println("It seems like I'm older than you.");
        }
        if (21 < age) {
            System.out.println("It seems like your older than me.");
        }
        if (21==age) {
            System.out.println("It seems like we're the same age");
        }
    }
    public void hobby() {
        System.out.println("Oh! I like to listen to music.");
    }
    public int number() {
        return (int)(Math.random()*10);
    }
    public int product() {
        return 30;
    }
    public void farewell() {
        System.out.println("Goodbye!");
    }
    public int answer() { //answer of the question
        return 50;
    }
    public void joke() { //tells a funny joke
        System.out.println("What did the fish say when he swam into a wall?");
        System.out.println("DAM.");
    }
    }

