import models.Character;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Character> characters = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        printCharacters();
    }

    private static void readFile() {
        File file = new File("src/characters-one-piece.csv");

        try (Scanner sc = new Scanner(file)) {

            // Skip header if present
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] parts = line.split(";");

                if (parts.length < 5) continue;

                String name = parts[0];
                int chapter = Integer.parseInt(parts[1]);
                int episode = Integer.parseInt(parts[2]);
                int year = Integer.parseInt(parts[3]);
                String note = parts[4];

                Character character = new Character(name, chapter, episode, year, note);
                characters.add(character);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void printCharacters() {
        for (Character c : characters) {
            System.out.println(
                    c.getName() + " | " +
                            c.getChapter() + " | " +
                            c.getEpisode() + " | " +
                            c.getYear() + " | " +
                            c.getNote()
            );
        }
    }
}
