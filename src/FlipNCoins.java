import java.util.stream.IntStream;

public class FlipNCoins {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this flipping coins Java program \nthat will flip a virtual coin \nand return either heads or tails on each line\n for \'n\' times.\nWhen \'n\' flips are completed a summary message will appear below the flip report.\n";
        System.out.println(greeting);
    }

    public flipNHeads(ints n) {

        //sets the number of flips
        int n;

        //test cases to comment in or out to test various number of flips and their results
        // n = 3;
        // n = 1;
         n = 6;

        //sets values for string output messages of either heads or tails
        String resultA = "heads";
        String resultB = "tails";

        //generates heads or tails by using the random number generator the number of times as determined by the value n
        for (i = 0; i<n; i++, n++) {
            //generates a random number with a floor of 0 and ceiling of 1
            IntStream c = IntStream.range(0, 1);
            if (c < .5) {
                System.out.println(resultB + "\n");
            } else if (n >= .5) {
                System.out.println(resultA + "\n");
            }
            System.out.println("\n");
        }
    }
}

