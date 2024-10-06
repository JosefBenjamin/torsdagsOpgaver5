import java.util.ArrayList;

class Team {
	
private String teamName; 
private int teamRank; 
private ArrayList<String> playerNames =  new ArrayList<String>(); 

public	Team(String teamName) {

	this.teamName = teamName; 



	}


public void setRank(int teamRank) {

this.teamRank = teamRank; 

}

@Override 
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(teamName + ": The Invincible Rank: " + teamRank);
	sb.append("Players: \n");
	for(String x : playerNames) {
		sb.append(x + "\n");
	}
	return  sb.toString();

}

public void addPlayer(String playerName) {

	this.playerNames.add(playerName);

}


}