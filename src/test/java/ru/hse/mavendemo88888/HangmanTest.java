package ru.hse.mavendemo88888;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HangmanTest {
    @Test
    void hangmanMasksWord() {
        Hangman hangman = new Hangman("колобок");

        assertEquals("_______", hangman.getMaskedWord());
    }

    @Test
    void hangmanMasksWord2() {
        Hangman hangman = new Hangman("колобокq");

        assertEquals("________", hangman.getMaskedWord());
    }

    @Test
    void letterGuessed() {
        Hangman hangman = new Hangman("колобок");

        assertTrue(hangman.guessLetter('б'));
        assertEquals("____б__", hangman.getMaskedWord());
    }
}
