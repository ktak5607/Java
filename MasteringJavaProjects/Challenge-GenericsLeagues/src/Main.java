public class Main {

    public static void main(String[] args) {
	    HockeyPlayer bill = new HockeyPlayer("Bill");
	    HockeyPlayer steve = new HockeyPlayer("Steve");
        HockeyPlayer brad = new HockeyPlayer("brad");
        HockeyPlayer nick = new HockeyPlayer("nick");

        RugbyPlayer phil = new RugbyPlayer("Phil");
        RugbyPlayer tim = new RugbyPlayer("Tim");
        RugbyPlayer bryan = new RugbyPlayer("Bryan");
        RugbyPlayer will = new RugbyPlayer("Will");

        FootballPlayer kyle = new FootballPlayer("Kyle");
        FootballPlayer chris = new FootballPlayer("Chris");
        FootballPlayer ryan = new FootballPlayer("Ryan");
        FootballPlayer dan = new FootballPlayer("Dan");
        FootballPlayer shawn = new FootballPlayer("Shawn");
        FootballPlayer rex = new FootballPlayer("Rex");

        Team <FootballPlayer> packers = new Team<>("Packers");
        packers.addPlayer(ryan);
        packers.addPlayer(kyle);
        Team<FootballPlayer> bears = new Team<>("Bears");
        bears.addPlayer(chris);
        bears.addPlayer(dan);
        Team<FootballPlayer> lions = new Team<>("Lions");
        lions.addPlayer(shawn);
        lions.addPlayer(rex);

        Team <HockeyPlayer> blues = new Team<>("Blues");
        Team <HockeyPlayer> northStars = new Team<>("North Stars");
        blues.addPlayer(bill);
        blues.addPlayer(steve);
        northStars.addPlayer(brad);
        northStars.addPlayer(nick);

        LeagueList<Team<FootballPlayer>> football = new LeagueList("Football");
        football.addTeam(packers);
        football.addTeam(lions);
        football.addTeam(bears);
        football.addTeam(packers);

        packers.gameResults(bears, 21, 7);
        packers.gameResults(lions, 45, 3);
        lions.gameResults(bears, 14, 0);
        System.out.println(packers.getRank());
        System.out.println(lions.getRank());
        System.out.println(bears.getRank());
        football.printRankings();

    }
}
