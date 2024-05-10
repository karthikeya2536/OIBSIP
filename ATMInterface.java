import java.util.Scanner;

public class ATM_Interface {

    public static void main(String args[]) {
        int balance = 5000, withdraw = 0, deposit = 0;
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                System.out.println("-----------------------------------");
                System.out.println("|---- Automated Teller Machine ----|");

                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 1 for Withdraw                 |");
                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 2 for Deposit                  |");
                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 3 for Check Balance            |");
                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 4 for Transaction History      |");
                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 5 for Transfer Money           |");
                System.out.println("-------------------------------------------");
                System.out.println("|   Choose 6 for EXIT                     |");
                System.out.println("-------------------------------------------");
                System.out.println("Choose the operation you want to perform:");
                int n = s.nextInt();
                switch (n) {
                    case 1 -> {
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = s.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("---------------------------------------------");
                            System.out.println("|   Money Withdraw Successfully !!!          |");
                            System.out.println("|   Please collect your money                |");
                            System.out.println("---------------------------------------------");
                        } else {
                            System.out.println("Insufficient Balance");
                            System.out.println("Please Check Your Balance");
                        }
                        System.out.println("");
                    }

                    case 2 -> {
                        System.out.print("Enter money to be deposited:");
                        deposit = s.nextInt();
                        balance = balance + deposit;
                        System.out.println("---------------------------------------------");
                        System.out.println("| Your Money has been successfully depsited |");
                        System.out.println("---------------------------------------------");
                        System.out.println("");
                    }

                    case 3 -> {
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                    }

                    case 4 -> {
                        System.out.println("|Transaction History            |");
                        System.out.println("|Depodite Ammount : " + deposit + "   |");
                        System.out.println("|Withdraw Ammount : " + withdraw + "  |");
                    }

                    case 5 -> {
                        int amount;
                        System.out.println("Enter The Account No : ");
                        s.nextInt();
                        System.out.println("Enter The Amount  : ");
                        amount = s.nextInt();
                        if (balance >= amount) {
                            balance = balance - amount;
                            System.out.println("---------------------------------------------");
                            System.out.println("|   Transfer Money Successfully !!!          |");
                            System.out.println("---------------------------------------------");
                        } else {
                            System.out.println("Insufficient Balance");
                            System.out.println("Please Check Your Balance");
                        }
                    }

                    case 6 -> System.exit(0);
                }
            }
        }
    }

}
