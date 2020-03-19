package VotingMachine;

import java.util.ArrayList;
import java.util.Random;

public class VotingMachine {
	
	private static int votePartyA;

    private static int votePartyB;
	
	public VotingMachine ()
	{
		 votePartyA=0;

         votePartyB=0;
        	
	}

	//Simulates random voters voting for PartyA 
	
	public static void setVotePartyA() {
		    
 	   Random rand = new Random(); 
		int randomV = rand.nextInt(2);
		ArrayList<Integer> voteA = new ArrayList<Integer>();
		int vote=0;
		if(randomV==0) {    //if randomV is equal to 0 assigns 1 vote to partyA
		
			vote++;
		}
		int numOfVoters = rand.nextInt(1000);
		for(int z=1;z<numOfVoters;z++) {  // gets random num of voters
			numOfVoters--;
		for (int i=0; i<=vote; i++) {
		voteA.add(i);	
       
			for (int j = 0; j < voteA.size(); j++) {
				voteA.size();
				votePartyA = +voteA.size();
			}
		}
		}	      
	System.out.println("Party A votes: "+ votePartyA);			
    }
	//Simulates random voters voting for PartyB
	
	public static void setVotePartyB() {
		
		ArrayList<Integer> voteB = new ArrayList<Integer>();
    	
    	Random rand = new Random(); 
		int randomV = rand.nextInt(2);
		int vote=0;
		if(randomV==1) {     //if randomV is equal to 1 assigns 1 vote to partyB
			vote++;               
		}
	
	int numOfVoters = rand.nextInt(1000)+1;
	for(int v=1;v<numOfVoters;v++) {
		numOfVoters--;
	for (int a=0; a<=vote; a++) {
	
	    voteB.add(a);
	
	for (int g = 0; g < voteB.size(); g++) { 
          votePartyB =+voteB.size();
      }
	}
	}
				
System.out.println("Party B votes: "+ votePartyB);

		
	}
	//Gets the number of votes for partyA & return number of votes, type of int

	public static int getVotePartyA() {
		
		return votePartyA;
	
}
	//Gets the number of votes for partyB & return number of votes, type of int
	
	public static int getVotePartyB() {
		
		
		return votePartyB;
}
	
	//compares the results, use if statement
	public static void results() {
		
		if ( votePartyA > votePartyB) {
            System.out.println("Party A Wins! ");
 }else if(votePartyA < votePartyB){
            System.out.println("Party B Wins! ");
 }else   {
            System.out.println("It's a draw! ");
 }
		
		
	}
	
}
