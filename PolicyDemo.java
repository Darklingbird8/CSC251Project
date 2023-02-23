import java.util.Scanner;
import java.util.*; 
import java.io.*;

public class PolicyDemo {
    public static void main(String[] args) {
        try 
        {
            File file = new File("PolicyInformation.txt");

            Scanner inputFile = new Scanner(file);

            int policyNum = 0, holderHeight = 0, holderWeight = 0, holderAge = 0, smokers = 0, nonsmokers = 0;
            String providerName = "", holderFirst = "", holderLast = "", tempSmoker = "", fileInput = "";
            boolean isSmoker = false;

            ArrayList<Policy> policies = new ArrayList<Policy>();

            while(inputFile.hasNext()) 
            {
                fileInput = inputFile.nextLine();
                System.out.println(fileInput);

                policyNum = Integer.parseInt(fileInput);
                System.out.println(policyNum);

                providerName = inputFile.nextLine();
                System.out.println(providerName);

                holderFirst = inputFile.nextLine();
                System.out.println(holderFirst);

                holderLast = inputFile.nextLine();
                System.out.println(holderLast);

                fileInput = inputFile.nextLine();
                holderAge = Integer.parseInt(fileInput);
                System.out.println(holderAge);

                tempSmoker = inputFile.nextLine();

                fileInput = inputFile.nextLine();
                holderHeight = Integer.parseInt(fileInput);
                System.out.println(holderHeight);

                fileInput = inputFile.nextLine();
                holderWeight = Integer.parseInt(fileInput);
                System.out.println(holderWeight);

                if(inputFile.hasNext())
                { 
                    inputFile.nextLine();//skip the blank line if we have not reached the end of the file
                }

                if(tempSmoker.equals("non-smoker")){
                    isSmoker = false;
                    nonsmokers++;
                }else{
                    isSmoker = true;
                    smokers++;
                };
            
                Policy c = new Policy(policyNum, providerName, holderFirst, holderLast, holderAge, isSmoker, holderHeight, holderWeight);

                policies.add(c);
                
            }

            inputFile.close();//close the file
      
            //use a for loop to display the output
            for(int i =0; i < policies.size(); i++) { 
                System.out.println("Policy Number: " + policies.get(i).getPolicy());
                System.out.println("Provider Name: " + policies.get(i).getProvider());
                System.out.println("Policyholder's First Name: " + policies.get(i).getFirst());
                System.out.println("Policyholder's Last Name: " + policies.get(i).getLast());
                System.out.println("Policyholder's Age: " + policies.get(i).getAge()); 
                System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmoker());
                System.out.println("Policyholder's Height: " + policies.get(i).getHeight());  
                System.out.println("Policyholder's Weight: " + policies.get(i).getWeight());  
                System.out.printf("Policyholder's BMI: %.2f \n", + policies.get(i).getBMI());  
                System.out.printf("Policy Price: $%.2f \n", policies.get(i).getPrice());
                System.out.println();
            }

            System.out.println("The number of policies with a smoker is: " + smokers);
            System.out.println("The number of policies with a non-smoker is: " + nonsmokers);
        }
        catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
        {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
        }
    }
}
