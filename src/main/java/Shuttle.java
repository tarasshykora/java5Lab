import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shuttle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shuttles: ");
        String input = scanner.nextLine();

        HashSet<String> missionSet = new HashSet<>();
        Pattern pattern = Pattern.compile("/shuttle/missions/([a-zA-Z0-9-]+)_\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String missionName = matcher.group(1);
            missionSet.add(missionName);
        }

        System.out.println("Unique missions: " + missionSet);

        scanner.close();
    }
}
