
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<String> decisionsMade;
    private ArrayList<String> possessions;

    public Player(String name) {
        this.name = name;
        this.decisionsMade = new ArrayList<>();
        this.possessions = new ArrayList<>();
    }

    public void recordDecision(String choiceId) {
        this.decisionsMade.add(choiceId.toLowerCase());
    }

    public boolean hasDecided(String choiceId) {
        return this.decisionsMade.contains(choiceId.toLowerCase());
    }

    public void obtainPossession(String item) {
        this.possessions.add(item);
        System.out.println("\n[You're holding " + item + ".]");
    }

    public boolean carries(String item) {
        return this.possessions.contains(item);
    }

    public String getName() {
        return name;
    }
}

