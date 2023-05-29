package Practice.p01;

import java.util.Scanner;

public class Q04_IfStatementRightTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type first edge");
        int firstEdge=input.nextInt();

        Scanner input2=new Scanner(System.in);
        System.out.println("type second edge");
        int secondEdge=input.nextInt();

        Scanner input3=new Scanner(System.in);
        System.out.println("type long edge");
        int longEdge=input.nextInt();

        if ((firstEdge*firstEdge)+(secondEdge*secondEdge)==(longEdge*longEdge)){
            System.out.println("this is a Right triangle");
        }else if ((secondEdge*secondEdge)+(longEdge*longEdge)==(firstEdge*firstEdge)){
            System.out.println("this is Right triangle");
        } else if ((firstEdge*firstEdge)+(longEdge*longEdge)==(secondEdge*secondEdge)) {
            System.out.println("this is Right triangle");
        }else {
            System.out.println("this is not Right triangle");
        }
    }
}

