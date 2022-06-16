package Persistance;
import business.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JsonFileInteract {
    private static final String PATH = "data/jsonFile.json";
    private Gson gson;

    public JsonFileInteract() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }


    public void jsonSave(){
        Edition edition = new Edition();

        try {
            FileWriter fileWriter = new FileWriter(PATH);
            fileWriter.write(gson.toJson(edition));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void prova() throws IOException {
        TrialManager trialManager = new TrialManager();
        PaperPublication paperPublication = trialManager.enterPaperPublicationData();
        FileWriter fileWriter = new FileWriter(PATH);

        fileWriter.write(gson.toJson(paperPublication));
        fileWriter.close();

    }


}
