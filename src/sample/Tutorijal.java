package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Tutorijal {
    public static void main(String[] args){

    }

    public static ArrayList<Grad> ucitajGradove (BufferedReader br) throws IDException{
        ArrayList<String> gradovi = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader("mjerenja");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (line == bufferedReader.readLine()) != null{
                gradovi.add(line);

            }
            catch (IDException);

        }
    }
}
