import java.util.Scanner;

public class methodd {
    public static void main(String[] args) {

        String text = " ";
        int length = 0;
        int index = 0;

        System.out.println("Please enter a word");
        Scanner keyboard = new Scanner(System.in);
        text = keyboard.next();
        length = text.length();

        System.out.println("Enter a number as index: ");
        index = keyboard.nextInt();

        if(index >= length){
            System.out.println("Index is larger than length");
        }else if(index >= 0 && index < length){
            System.out.println("The length of " + text + " is: " + text.length());
            System.out.println("The substring from 0-" + index + " is " + text.substring(0, index));
        }
    }

}