package VotingMachine;



public class VotingMachineTest {

	public static void main(String[] args) {
		
		
		//First election
		System.out.println("Results of election:");
		
        VotingMachine.setVotePartyA();
		
		VotingMachine.setVotePartyB();
		
		VotingMachine.results();
		
		//Second election
		System.out.println("Results of election:");
		
		 VotingMachine.setVotePartyA();
			
		 VotingMachine.setVotePartyB();
			
		 VotingMachine.results();
		
		
		//Third election
		
		 System.out.println("Results of election:");
		 
		 VotingMachine.setVotePartyA();
			
		 VotingMachine.setVotePartyB();
			
		 VotingMachine.results();
		

	}

}
