package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            // Create an object of file reader
            // class with CSV file as a parameter.
            Path path = Paths.get(this.getClass().getResource("/HOOPERSTATS.csv").toURI());
            FileReader filereader = new FileReader(path.toFile());

            // create csvReader object and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();

            // Ask the user for a player name
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a player name: ");
            String playerName = input.nextLine();
            input.close();
            // If the user enters a player name that is not in the data, print an error
            // message and exit the program
            boolean found = false;
            for (int i = 0; i < allData.size(); i++) {
                String[] row = allData.get(i);
                if (row[1].equals(playerName)) {
                    found = true;
                    System.out.println("Player Name: " + row[1]);
                    System.out.println("Pos: " + row[2]);
                    System.out.println("Age: " + row[3]);
                    System.out.println("Team: " + row[4]);
                    System.out.println("GP: " + row[5]);
                    System.out.println("GS: " + row[6]);
                    System.out.println("MP: " + row[7]);
                    System.out.println("FG: " + row[8]);
                    System.out.println("FGA: " + row[9]);
                    System.out.println("FG%: " + row[10]);
                    System.out.println("3P: " + row[11]);
                    System.out.println("3PA: " + row[12]);
                    System.out.println("3P%: " + row[13]);
                    System.out.println("2P: " + row[14]);
                    System.out.println("2PA: " + row[15]);
                    System.out.println("2P%: " + row[16]);
                    System.out.println("eFG%: " + row[17]);
                    System.out.println("FT: " + row[18]);
                    System.out.println("FTA: " + row[19]);
                    System.out.println("FT%: " + row[20]);
                    System.out.println("ORB: " + row[21]);
                    System.out.println("DRB: " + row[22]);
                    System.out.println("TRB: " + row[23]);
                    System.out.println("AST: " + row[24]);
                    System.out.println("STL: " + row[25]);
                    System.out.println("BLK: " + row[26]);
                    System.out.println("TOV: " + row[27]);
                    System.out.println("PF: " + row[28]);
                    System.out.println("PS/G: " + row[29]);
                    break;
                }
            }
            if (!found) {
                System.out.println("Player not found");
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start the graphics
        // Instantiate a vbox object
        VBox vbox = new VBox();
        // Instantiate a scene object
        scene = new Scene(vbox, 640, 480);
        // add the vbox object to the filereader object
        stage.setScene(scene);
        // show the stage
        stage.show();

        



    }

    public static void main(String[] args) {
        launch();
    }

}