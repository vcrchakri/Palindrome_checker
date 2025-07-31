import java.util.Scanner;
public class Palindrome_checker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to check if its a palindrome:");
        String input = sc.nextLine();
        if(ispalindrome(input)){
            System.out.println("The sentence is a palindrome.");
        } else{
            System.out.println("The sentence is not a palindrome.");
        }
        sc.close();
        }
        public static boolean ispalindrome(String input){
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }   
}
