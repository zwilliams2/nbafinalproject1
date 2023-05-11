package edu.guilford;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class NBAPlayerStat extends GridPane {

    // Instantiate labels for each stat
    private Label playerNameLabel = new Label("Player Name: ");
    private Label posLabel = new Label("Pos: ");
    private Label ageLabel = new Label("Age: ");
    private Label teamLabel = new Label("Team: ");
    private Label gpLabel = new Label("GP: ");
    private Label gsLabel = new Label("GS: ");
    private Label mpLabel = new Label("MP: ");
    private Label fgLabel = new Label("FG: ");
    private Label fgaLabel = new Label("FGA: ");
    private Label fgPercentLabel = new Label("FG%: ");
    private Label threePLabel = new Label("3P: ");
    private Label threePALabel = new Label("3PA: ");
    private Label threePPercentLabel = new Label("3P%: ");
    private Label twoPLabel = new Label("2P: ");
    private Label twoPALabel = new Label("2PA: ");
    private Label twoPPercentLabel = new Label("2P%: ");
    private Label eFGPercentLabel = new Label("eFG%: ");
    private Label ftLabel = new Label("FT: ");
    private Label ftaLabel = new Label("FTA: ");
    private Label ftPercentLabel = new Label("FT%: ");
    private Label orbLabel = new Label("ORB: ");
    private Label drLabel = new Label("DRB: ");
    private Label trbLabel = new Label("TRB: ");
    private Label astLabel = new Label("AST: ");
    private Label stlLabel = new Label("STL: ");
    private Label blkLabel = new Label("BLK: ");
    private Label tovLabel = new Label("TOV: ");
    private Label pfLabel = new Label("PF: ");
    private Label ppgLabel = new Label("PS/G: ");

    // Instantiate a textfield
    private TextField playerNameTextField = new TextField();
    private TextField posTextField = new TextField();
    private TextField ageTextField = new TextField();
    private TextField teamTextField = new TextField();
    private TextField gpTextField = new TextField();
    private TextField gsTextField = new TextField();
    private TextField mpTextField = new TextField();
    private TextField fgTextField = new TextField();
    private TextField fgaTextField = new TextField();
    private TextField fgPercentTextField = new TextField();
    private TextField threePTextField = new TextField();
    private TextField threePATextField = new TextField();
    private TextField threePPercentTextField = new TextField();
    private TextField twoPTextField = new TextField();
    private TextField twoPATextField = new TextField();
    private TextField twoPPercentTextField = new TextField();
    private TextField eFGPercentTextField = new TextField();
    private TextField ftTextField = new TextField();
    private TextField ftaTextField = new TextField();
    private TextField ftPercentTextField = new TextField();
    private TextField orbTextField = new TextField();
    private TextField drTextField = new TextField();
    private TextField trbTextField = new TextField();
    private TextField astTextField = new TextField();
    private TextField stlTextField = new TextField();
    private TextField blkTextField = new TextField();
    private TextField tovTextField = new TextField();
    private TextField pfTextField = new TextField();
    private TextField ppgTextField = new TextField();


    // the CSV file will give the parameters data so the user wont have to enter all the data

    // Set the labels and textfields
    public NBAPlayerStat() {
        playerNameLabel.setLayoutX(10);
        playerNameLabel.setLayoutY(10);
        playerNameTextField.setLayoutX(10);
        playerNameTextField.setLayoutY(30);
        posLabel.setLayoutX(10);
        posLabel.setLayoutY(60);
        posTextField.setLayoutX(10);
        posTextField.setLayoutY(80);
        ageLabel.setLayoutX(10);
        ageLabel.setLayoutY(110);
        ageTextField.setLayoutX(10);
        ageTextField.setLayoutY(130);
        teamLabel.setLayoutX(10);
        teamLabel.setLayoutY(160);
        teamTextField.setLayoutX(10);
        teamTextField.setLayoutY(180);
        gpLabel.setLayoutX(10);
        gpLabel.setLayoutY(210);
        gpTextField.setLayoutX(10);
        gpTextField.setLayoutY(230);
        gsLabel.setLayoutX(10);
        gsLabel.setLayoutY(260);
        gsTextField.setLayoutX(10);
        gsTextField.setLayoutY(280);
        mpLabel.setLayoutX(10);
        mpLabel.setLayoutY(310);
        mpTextField.setLayoutX(10);
        mpTextField.setLayoutY(330);
        fgLabel.setLayoutX(10);
        fgLabel.setLayoutY(360);
        fgTextField.setLayoutX(10);
        fgTextField.setLayoutY(380);
        fgaLabel.setLayoutX(10);
        fgaLabel.setLayoutY(410);
        fgaTextField.setLayoutX(10);
        fgaTextField.setLayoutY(430);
        fgPercentLabel.setLayoutX(10);
        fgPercentLabel.setLayoutY(460);
        fgPercentTextField.setLayoutX(10);
        fgPercentTextField.setLayoutY(480);
        threePLabel.setLayoutX(10);
        threePLabel.setLayoutY(510);
        threePTextField.setLayoutX(10);
        threePTextField.setLayoutY(530);
        threePALabel.setLayoutX(10);
        threePALabel.setLayoutY(560);
        threePATextField.setLayoutX(10);
        threePATextField.setLayoutY(580);
        threePPercentLabel.setLayoutX(10);
        threePPercentLabel.setLayoutY(610);
        threePPercentTextField.setLayoutX(10);
        threePPercentTextField.setLayoutY(630);
        twoPLabel.setLayoutX(10);
        twoPLabel.setLayoutY(660);
        twoPTextField.setLayoutX(10);
        twoPTextField.setLayoutY(680);
        twoPALabel.setLayoutX(10);
        twoPALabel.setLayoutY(710);
        twoPATextField.setLayoutX(10);
        twoPATextField.setLayoutY(730);
        twoPPercentLabel.setLayoutX(10);
        twoPPercentLabel.setLayoutY(760);
        twoPPercentTextField.setLayoutX(10);
        twoPPercentTextField.setLayoutY(780);
        eFGPercentLabel.setLayoutX(10);
        eFGPercentLabel.setLayoutY(810);
        eFGPercentTextField.setLayoutX(10);
        eFGPercentTextField.setLayoutY(830);
        ftLabel.setLayoutX(10);
        ftLabel.setLayoutY(860);
        ftTextField.setLayoutX(10);
        ftTextField.setLayoutY(880);
        ftaLabel.setLayoutX(10);
        ftaLabel.setLayoutY(910);
        ftaTextField.setLayoutX(10);
        ftaTextField.setLayoutY(930);
        ftPercentLabel.setLayoutX(10);
        ftPercentLabel.setLayoutY(960);
        ftPercentTextField.setLayoutX(10);
        ftPercentTextField.setLayoutY(990);
        orbLabel.setLayoutX(10);
        orbLabel.setLayoutY(1020);
        orbTextField.setLayoutX(10);
        orbTextField.setLayoutY(1040);
        drLabel.setLayoutX(10);
        drLabel.setLayoutY(1070);
        drTextField.setLayoutX(10);
        drTextField.setLayoutY(1090);
        trbLabel.setLayoutX(10);
        trbLabel.setLayoutY(1120);
        trbTextField.setLayoutX(10);
        trbTextField.setLayoutY(1140);
        astLabel.setLayoutX(10);
        astLabel.setLayoutY(1170);
        astTextField.setLayoutX(10);
        astTextField.setLayoutY(1190);
        stlLabel.setLayoutX(10);
        stlLabel.setLayoutY(1220);
        stlTextField.setLayoutX(10);
        stlTextField.setLayoutY(1240);
        blkLabel.setLayoutX(10);
        blkLabel.setLayoutY(1270);  
        blkTextField.setLayoutX(10);
        blkTextField.setLayoutY(1290);
        tovLabel.setLayoutX(10);
        tovLabel.setLayoutY(1320);
        tovTextField.setLayoutX(10);
        tovTextField.setLayoutY(1340);
        pfLabel.setLayoutX(10);
        pfLabel.setLayoutY(1370);
        pfTextField.setLayoutX(10);
        pfTextField.setLayoutY(1390);
        ppgLabel.setLayoutX(10);
        ppgLabel.setLayoutY(1420);
        ppgTextField.setLayoutX(10);
        ppgTextField.setLayoutY(1440);
    }

    // add the textfields and labels to the gridpane
    public void addNBAPlayerStat(GridPane gridPane) {
        gridPane.getChildren().addAll(playerNameLabel, playerNameTextField, posLabel, posTextField, ageLabel, ageTextField, teamLabel, teamTextField, gpLabel, gpTextField, gsLabel, gsTextField, mpLabel, mpTextField, fgLabel, fgTextField, fgaLabel, fgaTextField, fgPercentLabel, fgPercentTextField, threePLabel, threePTextField, threePALabel, threePATextField, threePPercentLabel, threePPercentTextField, twoPLabel, twoPTextField, twoPALabel, twoPATextField, twoPPercentLabel, twoPPercentTextField, eFGPercentLabel, eFGPercentTextField, ftLabel, ftTextField, ftaLabel, ftaTextField, ftPercentLabel, ftPercentTextField, orbLabel, orbTextField, drLabel, drTextField, trbLabel, trbTextField, astLabel, astTextField, stlLabel, stlTextField, blkLabel, blkTextField, tovLabel, tovTextField, pfLabel, pfTextField, ppgLabel, ppgTextField);


    // set the gridpane to be visible
    gridPane.setVisible(true);




        // when user enters the Name of the player get the stats from the CSV
        // file and display that players stats



    }
    }

    

