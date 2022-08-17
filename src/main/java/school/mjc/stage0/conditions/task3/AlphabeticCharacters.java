package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!Character.isAlphabetic(character))
            System.out.println("wrong alphabet!");
        else {
            if (character == 'e' || character == 'u' || character == 'i' || character == 'o' || character == 'a')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
    }
}
