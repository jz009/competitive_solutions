import java.awt.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String[] rowColN = in.nextLine().split(" ");
	int rows = Integer.parseInt(rowColN[0]);
	int cols = Integer.parseInt(rowColN[1]);
	ArrayList<Point> coords = new ArrayList<Point>();
	for (int i = 0; i < Integer.parseInt(rowColN[2]); i++) {
	     String[] weakSpots = in.nextLine().split(" ");
        Point f = new Point(Integer.parseInt(weakSpots[0]), Integer.parseInt(weakSpots[1]) );
	     if (!coords.contains(f)) {
             coords.add(f);
         }
    }
	char[][] matrix = new char[rows][cols];
	for (Point coord : coords) {
	    matrix[coord.x -1][coord.y-1] ='L';
    }

    int count = 1;
	int bigTotal = coords.size();
	int total = rows*cols;


        while (bigTotal != total) {
            ArrayList<ArrayList<Point>> bigList = new ArrayList<ArrayList<Point>>();
            for (Point coord : coords)
                 bigList.add(flood(coord.x -1 , coord.y-1, matrix));
            count++;
            ArrayList<Point> newCoords = new ArrayList<Point>();
            for (ArrayList<Point> subList : bigList) {
                for (Point point : subList) {
                    if(!newCoords.contains(point))
                        newCoords.add(point);
                }
            }
            bigTotal += newCoords.size();
            coords = newCoords;
        }
        System.out.println(count);
    }



    public static ArrayList<Point> flood(int rowInd, int colInd, char[][] mat) {
        ArrayList<Point> ret = new ArrayList<Point>();
        if ((rowInd - 1) >= 0 && (mat[rowInd - 1][colInd] != 'L' )) {
            mat[rowInd - 1][colInd] = 'L';
            ret.add(new Point(rowInd - 1  + 1, colInd + 1));
        }
        if((rowInd + 1) < mat.length && (mat[rowInd + 1][colInd] != 'L' )) {
            mat[rowInd + 1][colInd] = 'L';
            ret.add(new Point(rowInd + 1 + 1, colInd + 1) );
        }
        if ((colInd - 1) >= 0 && (mat[rowInd][colInd - 1] != 'L' )) {
            mat[rowInd][colInd - 1] = 'L';
            ret.add(new Point(rowInd + 1, colInd - 1 + 1) );
        }
        if ((colInd + 1) < mat[0].length && (mat[rowInd][colInd + 1] != 'L' )) {
            mat[rowInd][colInd + 1] = 'L';
            ret.add(new Point(rowInd + 1, colInd + 1 + 1) );
        }

        return ret;
    }

}
