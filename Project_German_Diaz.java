import java.util.Scanner;

public class Project_German_Diaz
{
   public static void main (String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      Policy policy = new Policy();
      
      int policyNumber, age;
      double height, weight;
      String fName,providerName, lName, smokingStatus;
      
      System.out.println("Please enter the Policy Number: ");
      policyNumber = scnr.nextInt();
      scnr.nextLine();
      System.out.println("Please enter the Provider Name: ");
      providerName = scnr.next();
      scnr.nextLine();
      System.out.println("Please enter the Policyholder's First Name: ");
      fName = scnr.next();
      System.out.println("Please enter the Policyholder's Last Name: ");
      lName = scnr.next();
      System.out.println("Please enter the Policyholder's Age: ");
      age =  scnr.nextInt();
      System.out.println("Please enter the Policyholder's Smoking Status: (smoker/non-smoker): ");
      smokingStatus = scnr.next();
      System.out.println("Please enter the Policyholder's height (in inches): ");
      height = scnr.nextDouble();
      System.out.println("Please enter the Policyholder's weight (in pounds): ");
      weight = scnr.nextDouble();
      
      policy.setPolicyNumber(policyNumber);
      policy.setProviderName(providerName);
      policy.setFName(fName);
      policy.setLName(lName);
      policy.setAge(age);
      policy.setSmokingStatus(smokingStatus);
      policy.setHeight(height);
      policy.setWeight(weight);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFName());
      System.out.println("Policyholder's Last Name: " + policy.getLName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getUserBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPolicyPrice());
   }
}