


public class Main {
    public static void main(String[] args) {

        String phrase = "The quick brown fox jumped over the lazy dog";

        System.out.println();

        String myStr = "The quick brown fox jumped over the lazy dog";

        String myStr2 = "";

        int theCharIndexStart = 0;
        int theCharIndexStop = 0;

        theCharIndexStart = myStr.indexOf("brown fox");
        System.out.println(" theCharIndexStart is: " + theCharIndexStart);


        theCharIndexStop = myStr.indexOf("x");
        System.out.println(" theCharIndexStop is: " + theCharIndexStop);

        theCharIndexStop++;

        myStr2 = myStr.substring(theCharIndexStart, theCharIndexStop);


        System.out.println( "\n myStr02 is: " + myStr2);







    }
}