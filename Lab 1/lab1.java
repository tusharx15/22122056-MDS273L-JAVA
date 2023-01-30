import java.util.Scanner;
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
        switch(state.toLowerCase()){
            case "kashmir": 
                System.out.println("The User is from the Northern Region.");
                break;
            case "himachal pradesh":
                System.out.println("The User is from the Norther Region.");
                break;
            case "punjab":
                System.out.println("The User is from the Northern Region.");
                break;
            case "ladakh":
                System.out.println("The User is from the Northern Region.");
                break;
            case "jammu":
                System.out.println("The User is from the Northern Region.");
                break;
            case "haryana":
                System.out.println("The User is from the Northern Region.");
                break;
            case "delhi":
                System.out.println("The User is from the Northern Region.");
                break;
            case "rajasthan":
                System.out.println("The User is from the Northern Region.");
                break;
            case "uttar pradesh":
                System.out.println("The User is from the Central Zone");
                break;
            case "uttrakhand":
                System.out.println("The User is from the Central Zone");
                break;
            case "madhya pradesh":
                System.out.println("The User is from the Central Zone");
                break;
            case "chattisgarh":
                System.out.println("The User is from the Central Zone");
                break;
            case "jharkhand","odisha","sikkim","west bengal","bihar":
                System.out.println("The User is from the Eastern Zone");
                break;
            case "gujurat","maharashtra":
                System.out.println("The User is from the Western Zone");
                break;
            case "telangana","karnataka","andhra pradesh","tamil nadu","kerela","goa":
                System.out.println("The User is from the Southern Zone");
                break;
            case "meghalaya","assam","mizoram","manipur","nagaland","arunachal pradesh","tripura":
                System.out.println("The User is from the North-Eastern Zone");
                break;
        }
        switch(company.toLowerCase()){
            case "facebook", "google", "microsoft", "samsung", "ibm", "apple", "amazon":
                System.out.println("----------------");
                System.out.println("The User is working in an MNC");
                System.out.println("----------------");
                break;
            default:
                System.out.println("-----------------------------");
                System.out.println("The User works in "+company);
                System.out.println("--------------------------");
        }


   }
}