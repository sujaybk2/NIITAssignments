package Course3.Sprint3PC1VoterEligibility;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("John");
        voter.setAge(10);

        System.out.println(voter.getAgeCriteria());
    }
}

