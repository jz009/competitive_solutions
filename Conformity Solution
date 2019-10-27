import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.nextLine();
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> lineClone = new ArrayList<>();

    for (int i = 0; i < x; i++) {
        String[] list = in.nextLine().split(" ");
        Arrays.sort(list);
        String strList = String.join("", list);
        lines.add(strList);
    }
        HashMap<String, Integer> counts = new HashMap<>();


        for (String student : lines) {
            Integer count = counts.get(student);
            counts.put(student, (count == null) ? 1 : count + 1);
        }
        int max = 0;
        int multi = 0;
        for (int value : counts.values()) {
            if (value > max) {
                multi = 0;
                max = value;
            }
            if (value == max) {
                multi++;
            }
        }
        System.out.println(max * multi);
    }
}
