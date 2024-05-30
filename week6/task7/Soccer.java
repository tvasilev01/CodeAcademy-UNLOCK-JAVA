package week6.task7;

public class Soccer extends Sport{
    @Override
    public String getName() {
        return "Soccer";
    }

    @Override
    public String getNumberOfTeamMembers() {
        return "Each team has 11 players in " + getName();
    }
}
