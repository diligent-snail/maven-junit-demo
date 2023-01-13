package ru.hse.mavendemo88888;

public class Hangman {

    private final String word;
    private String maskedWord;

    public Hangman(String word) {
        this.word = word;
        this.maskedWord = "_".repeat(word.length());
    }

    public String getMaskedWord() {


        return maskedWord;
    }

    public boolean guessLetter(char c) {
        StringBuilder newMaskedWord = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) == c) {
                newMaskedWord.append(c);
            } else {
                newMaskedWord.append(maskedWord.charAt(i));
            }
        }
        maskedWord = newMaskedWord.toString();
        return word.contains("" + c);
    }
}
