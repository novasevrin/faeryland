import java.util.HashMap;


public class Scene {
    private String id;
    private String prose;
    private String musicTrack;
    private HashMap<String, String> choices;

    public Scene(String id, String prose, String  musicTrack) {
        this.id = id;
        this.prose = prose;
        this.musicTrack = musicTrack;
        this.choices = new HashMap<>();
    }

    public void addChoice(String actionText, String nextSceneId){
        this.choices.put(actionText.toLowerCase(), nextSceneId);
    }

    public String getNextSceneId(String actionText){
        return this.choices.get(actionText.toLowerCase());
    }

    public String getId() {
        return id;
    }
    public String getProse() {
        return prose;
    }
    public String getMusicTrack() {
        return musicTrack;
    }
    public HashMap<String, String> getChoices() {
        return choices;
    }
}
