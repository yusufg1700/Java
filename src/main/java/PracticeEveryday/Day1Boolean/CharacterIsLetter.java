package PracticeEveryday.Day1Boolean;

public class CharacterIsLetter {
    public static void main(String[] args) {
        char ch= 's';
        boolean characterIsLetter=(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
        if (characterIsLetter){
            System.out.println(ch+" character is letter");
        }else {
            System.out.println(ch+" character is not letter");
        }

        char ch2='&';
        boolean isLetter=(ch2>='a'&&ch2<='z')||(ch2>='A'&&ch2<='Z');
        String letterStatus=isLetter?"character is letter":"character is not letter";
        System.out.println(letterStatus);

    }
}
