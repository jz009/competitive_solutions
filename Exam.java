import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correct = in.nextInt();
        in.nextLine();
        String yours = in.nextLine();
        String his = in.nextLine();
        int common = 0;
        int length = yours.length();
        for (int i = 0; i < yours.length(); i++) {
            if (yours.charAt(i) == his.charAt(i)) {
                common++;
            }


        }
        int notCommon = length - correct;
        int answer;
        answer = length -(Math.max(correct,common) - Math.min(correct, common));
        System.out.println(answer);


    }
}
