import java.util.*;
import java.io.*;

public class Project_German_Diaz
{
   public static void main (String[] args)
   {
      try
      {
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         
         int policyNumber = 0, age = 0, smokerCount = 0, nonSmokerCount = 0;
         double height = 0.0, weight = 0.0;
         String fName = "",providerName = "", lName = "", smokingStatus = "";
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         while (inputFile.hasNext())
         {
            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            fName = inputFile.nextLine();
            lName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
           Policy p = new Policy(policyNumber, providerName, fName, lName, age, smokingStatus, height, weight);
           
           policies.add(p);
         }
         
         inputFile.close();
         
         for(int i = 0; i < policies.size(); i++)
         {
            System.out.println("\nPolicy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f \n" ,policies.get(i).getUserBMI());
            System.out.printf("Policy Price: $%.2f \n" ,policies.get(i).getPolicyPrice());
            
            if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker"))
            {
               smokerCount += 1;
            }
            else if(policies.get(i).getSmokingStatus().equalsIgnoreCase("non-smoker"))
            {
               nonSmokerCount += 1;
            }  
         }
         
         System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
      }
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }   
   }
}