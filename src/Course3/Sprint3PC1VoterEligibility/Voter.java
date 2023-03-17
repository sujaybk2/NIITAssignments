package Course3.Sprint3PC1VoterEligibility;

public class Voter {
    private String name;
    private int age;
    private static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria() {
        if (age >= VOTER_ELIGIBLE_AGE) {
            return name + " Is Eligible to Vote";
        } else if (age > 0 && age < VOTER_ELIGIBLE_AGE) {
            return name + " Is Not Eligible to Vote";
        } else {
            return "Age Can't Be Negative or Zero";
        }
    }
}
