import java.util.Scanner;

public class game {
    public static void numbergame() {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int) (100 * Math.random());
        int i, guess, k = 5;
        System.out.println("The system has choosen the number between 1 and 100");
        for (i = 0; i < k; i++) {
            System.out.println("guess the number between 1 and 100"
            );
            guess = sc.nextInt();
            if (num == guess) {
                System.out.println("the guess is correct");
                break;
            } else if (num > guess) {
                System.out.println("the guess is smaller than the number");
            } else if (num < guess) {
                System.out.println("the guess is larger than the number");
            }
        }
        if (i == k) {
            System.out.println("your chances are over");
            System.out.println("the correct number is " + num);
        }
    }

    public static void main(String args[]) {
        numbergame();
    }
}
