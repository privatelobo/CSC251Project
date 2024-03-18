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
   //the setPolicyNumber() method sets the policy Number
   //@Param policy number
   public void setPolicyNumber(int userPolicyNumber)
   {
      policyNumber = userPolicyNumber;
   }
   //the setAge() method sets the policyholder age
   //@param policyholder age
   public void setAge(int userAge)
   {
      age = userAge;
   }
   //the set providerName() mehtod sets the insurance provider name
   //@param insurance provider name
   public void setProviderName(String userProviderName)
   {
      providerName = userProviderName;
   }
   //the setFName() method sets the policyholder first name
   //@param policyholder first name
   public void setFName(String userFName)
   {
      fName = userFName;
   }
   //the setLName() method sets the policy holder last name
   //@Param policyholder last name
   public void setLName(String userLName)
   {
      lName = userLName;
   }
   //the setSmokingStatus() method sets a smoking or non smoking status for the policy holder
   //@param the smoking status of the policy holder
   public void setSmokingStatus(String userSmokingStatus)
   {
      smokingStatus = userSmokingStatus;
   }
   //the setHeight() method sets the policy holder height
   //@param the policyholder height
   public void setHeight(double userHeight)
   {
      height = userHeight;
   }
   //the setWeight() method sets the policyholder height
   //@param policy holder height
   public void setWeight(double userWeight)
   {
      weight = userWeight;
   }
   
   /** the following are the accessor methods that return the values of each field
   getPolicyNumber(), getAge(), getProviderName(), getFName(), getLName(), getSmokingStatus(), getWeight(), getHeight
   */
   //the getPolicyNumber() method returns the policy number
   //@return policy number
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   //the getAge() method returns the policyholder age
   //@return age
   public int getAge()
   {
      return age;
   }
   //the getProviderName() method returns the insurance provider name
   //@return insurance provider name
   public String getProviderName()
   {
      return providerName;
   }
   //the getFName() method returns the policyholder first name
   //@return policyholder first name
   public String getFName()
   {
      return fName;
   }
   //the getLName() method returns the last name of the policy holder
   //@return last name of policy holder
   public String getLName()
   {
      return lName;
   }
   //the getSmokingStatus() method returns the smoking status of the policy holder
   //@return smoking status
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   //The getWeight method returns the policyholder weight
   //@return weight of the policy holder
   public double getWeight()
   {
      return weight;
   }
   //the getHeight() method returns the height of the policyholder
   //@return height of policyholder
   public double getHeight()
   {
      return height;
   }
   
   //Methods that calculate the BMI and total costs for the user
   //@return the BMI of a policyholder
   public double getUserBMI()
   {
      return (weight * 703) / (Math.pow(height , 2.0));
   }
   //the getpolicyPrice() method returns the policy price of a policy holders beased on thier smoking status and BMI
   //@return the cost of a policy
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