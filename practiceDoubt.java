
import java.util.Random;

public class practiceDoubt {
    public static void main(String[] args) {
        // Create an array of messages
        String[] messages = {
            "Hello!",
            "How are you?",
            "Have a great day!",
            "Goodbye!",
            "Take care!"
        };

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random index within the range of the array
        int randomIndex = random.nextInt(messages.length);

        // Retrieve a random message from the array
        String randomMessage = messages[randomIndex];

        // Print the random message
        System.out.println("Random message: " + randomMessage);
    }
}
