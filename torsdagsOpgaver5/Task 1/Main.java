class Main {
	
public static void main(String[] args) {
	
Team dreamTeam = new Team("The Dream Team");
Team theATeam = new Team("The A Team"); 
Team lyngbyTeam = new Team("The Lyngby Team"); 
Team theBTeam = new Team("The B Team"); 
Team randomTeam = new Team("The Random Team"); 

dreamTeam.setRank(1); 
theATeam.setRank(2);
theBTeam.setRank(3);
lyngbyTeam.setRank(4);
randomTeam.setRank(5);

dreamTeam.addPlayer("Jack");
theATeam.addPlayer("John");
theBTeam.addPlayer("Jill");
lyngbyTeam.addPlayer("Jacob");
randomTeam.addPlayer("James");


System.out.println(dreamTeam);
System.out.println(theATeam);
System.out.println(theBTeam);
System.out.println(lyngbyTeam);
System.out.println(randomTeam);

}

}