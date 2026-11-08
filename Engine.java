import java.util.HashMap;
import java.util.Scanner;


public class Engine {
    private HashMap<String, Scene> masterScenes;
    private Player player;
    private Scene currentScene;
    private Scanner keyboard;

    public Engine(Player player){
        this.player = player;
        this.masterScenes = new HashMap<>();
        this.keyboard = new Scanner(System.in);
    }

    public void registerScene(Scene scene){
        this.masterScenes.put(scene.getId(), scene);
    }

    public void setStartingScene(String sceneId){
        this.currentScene = masterScenes.get(sceneId);
    }

    public void start(){
        boolean running = true;

        while (running) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
            System.out.println("[Audio Environment: Playing " + currentScene.getMusicTrack() + "]");
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");

            System.out.println(currentScene.getProse());
            System.out.println("----------------------------------------");

            System.out.println("What would you like to do? > ");
            String input = keyboard.nextLine().trim().toLowerCase();

            if (input.equals("exit") || input.equals("quit")) {
                running = false;
                System.out.println("Till you join us again.");
                break;
            }

            String nextId = currentScene.getNextSceneId(input);

            if (nextId != null) {
                player.recordDecision("visited_" + currentScene.getId());
                currentScene = masterScenes.get(nextId);
            } else {
                System.out.println("That path goes nowhere. Turn back");


            }
        }

        }
    }
