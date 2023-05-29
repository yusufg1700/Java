package Day09Loops;

public class forLoop02 {
    public static void main(String[] args) {
        /*
            example 1:type code to print characters except "m" in a String
            for example andromeda ==>Androeda
         */
        /*//1.way
        String text="Andromeda";
        String newtext=text.replaceAll("m","");
        System.out.println(newtext);
        //2.way
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)=='m'){
                continue;
            }else {
                System.out.print(text.charAt(i));
            }
            */
            /*
            example 2: type code to print characters before "m" in a string for example luxembourg==>Luxe
             */
            String city="Luxembourg";
            for (int i=0;i<city.length();i++){
                if (city.charAt(i)=='m'){
                    break;
                }
                System.out.print(city.charAt(i));
            }

    }



}


