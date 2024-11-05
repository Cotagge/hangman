import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        final Random random = new Random();
        final String[] words = {"skillmea", "volby", "hovno", "mamrd"};

        final String wordToGuess = selectRandomWord(random, words);
        final String hiddenWord = generateHiddenWords(wordToGuess);

        final int MAX_INCCORECT_GUESSES = 6;
        int incorrectGuesses = 0;

        System.out.println("vitej v obesenci");
        System.out.println("hadej slovo: " + hiddenWord);

        while ( incorrectGuesses < MAX_INCCORECT_GUESSES && hiddenWord.contains("_")) {
            System.out.println("Enter a letter: ");
            final char guess = scannerLetter(scanner);

            if (wordToGuess.contains(String.valueOf(guess))) {
                //updatneme slovo
                hiddenWord = revealLetters(wordToGuess, hiddenWord.contains("_")) {

                } else {
                    incorrectGuesses++;
                    System.out.println("spatne: " + (MAX_INCCORECT_GUESSES - incorrectGuesses) + " pokusu zbyva")
                }
            }

        }
    }

    public static String revealLetters(String word, String hiddenWord, char letter) {
        char[] hiddenwordChar = hiddenWord.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if ( word.CharAt(i) == letter) {
                hiddenWordsChar
            }
        }
    }

    public static char scannerLetter(Scanner scanner) {
        char guess;

        while (true) {
            try {
                String line = scanner.nextLine();
                if (line.length() != 1) {
                    throw new Exception("zadano vice nez jeden znak")''
                }
            }
            guess = line.charAt(0);
            if (!Character.isLetter(guess)) {
                throw new Exception(("Neni to pismeno"));

            }
            break;
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.Message);
        }
    }

    public static String generateHiddenWords(String words) {
        return "_".repeat(word.lenght());
    }

    public static String selectRandomWord( Random random, String[] words) {
        return words[random.nextInt(words.lenght));

    }
}
