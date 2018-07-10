import java.util.stream.IntStream;

public class FlipNCoins {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this flipping coins Java program \nthat will flip a virtual coin \nand return either heads or tails on each line\n for \'n\' times.\nWhen \'n\' flips are completed a summary message will appear below the flip report.\n";
        System.out.println(greeting);
        //initialize the variable "n" for number of flips to be used in the flipNHeads method
        int n =0;
        //sets the number of flips
        flipNHeads(4);
    }

    public static void flipNHeads(int n) {


        //sets values for string output messages of either heads or tails
        int heads = 0;
        int flips = 0;

        //generates heads or tails by using the random number generator the number of times as determined by the value n
        do {
            //generates a random number with a floor of 0 and ceiling of 1

            if (Math.random() <= .5) {
                System.out.println("tails");
                heads = 0;
            } else {
                System.out.println("heads");
                heads++;
            }
            flips++;
        } while (heads != n);
        if (heads <= 1) {
            System.out.println("It took " + flips + " flips to flip "+ n + " head in a row");
        } else{
            System.out.println("It took " + flips + " flips to flip "+ n + " heads in a row");
        }
    }
}

