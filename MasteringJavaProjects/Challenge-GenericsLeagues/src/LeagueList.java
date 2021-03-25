import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeagueList <T extends  Team>{
    private ArrayList<T> leagueTeams;
    private String leagueName;

    public LeagueList (String name){
        this.leagueName = name;
        leagueTeams = new ArrayList<>();
    }
    public boolean addTeam(T team){
        if(!leagueTeams.contains(team)){
            leagueTeams.add(team);
            System.out.println("Added " + team.getTeamName() + " to the " + this.leagueName + " league");
            return true;
        }
        else{
            System.out.println("The " + team.getTeamName() + " are already in the " + this.leagueName + " league");
            return false;
        }

    }
    public void printRankings(){
        Collections.sort(leagueTeams);
        for(int i = 0; i < leagueTeams.size(); i++) {
            System.out.println((i + 1) + ": " + leagueTeams.get(i).getTeamName());
        }
    }
    public void printTeams(){
        for(T i : leagueTeams){
            System.out.println(i.getTeamName());
        }
    }
}
