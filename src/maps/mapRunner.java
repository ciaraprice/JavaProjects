package maps;


public class mapRunner {
    public static void main(String[] args) {

        MorseTranslator morse = new MorseTranslator();
        System.out.println(morse.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        System.out.println(morse.translate("-... .-. -.-- -.-. . / .... . .-.. .--. . -.. / -- ."));

    }
}
