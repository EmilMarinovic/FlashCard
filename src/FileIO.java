import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

    public void readData(String path, Deck deck){
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //skip header
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] values = s.split(",");
                FlashCard fc = new FlashCard(values[0], values[1], Boolean.parseBoolean(values[2]));
                deck.addCard(fc);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Der findes kun 2 værdier per række");
        }
    }

    public void writeData(String path, Deck deck) {
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file);
            for (FlashCard fc : deck.getCards()) {
                writer.write(fc.toString() + "\n");
            }
            writer.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}