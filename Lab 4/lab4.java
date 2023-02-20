import java.util.Scanner;

class BankDetails { // parent class for using in the public/main class
    private String acc_no;
    private String acc_name;
    private String acc_type;
    private long acc_balance;
    Scanner sc = new Scanner(System.in);

    // To open account
    public void OpenAccount() {
        System.out.println("------------------------");
        System.out.print("Enter the account number: ");
        acc_no = sc.next();
        System.out.println("--------------------------------");
        System.out.print("Enter the account name: ");
        acc_name = sc.next();
        System.out.println("-----------------------------");
        System.out.print("Enter the account type: ");
        acc_type = sc.next();
        System.out.println("-----------------------------------");
        System.out.print("Enter your account balance: ");
        acc_balance = sc.nextLong();
    }

    // Show accounnt details
    public void ShowAccount() {
        System.out.println("--------------------");
        System.out.println("Account Holder's Name: " + acc_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Account Balance: " + acc_balance);
    }

    // To deposit amount
    public void deposit() {
        long amount;
        System.out.print("What Amount Are You Depositing? : ");
        amount = sc.nextLong();
        acc_balance = acc_balance + amount;
        System.out.println("---------------------");
        System.out.println(amount + " has been deposited in your account successfully!");
        System.out.println("Updated Balance is: " + acc_balance);
        System.out.println("------------------------------");
    }

    // To withdraw the amount
    public void withdraw() {
        long amount;
        System.out.print("Enter the amount you want to withdraw: ");
        amount = sc.nextLong();
        if (acc_balance >= amount) {
            acc_balance = acc_balance  - amount;
            System.out.print("Updated balance is: " + acc_balance);
        } else {
            System.out.print("Insufficient Funds to be Withdrawn!");
        }
    }

    public void transactions() {
        System.out.println("-----------------------");
        System.out.println("The Transaction History of your account is as follows: ");
    }

    // method to search an account number
    public boolean search(String ac_no) {
        if (acc_no.equals(ac_no)) {
            ShowAccount();
            return (true);
        }
        return (false);
    }
}

public class lab4 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        // Creating account for initialisation
        System.out.print("Enter the number of customers you wish to initialise in the bank app: ");
        int n = scan.nextInt();
        BankDetails C[] = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].OpenAccount();
        }

        int choice;
        do {
            System.out.println("\n **Banking System Application**");
            System.out.println(
                    "1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].ShowAccount();
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------");
                    System.out.print("Please enter the account number you wish to search for: ");
                    String ac_no = scan.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("*******************************************");
                        System.out.println("OOPS! Account doesn't exist..!!");
                        System.out.println("Please try again!");
                        System.out.println("************************************************");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = scan.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("*******************************************");
                        System.out.println("OOPS! Account doesn't exist..!!");
                        System.out.println("Please try again!");
                        System.out.println("************************************************");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = scan.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("---------------------------------------");
                        System.out.println("OOPS!");
                        System.out.println("Account doesn't exist..!!");
                        System.out.println("Please Try Again!");
                        System.out.println("----------------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("----------------------------------");
                    System.out.println("SUCCESSFULLY EXIT THE PROGRAM! ");
                    System.out.println("-------------------------------------");
                    break;
            }
        } while (choice != 5);
    }
}