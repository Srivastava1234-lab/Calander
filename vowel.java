public class Vowel {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String str = Terminal.readString("Quote");
        for(int k = 0; k < str.length(); k++) {
            char c = str.charAt(k);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowel count is " + vowels);
        System.out.println("Consonant count is: " + consonants);
    }
}
