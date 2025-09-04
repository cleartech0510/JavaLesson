import java.util.Scanner;
public class Task4{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String EnterWord = scanner.nextLine();

        StringBuilder sb = new StringBuilder(EnterWord);
        String reversedWord = sb.reverse().toString();
        if(EnterWord.equals(reversedWord)){
            System.out.println("Word is Palindrome");
        }
        else
        {
             System.out.println("Word is not Palindrome");
        }
    }
    }
