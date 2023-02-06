import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        String arr[] = new String[1024];
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("------WELCOME------");
        int i =0;
        do {
            System.out.println("Welcome to Menu Program. You have the following options available: ");
            System.out.println("1: Enter a Name.");
            System.out.println("2: Search a Name.");
            System.out.println("3: Remove a Name.");
            System.out.println("Please choose what you want to perform: ");
            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("You have chosen to ENTER a Name.");
                    System.out.println("Please enter the name you wish to enter: ");
                    String NAME = scan.nextLine();
                    arr[i] = NAME;
                    i+=1;
                    if(arr[i].equalsIgnoreCase(NAME)){
                        continue;
                    }else{
                        System.out.println("----------");
                        System.out.println("Oops!");
                        System.out.println("The NAME already exists.");
                        System.out.println("Please enter a valid name.");
                        System.out.println("------------");
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.println("You have chosen to SEARCH a Name.");
                    System.out.println("--------------------------------");
                    System.out.println("Kindly enter the name you wish to search for: ");
                    String search = sc.nextLine();
                    for (j = 0; j < arr.length; j++) {
                        if (search.equals(arr[j])) {
                            System.out.println("Name is found at position " + (j + 1));
                            System.out.println(search);
                    break;
                case 3:
                    System.out.println("You have chosen to REMOVE a Name.");
                    break;
            }
            System.out.println("Please press 'y' if you want to continue the program!");
            ch = scan.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        System.out.println("-------------------");
        System.out.println("You have successfully exited the program.");
        System.out.println("See you again :) ");
        System.out.println("------------------");
    }
}