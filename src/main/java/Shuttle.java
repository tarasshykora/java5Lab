import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shuttle {

    public static final Pattern SHUTTLE_MISSIONS_PATTERN = Pattern.compile("/shuttle/missions/([a-zA-Z0-9-]+)_\\d+");


    public Set<String> findUniqueMissionsNumber(String text) {
        Set<String> uniqueMissions = new HashSet<>();
        Matcher m = SHUTTLE_MISSIONS_PATTERN.matcher(text);

        while (m.find()) {
            uniqueMissions.add(m.group(1));
        }

        return uniqueMissions;
    }

    public static void main(String[] args) {
        Shuttle shuttleMissionFinder = new Shuttle();
        System.out.println(shuttleMissionFinder.findUniqueMissionsNumber("""
        /shuttle/missions/app2_2
        /shuttle/missions/app2_2
        /shuttle/missions/app2_2
        /shuttle/missions/ap2_2
    """
    ));

        }
}
