import java.util.Scanner;

public class lab2 {

    static char ch;

    public static void main(String[] args) {
        String arr[] = new String[1024]; // 1024 specifies the length of the array to the computer//
        Scanner scan = new Scanner(System.in); // for taking user input//
        System.out.println("------------WELCOME--------------");
        int i = 0;

        do {
            System.out.println("Welcome to Menu Program.## You have the following options available: ");
            System.out.println("1: Enter a Name.");
            System.out.println("2: Search a Name.");
            System.out.println("3: Remove a Name.");
            System.out.println("Please choose what you want to perform: ");
            int choice = Integer.parseInt(scan.nextLine()); // we use parseInt so that string values are not skipped
            switch (choice) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("You have chosen to ENTER a Name.");
                    System.out.println("------------------------------------");
                    System.out.println("Please enter the name you wish to enter: ");
                    String name = scan.nextLine();
                    boolean add = true;
                    if (i == 0) {
                        add = true;
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (arr[j].equalsIgnoreCase(name)) {
                                add = false;
                            }
                        }
                    }
                    if (add == true) {
                        arr[i] = name;
                        i += 1;
                    } else {
                        System.out.println("-------------OOPS!!!!------------");
                        System.out.println("Name already exists!");
                        System.out.println("-----------------------------");
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.println("You have chosen to SEARCH a Name.");
                    System.out.println("--------------------------------");
                    System.out.println("Kindly enter the name you wish to search for: ");
                    String search = scan.nextLine();
                    for (int j = 0; j < arr.length; j++) {
                        if (search.equals(arr[j])) {
                            System.out.println("Name is found at position " + (j + 1));
                            System.out.println(search);
                        }
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    System.out.println("You have chosen to REMOVE a Name.");
                    System.out.println("--------------------------------------");
                    System.out.println("Please select the name you wish to remove: ");
                    String remove = scan.nextLine();
                    int temp = -1;
                    for (int c = 0; c < i; c++) {
                        if (arr[c].equalsIgnoreCase(remove)) {
                            temp = c;
                        }
                    }
                    if(temp != -1){
                        for (int c = temp; c < i; c++) {
                            arr[c] = arr[c + 1];
                        }
                        i-=1; // '-' because we are removing an element from the array
                    }
                    for(int c=0; c<i;c++){
                        System.out.print(arr[c]+" ");
                    }
                    break;
                default:
                        System.out.println("INVALID CHOICE!!!");
            }
            System.out.println("*******************************************************");
            System.out.println("Please press 'y' if you want to continue the program!");
            System.out.println("***********************************************************");
            ch = scan.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Successfully Quit The Program.");
    }
}


