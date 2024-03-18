public class Policy
{
   private int policyNumber, age;
   private String providerName, fName, lName, smokingStatus;
   private double height, weight;
   
   
   // default no arg constructor that initialized the fields to default values
   public Policy()
   {
      policyNumber = 0000;
      age = 0;
      providerName = "null";
      fName = "null";
      lName = "null";
      smokingStatus = "unknown";
      height = 0.0;
      weight = 0.0;
   }
   /** constructor that initializes all fields to the arguments it is provided
   @Param userPolicyNumber, userAge, userFName, userLName, userSmokingStatus, userHeigh, userWeight
   */
   public Policy(int userPolicyNumber, String userProviderName, String userFName, String userLName, int userAge, String userSmokingStatus, double userHeight, double userWeight)
   {
      policyNumber = userPolicyNumber;
      age = userAge;
      providerName = userProviderName;
      fName = userFName;
      lName = userLName;
      smokingStatus = userSmokingStatus;
      height = userHeight;
      weight = userWeight;
   }
   
   /**the following are the mutator methods setPolicyNumber(), setAge(), setProviderName()
      setFName(), setLName, setSmokingStatus(), setHeight(), setWeight()
   */
   public void setPolicyNumber(int userPolicyNumber)
   {
      policyNumber = userPolicyNumber;
   }
   public void setAge(int userAge)
   {
      age = userAge;
   }
   public void setProviderName(String userProviderName)
   {
      providerName = userProviderName;
   }
   public void setFName(String userFName)
   {
      fName = userFName;
   }
   public void setLName(String userLName)
   {
      lName = userLName;
   }
   public void setSmokingStatus(String userSmokingStatus)
   {
      smokingStatus = userSmokingStatus;
   }
   public void setHeight(double userHeight)
   {
      height = userHeight;
   }
   public void setWeight(double userWeight)
   {
      weight = userWeight;
   }
   
   /** the following are the accessor methods that return the values of each field
   getPolicyNumber(), getAge(), getProviderName(), getFName(), getLName(), getSmokingStatus(), getWeight(), getHeight
   */
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   public int getAge()
   {
      return age;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public String getFName()
   {
      return fName;
   }
   public String getLName()
   {
      return lName;
   }
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   public double getWeight()
   {
      return weight;
   }
   public double getHeight()
   {
      return height;
   }
   
   //Methods that calculate the BMI and total costs for the user
   public double getUserBMI()
   {
      return (weight * 703) / (Math.pow(height , 2.0));
   }
   public double getPolicyPrice()
   {
      double policyCost = 0.00;
      if (age > 50)
      {
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            if (getUserBMI() > 35.0)
               policyCost = 600 + 75 + 100 + ((getUserBMI()-35) * 20);
            else
               policyCost = 600 + 75 + 100;
         }
         else if (smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            if (getUserBMI() > 35.0)
            {
               policyCost = 600 + 75 + ((getUserBMI() - 35 *20));
            }
            else
               policyCost = 600 + 75;
         }
      }
      else if (age < 50)
      {
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            if (getUserBMI() > 35.0)
               policyCost = 600 + 100 + ((getUserBMI()-35.0) * 20);
            else
               policyCost = 600 + 100;
         }
         else if (smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            if (getUserBMI() > 35.0)
            {
               policyCost = 600 + ((getUserBMI() - 35.0) *20);
            }
            else
               policyCost = 600;
         }

      }
      return policyCost;
   }
}