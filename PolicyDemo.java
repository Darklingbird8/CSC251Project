import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args){
        //create a Policy object
        Policy polObj = new Policy();

        //asks for the policy number
        Scanner polInput = new Scanner(System.in);
        System.out.print("Please enter the Policy Number: ");

        //converts string response to int and stores the users response in the policyNum field
        polObj.policyNum = Integer.parseInt(polInput.nextLine());

        //asks for the providers name
        Scanner provInput = new Scanner(System.in);
        System.out.print("Please enter the Provider Name: ");

        //stores the users response in the providerName field
        polObj.providerName = provInput.nextLine();

        //asks for the holders first name
        Scanner firstInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's First Name: ");

        //stores the users response in the holderFirst field
        polObj.holderFirst = firstInput.nextLine();

        //asks for the holders last name
        Scanner lastInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's Last Name: ");

        //stores the users response in the holderLast field
        polObj.holderLast = lastInput.nextLine();

        //asks for the holders age
        Scanner ageInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's Age: ");

        //converts string response to int and stores the users response in the holderAge field
        polObj.holderAge = Integer.parseInt(ageInput.nextLine());

        //asks is the holder is a smoker or not 
        Scanner smokerInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");

        //stores the users response in a temporary variable
        String tempSmoker = smokerInput.nextLine();

        //sets the isSmoker field value to true or false depending on the response
        if(tempSmoker.equals("non-smoker")){
            polObj.isSmoker = false;
        }else{
            polObj.isSmoker = true;
        }

        //asks for the holders height in inches
        Scanner heightInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's Height (in inches): ");

        //converts string response to int and stores the users response in the holderHeight field
        polObj.holderHeight = Double.parseDouble(heightInput.nextLine());

        //asks for the holders weight in pounds
        Scanner weightInput = new Scanner(System.in);
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");

        //converts string response to int and stores the users response in the holderWeight field
        polObj.holderWeight = Double.parseDouble(weightInput.nextLine());

        //display the policy number
        System.out.println("Policy Number: " + polObj.getPolicy());
        //display the provider name
        System.out.println("Provider Name: " + polObj.getProvider());
        //display the policyholders first name
        System.out.println("Policyholder's First Name: " + polObj.getFirst());
        //display the policyholders last name
        System.out.println("Policyholder's Last Name: " + polObj.getLast());
        //display the policyholders age
        System.out.println("Policyholder's Age: " + polObj.getAge());
        //display the policyholders smoking status
        System.out.println("Policyholder's Smoking Status: " + polObj.getSmoker());
        //display the policyholders height
        System.out.println("Policyholder's Height: " + polObj.getHeight() + " inches");
        //display the policyholders weight
        System.out.println("Policyholder's Weight: " + polObj.getWeight() + " pounds");
        //display the policyholders BMI
        System.out.println("Policyholder's BMI: " + Math.round(polObj.getBMI() * 100.0) / 100.0);
        //display the policy price
        System.out.println("Policy Price: $" + Math.round(polObj.getPrice() * 100.0) / 100.0);
    }
}
