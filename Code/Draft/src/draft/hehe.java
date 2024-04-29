import java.util.*;

public class hehe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = "Welcome Hue University of Sciences";
        String[] messageWords = message.split("\\s+");
        Set<String> inputWords = new HashSet<>();

        String line = scanner.nextLine();
        //while (!(line = scanner.nextLine()).isEmpty()) {
            String[] words = line.split("\\s+");
            inputWords.addAll(Arrays.asList(words));
        //}

        int count = 0;
        for (String word : messageWords) {
            if (inputWords.contains(word)) {
                count++;
            }
        }

        if (count == messageWords.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}