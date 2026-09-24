
import java.util.Scanner;

public class AIChatbot {

    public static String getResponse(String input) {

        // Basic NLP: convert input to lowercase
        input = input.toLowerCase().trim();

        // Greeting
        if (input.contains("hello") ||
            input.contains("hi") ||
            input.contains("hey")) {

            return "Hello! How can I help you?";
        }

        // Name
        else if (input.contains("your name")) {

            return "I am an AI Chatbot created using Java.";
        }

        // How are you
        else if (input.contains("how are you")) {

            return "I am doing great! Thank you for asking.";
        }

        // Java
        else if (input.contains("java")) {

            return "Java is an object-oriented programming language.";
        }

        // Internship
        else if (input.contains("internship")) {

            return "Internships help students gain practical programming experience.";
        }

        // Programming
        else if (input.contains("programming") ||
                 input.contains("coding")) {

            return "Programming is the process of creating instructions for computers.";
        }

        // Help
        else if (input.contains("help")) {

            return "Sure! Ask me about Java, programming, internships, or other topics.";
        }

        // Thank you
        else if (input.contains("thank")) {

            return "You're welcome!";
        }

        // Goodbye
        else if (input.contains("bye") ||
                 input.contains("exit")) {

            return "Goodbye! Have a great day!";
        }

        // Default response
        else {

            return "Sorry, I don't understand that yet. Please try another question.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       AI CHATBOT - JAVA");
        System.out.println("================================");
        System.out.println("Type 'bye' or 'exit' to stop.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine();

            String response = getResponse(input);

            System.out.println("Bot: " + response);
            System.out.println();

            if (input.toLowerCase().contains("bye") ||
                input.toLowerCase().contains("exit")) {

                break;
            }
        }

        sc.close();
    }
}
