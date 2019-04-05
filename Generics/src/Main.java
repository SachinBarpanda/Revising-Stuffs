public class Main {
    public static void main(String[] args) {
    SoccerPlayer messi = new SoccerPlayer("messi");
    Team <SoccerPlayer>barcelona = new Team<>("Barcelona");
    Team<SoccerPlayer>realMadrid = new Team<>("Real Madrid");
    League<Team<SoccerPlayer>> footleague = new League<>("ISL");
    barcelona.addPlayer(messi);
    barcelona.matchResult(realMadrid,10,8);
    footleague.add(barcelona);
    footleague.add(realMadrid);
    footleague.showLeagueTable();

    }
}
