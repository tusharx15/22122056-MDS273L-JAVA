import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class lab1 {
    public static void main(String[] args) {

        System.out.println("Please provide the details as follows: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("Enter sex: m/f ");
        char sex = scan.nextLine().charAt(0);

        System.out.println("Are you married? Yes/No");
        char married = scan.nextLine().charAt(0);

        System.out.println("Which state of India are you from? ");
        String state = scan.nextLine();

        System.out.println("Which company are you working for? ");
        String company = scan.nextLine();

        System.out.println("The user details are as follows: {Name:" + name + ", Age : " + age + ", Gender: " + sex
                + ", Marrital Status:" + married + ", State:" + state + ", Company Name:" + company);
        System.out.println("//////////////////////");

        if(sex=='m'){
            System.out.println("---------------------");
            System.out.println("----The User is a MALE!----");
            System.out.println("-----------------------");
        } else if(sex=='f'){
            System.out.println("---------------------------");
            System.out.println("----The User is a FEMALE!---");
            System.out.println("----------------------------");
        } else{
            System.out.println("Please enter a valid option.");
        }
        switch(state){
            case "Kashmir": 
                System.out.println("The User is from the Northern Region.");
                break;
            case "Himachal Pradesh":
                System.out.println("The User is from the Norther Region.");
                break;
            case "Punjab":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Ladakh":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Jammu":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Haryana":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Delhi":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Rajasthan":
                System.out.println("The User is from the Northern Region.");
                break;
            case "Uttar Pradesh":
                System.out.println("The User is from the Central Zone");
                break;
            case "Uttrakhand":
                System.out.println("The User is from the Central Zone");
                break;
            case "Madhya Pradesh":
                System.out.println("The User is from the Central Zone");
                break;
            case "Chattisgarh":
                System.out.println("The User is from the Central Zone");
                break;
            case "Jharkhand","Odisha","Sikkim","West Bengal","Bihar":
                System.out.println("The User is from the Eastern Zone");
                break;
            case "Gujurat","Maharashtra":
                System.out.println("The User is from the Western Zone");
                break;
            case "Telangana","Karnataka","Andhra Pradesh","Tamil Nadu","Kerela","Goa","":
                System.out.println("The User is from the Southern Zone");
                break;
            case "Meghalaya","Assam","Mizoram","Manipur","Nagaland","Arunachal Pradesh","Tripura":
                System.out.println("The User is from the North-Eastern Zone");
                break;
        }
        switch(company){
            case "Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple", "Amazon":
                System.out.println("----------------");
                System.out.println("The User is working in an MNC");
                System.out.println("----------------");
        }

   }
}