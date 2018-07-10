public class Pluralize {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this pluralize Java program \nthat will pluralize the animal type \nif there is 0 or more than 1.\n";
        System.out.println(greeting);

        //establish the number variable for number of animals using the primative type "int" for integer
        int count;
        //establish the string object variable to store the kind of animal being discussed by pluralize method
        String animal;

        //test cases to comment in or out to run  program and be sure program works as expected
//        count = 10;
//        animal = "turtle";

//        count = 0;
//        animal = "dog";

        count = 1;
        animal = "dragon";

        if (count == 0){
            System.out.println("Let's pluralize! I own " + count + " "+ animal + "s.\n");
        } else if (count > 1){
            System.out.println("Let's pluralize! I own " + count + " " + animal + "s.\n");
        } else {
            System.out.println("Let's pluralize! I own " + count + " " + animal + ".\n");
        }
        System.out.println("Thanks for checking this program out. \nSuccessful code with end with the message \n\'Process finished with exit code 0\'");
    }
}
