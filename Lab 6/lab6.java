import java.io.File; //package imported for file handling
import java.util.*; //package imported for Scanner class

import java.io.*;

class Student{  //creating a Student class
    String Regno; //global variables
    String name;
    String email;
    String phone;
    String sclass;
    String dept;

    Student(String Regno,String name,String email,String phone,String sclass,String dept){ //parametrized constructor
        this.Regno=Regno;
        this.name=name;//initializing the values using 'this' keyword
        this.email=email;
        this.phone=phone;
        this.sclass=sclass;
        this.dept=dept;
    }

    void details(){ //to print the details of a particular student
        System.out.println("----------------");
        System.out.print("Name: "+this.name);
        System.out.print("Reg. No: "+this.Regno);
        System.out.print("Email: "+this.email);
        System.out.print("Phone: "+this.phone);
        System.out.print("Class: "+this.sclass);
        System.out.print("Department: "+this.dept);

    }

    void saveIntoFile(){ //function that creates a file for the particular student
        String filename= "D:\\Lab-1\\22122004-MDS273L-JAVA-\\Lab-6\\details.java"+ Regno+".txt"; //file name of a particular reg no
        String atts=this.name+" "+this.Regno+" "+this.email+" "+this.phone+" "+this.sclass+" "+this.dept; //converts all the input to one string
        

        
    
            try{
                System.out.print("Enter new file name: ");

                File file = new File(filename);

                if (file.exists()) { //to check if file exists
                System.out.println("file exists...");
                } else {
                System.out.println("file does not exist...");
                if (file.createNewFile()) { //if file doesn't exist then create a new file
                    System.out.println("file is created...");

                
                // read from file
                
                FileWriter write = new FileWriter(filename); //file writer class object to write the content to the file
                String inputData = "=========================================================================\n" +
                            "NAME       EMAIL               PHONE        REG.NO.        DEPARTMENT\n" +
                            "--------------------------------------------------------------------------\n" +
                            String.format("%-11s", name) +
                            String.format("%-20s", email) +
                            String.format("%-13s", phone) +
                            String.format("%-15s", Regno) +
                            String.format("%-20s", dept);

                write.write(inputData); //obj[write].function[write]("content")
                write.close();
                System.out.println("Data Saved...");
                } else {
                    System.out.println("Error in file creation...");
                }
            }
    
             

                    
                    
                
    
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    
          

    }

}

public class lab6 { //main function class
    public static void main(String[] args) {

       
        String name, phone, email, clas, department, reg, r, updateReg;

        Student[] st=new Student[100]; //student array
        int c=0;
        int updateChoice;
        Scanner sc=new Scanner(System.in);

        boolean flag=false;
        do{ //menu driven program
            System.out.println("1- Add a Student");
            System.out.println("2-Search for a Student");
            System.out.println("3-Update the details of a Student");
            System.out.println("4-Display the details of all students");
            int ch=Integer.parseInt(sc.nextLine());
            if(ch==1){
                flag=true;
                System.out.print("NAME: ");
                    name = sc.nextLine();
                    System.out.print("EMAIL: ");
                    email = sc.nextLine();
                    System.out.print("PHONE: ");
                    phone = sc.nextLine();
                    System.out.print("REG. NO.: ");
                    reg = sc.nextLine();
                    System.out.print("CLASS: ");
                    clas = sc.nextLine();
                    System.out.print("DEPARTMENT: ");
                    department = sc.nextLine();
                    Student temp = new Student(reg, name, email, phone, clas, department);
                    for (int i = 0; i < st.length; i++) {
                        if (st[i] == null) {
                            st[i] = temp;
                            st[i].saveIntoFile(); //calling the function from Student Class

                            break;
                            
                        }        
            }
        }

            if(ch==2){
                flag=true;
                System.out.println("\n=============================SEARCH STUDENT=============================");
                    System.out.print("ENTER REG. NO.  ");


                    r = sc.nextLine();

                    System.out.println(
                            "====================================================================================");
                    System.out.println(
                            "NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT");
                    System.out.println(
                            "------------------------------------------------------------------------------------");

                    for (int j = 0; j <st.length ; j++) {

                        if (st[j] != null && st[j].Regno.equals(r)) { //check for the particular reg no
                            System.out.printf("%-11s" + "%-35s" + "%-13s" + "%-15s" + "%s\n",
                                    st[j].name,
                                    st[j].email,
                                    st[j].phone,
                                    st[j].Regno,
                                    st[j].dept); //print the details of the searched student
                            break;
                        }

                        
                    }
                    System.out.println(
                            "\n========================================================================================");
                    

            }
            if(ch==3){ //update the details
                flag=true;
                System.out.print("ENTER REG.NO.:");
                    updateReg = sc.nextLine();

                    System.out.println("\t1.NAME");
                    System.out.println("\t2.EMAIL");
                    System.out.println("\t3.PHONE");
                    System.out.println("\t4.REG. NO.");
                    System.out.println("\t5.CLASS");
                    System.out.println("\t6.DEPARTMENT");

                    System.out.println("What you want to Update:");
                    updateChoice = Integer.parseInt(sc.nextLine());

                    switch (updateChoice) {
                        case 1: {
                            System.out.print("Enter Name:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.name = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("NAME UPDATETED !!");
                            break;
                        }

                        case 2: {
                            System.out.print("Enter Email:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.email = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("EMAIL UPDATETED !!");
                            break;
                        }

                        case 3: {
                            System.out.print("Enter Phone:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.phone = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("PHONE UPDATETED !!");
                            break;
                        }

                        case 4: {
                            System.out.print("Enter REG. NO.:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.Regno = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("PHONE UPDATETED !!");
                            break;
                        }

                        case 5: {
                            System.out.print("Enter CLASS:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.sclass = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("CLASS UPDATETED !!");
                            break;
                        }

                        case 6: {
                            System.out.print("Enter DEPARTMENT:");
                            for (Student k : st) {
                                if (k.Regno.equals(updateReg)) {
                                    k.dept = sc.nextLine();
                                    break;
                                }
                            }
                            System.out.println("DEPARTMENT UPDATETED !!");
                            break;
                        }

                        default: {
                            System.out.println("----------------------------");
                            System.out.println("Please enter Valid Input");
                            System.out.println("----------------------------");
                            break;
                        }
                    }

                    
                }
                if(ch==4){ //print the details of all the students
                    flag=true;
                    System.out.println(
                    "====================================================================================");
                     System.out.println(
                    "NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT");
                     System.out.println(
                    "------------------------------------------------------------------------------------");

                    try {
                        for (int a = 0; a <= st.length-1; a++) {
                            if (st[a] != null) {
                                System.out.printf("%-4d" + "%-11s" + "%-35s" + "%-13s" + "%-15s" + "%s\n",
                                        a + 1,
                                        st[a].name,
                                        st[a].email,
                                        st[a].phone,
                                        st[a].Regno,
                                        st[a].dept);
                                        
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("=========================================================================");
                   break; 
                }
                
            }
            while(flag==true);
}}