import java.util.Scanner;

public class Policy {

    // fields
    static int policyNum;
    static String providerName;
    static String holderFirst;
    static String holderLast;
    static int holderAge;
    static boolean isSmoker;
    static double holderHeight;
    static double holderWeight;

    /**
     * no-args constructor
     */
    public Policy() {
        policyNum = 1111;
        providerName = "provider name";
        holderFirst = "first name";
        holderLast = "last name";
        holderAge = 1;
        isSmoker = false;
        holderHeight = 1.0;
        holderWeight = 1.0;
    }

    /**
     * constructor for accepting arguments
     * @param policy
     * @param provider
     * @param first
     * @param last
     * @param age
     * @param smoker
     * @param height
     * @param weight
     */
    public Policy(int policy, String provider, String first, String last, int age, boolean smoker, int height, int weight) {
        policyNum = policy;
        providerName = provider;
        holderFirst = first;
        holderLast = last;
        holderAge = age;
        isSmoker = smoker;
        holderHeight = height;
        holderWeight = weight;
    }

    /**
     * The setPolicy method sets the policys number
     * @param policy
     */
    public void setPolicy(int policy) {
        policyNum = policy;
    }

    /**
     * The getPolicy method returns the policys number
     * @param policy
     * @return the value within the policyNum field
     */
    public int getPolicy() {
        return policyNum;
    }

    /**
     * The setProvider method sets the providers name
     * @param provider
     */
    public void setProvider(String provider) {
        providerName = provider;
    }

    /**
     * The getProvider method returns the providers name
     * @param providerName
     * @return the value within the providerName field
     */
    public String getProvider() {
        return providerName;
    }

    /**
     * The setFirst method sets the holders first name
     * @param first
     */
    public void setFirst(String first) {
        holderFirst = first;
    }

    /**
     * The getFirst method returns the holders first name
     * @param holderFirst
     * @return the value within the holderFirst field
     */
    public String getFirst() {
        return holderFirst;
    }
    
    /**
     * The setLast method sets the holders last name
     * @param last
     */
    public void setLast(String last) {
        holderLast = last;
    }

    /**
     * The getFirst method returns the holders last name
     * @param holderLast
     * @return the value within the holderLast field
     */
    public String getLast() {
        return holderLast;
    }

    /**
     * The setAge method sets the holders age
     * @param age
     */
    public void setAge(int age) {
        holderAge = age;
    }

    /**
     * The getAge method returns the holders age
     * @param holderAge
     * @return the value within the holderAge field
     */
    public int getAge() {
        return holderAge;
    }

    /**
     * The setSmoker method sets the holders smoking status
     * @param smoker
     */
    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    /**
     * The getSmoker method returns if the holder is a smoker
     * @param isSmoker
     * @return the value within the isSmoker field
     */
    public boolean getSmoker() {
        return isSmoker;
    }

    /**
     * The setHeight method sets the holders height
     * @param height
     */
    public void setHeight(int height) {
        holderHeight = height;
    }

    /**
     * The getHeight method returns if the holders height
     * @param holderHeight
     * @return the value within the getHeight field
     */
    public double getHeight() {
        return holderHeight;
    }

    /**
     * The setWeight method sets the holders weight
     * @param weight
     */
    public void setWeight(int weight) {
        holderWeight = weight;
    }

    /**
     * The getWeight method returns if the holders weight
     * @param holderWeight
     * @return the value within the getWeight field
     */
    public double getWeight() {
        return holderWeight;
    }

    /**
     * the calcBMI method calculates the holders BMI
     * @param bmi
     * @return the holders bmi
     */
    public double calcBMI(double bmi) {
        bmi = (holderWeight * 703)/(holderHeight*holderHeight);
        return bmi;
    }

    public double getBMI() {
        double bmi = calcBMI(holderAge);
        return bmi;
    }

    /**
     * the calcPrice method calculates the holders total price
     * @param total
     * @param base
     * @param ageFee
     * @param smokerFee
     * @param bmiFee
     * @param bmi
     * @return the holders total price
     */
    public double calcPrice(double total, double base, double ageFee, double smokerFee, double bmiFee, double bmi) {
        base = 600;
        bmi = getBMI();

        if(holderAge > 50){
            ageFee = 75;
        }else{
            ageFee = 0;
        }

        if(isSmoker == true){
            smokerFee = 100;
        }else{
            smokerFee = 0;
        }

        if(bmi > 35) {
            bmiFee = (bmi - 35) * 20;
        }else{
            bmiFee = 0;
        }

        total = (base + ageFee + smokerFee + bmiFee);
        return total;
    }

    public double getPrice() {
        double total = (calcPrice(holderAge, holderAge, policyNum, holderWeight, holderHeight, holderAge));
        return total;
    }
}