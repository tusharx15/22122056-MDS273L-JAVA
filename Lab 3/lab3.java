import java.util.Scanner; // used for taking user inputs.

class lab3 {
    String name[] = new String[1024]; // creating an array with size 1024
    Scanner sc = new Scanner(System.in);

    int c = 0;

    void details(String arr[][]){ // function for entering the details of the student(s)
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Please enter the details of the student as follows: ");
        System.out.println("----------------------------");
        System.out.println("Please enter the Name of the student: ");
        System.out.println("------------------------------------");
        String Name = sc.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Please enter the Registration Number of the student: ");
        System.out.println("----------------------------------------");
        String RegNo = sc.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Please enter the Email of the student: ");
        System.out.println("----------------------------------------");
        String Email = sc.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Please enter the student's Programme: ");
        System.out.println("----------------------------------------");
        String Prog = sc.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Please enter the student's Course: ");
        System.out.println("----------------------------------------");
        String Course = sc.nextLine();
        

        for(int i=0;i<name.length;i++){
            if(Name.equalsIgnoreCase(name[i])){
                System.out.println("Name already exists.");
                
            }

            else{
                name[c] = Name;
                int j=0;
    
                arr[c][j] = Name;
                arr[c][j+1] = RegNo;
                arr[c][j+2] = Email;
                arr[c][j+3] = Prog;
                arr[c][j+4] = Course;
                c=c+1;
                break;    
                    
                }


            }
        

        }

    void Student(String arr[][]) { // function for displaying the details of a student who has been
                                   // selected by the user
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter the name of the student whose details you want: ");
        String snm = sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            if (snm.equalsIgnoreCase(name[i])) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(arr[i][j]);
                }
                break;
            }
        }

    }

    void Search(String arr[][]) { // function for searching the details of the specified student
        System.out.println("Which student's details do you want? ");
        String dnm = sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            if (dnm.equalsIgnoreCase(name[i])) {
                System.out.println("Name is found at position " + (i + 1)); // to display the position of the student
                
                System.out.println("The details of the student are: ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(arr[i][j]);

                }
            }
        }

    }

    public static void main(String[] args) { // this is the main function.
        String arr[][]=new String[1024][1024]; // here we create a two-dimensional array of size 1024
        lab3 obj=new lab3();
        boolean flag=false;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("--------Welcome------");
            System.out.println("--------This is the Student Portal------------");
            System.out.println("1- Enter student details");
            System.out.println("2- Display the details");
            System.out.println("3- Search the student's details");
            System.out.println("4- Exit the Student Portal");
            int choice = Integer.parseInt(scan.nextLine());
            if(choice==1){
                flag =true;
                obj.details(arr);

            }
            else if(choice==2){
                flag=true;
                obj.Student(arr);

            }
            else if(choice==3){
                flag=true;
                obj.Search(arr);
            }
            else if(choice==4){
                flag = false;
                System.out.println("Successfully exit the Student Portal!");
            }
            

            else{
                System.out.println("--------------Invalid Choice! Please Make A Valid Choice-------------");
            }
            // depending on the choice of the User, the programme will run accordingly

        }while(flag);
          
    }

}