import java.time.LocalDateTime;

public class CommandLineClock {
    public static void main(String[] args) throws InterruptedException {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this Command Line Clock Java program \nthat will print out the time, second by second \n that can only be stopped by CTRL +C or the stop button in the IDE";
        System.out.println(greeting);
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();

                String format = "%02d:%02d:%02d";
                String output = String.format(format, hour, minute, second);
                System.out.println(output);

                try {
                    Thread.sleep(1000);
                }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }


        }

    }

