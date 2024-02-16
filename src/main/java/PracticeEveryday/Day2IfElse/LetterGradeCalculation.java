package PracticeEveryday.Day2IfElse;

public class LetterGradeCalculation {
    public static void main(String[] args) {
        int note=85;
        if  (note>=90){
            System.out.println("your note is A");
        } else if (note>=80) {
            System.out.println("your note is B");
        } else if (note>=70) {
            System.out.println("your note is C");
        }
//=============================================================================================
        int note2=48;
        char letterGrade=(note2>=80)? 'A': (note2>=60)? 'B': (note2>=40)? 'C':(note2>=30)?'D':'F';
        System.out.println(letterGrade);
    }
}
