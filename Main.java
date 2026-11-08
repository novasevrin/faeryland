import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Player protagonist = new Player("The Lost Soul");
        Engine bookEngine = new Engine(protagonist);

        Scene doors = new Scene("doors", "placeholder.\nChoices: [enter Ebonstein] or [turn back]", "placeholder.wav");


        Scene foyer = new Scene("foyer", "placeholder. \nChoices: [move down the main hall] or [go to the den]", "placeholder.wav");




        doors.addChoice("enter Ebonstein","doors");

        bookEngine.registerScene(doors);
        bookEngine.registerScene(foyer);


        bookEngine.setStartingScene("doors");
        bookEngine.start();

    }
}
