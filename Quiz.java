import java.util.Scanner;
public class Quiz {

    static void Question(String str) {
        System.out.println(str);
    }

    static void Answer(String key) {
        Scanner scannerObj = new Scanner(System.in);
        String str = scannerObj.nextLine();
        
        while (!(str.toLowerCase().equals(key.toLowerCase()))) {
            System.out.println("Wrong Answer, Try again!");
            str = scannerObj.nextLine();
        }
        
        System.out.println("Correct Answer!");
    }

    static void UserInput() {
        Question("What is the capital of India?");
        Answer("Delhi");

        Question("Who is the president of India?");
        Answer("Droupadi Murmu");
    }

    public static void main(String args[]) {
        UserInput();
    }

}
