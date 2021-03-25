import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String teamName;
    private int won;
    private int lost;
    private int tied;
    private int played;

    ArrayList<Player> members = new ArrayList<>();
    public Team(String name){
        this.teamName = name;
    }
    public String getTeamName(){
        return teamName;
    }

    public boolean addPlayer(T player){
        if(!members.contains(player)){
            members.add(player);
            System.out.println(player.getName() + " has been added to the " + this.teamName);
            return true;
        }
        else{
            System.out.println(player.getName() + " is already on the " + this.teamName);
            return false;
        }

    }
    public void gameResults(Team<T> oppTeam, int teamScore, int oppScore){
        if(teamScore > oppScore){
            this.won ++;
        }
        else if(oppScore > teamScore){
            this.lost ++;
        }
        else{
            this.tied ++;
        }
        played ++;
        if(oppTeam != null){
            oppTeam.gameResults(null, oppScore, teamScore);
        }

    }
    public double getRank(){
        return ((double)this.won / (double)this.played) * 100d;
    }

    @Override
    public int compareTo(Team<T> team){
        if(this.getRank() > team.getRank()){
            return -1;
        }
        else if(this.getRank() < team.getRank()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
