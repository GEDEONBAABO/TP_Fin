
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Écriture dans le fichier
            BufferedWriter writer = new BufferedWriter(new FileWriter("voiture.txt"));
            Voiture voit1 = new Voiture("Mercedes", 5, 4, 205, 5);
            writer.write(voit1.toFileFormat());
            writer.newLine(); // Nouvelle ligne
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("voiture.txt"));
            String line;
            System.out.println("Ma voiture !");
            System.out.println("*****************");
            while ((line = reader.readLine()) != null) {
                Voiture voitureLue = Voiture.fromFileFormat(line);
                System.out.println(voitureLue.description());
                System.out.println("*****************");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}