import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double atBats = in.nextInt();
	in.nextLine();
	String[] values = in.nextLine().split(" ");
	double basesTotal = 0;

	for (String val : values) {
	    if (val.equals("-1")) {
	        atBats--;
        }
	    else if (val.equals("1")) {
	        basesTotal++;
        }
	    else if(val.equals("2")) {
	        basesTotal += 2;
        }
	    else if(val.equals("3")){
	        basesTotal += 3;
        }
	    else if(val.equals("4")){
	        basesTotal += 4;
        }
    }
        System.out.println(basesTotal /atBats);
    }
    }
