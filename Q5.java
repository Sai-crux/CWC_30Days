package cwc30;

import java.util.Scanner;

public class Q5 {

	static class Coord{
		  int x, y;
    	}
 static  boolean intersect(Coord a1, Coord b1, Coord a2, Coord b2) {    
          if (a1.x == b1.x || a1.y == b1.y || a2.x == b2.x || a2.y == b2.y){
                return false;
            }
        if (a1.x >= b2.x || a2.x >= b1.x) {
            return false;
        }
        if (a1.y >= b2.y || a2.y >= b1.y) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Coord a1 = new Coord();
        Coord a2 = new Coord();
        Coord b1 = new Coord();
        Coord b2 = new Coord();
        System.out.println("Enter the coordinates of first rectangle: ");
        a1.x = sc.nextInt();
        a1.y = sc.nextInt();
        b1.x = sc.nextInt();
        b1.y = sc.nextInt();
        System.out.println("Enter the coordinates of second rectangle: ");
        a2.x = sc.nextInt();
        a2.y = sc.nextInt();
        b2.x = sc.nextInt();
        b2.y = sc.nextInt();
        if (intersect(a1, b1 , a2 , b2)) {
            System.out.println("The rectangles intersect.");
        } else {
        	System.out.println("The rectangles do not intersect.");
        }
    }
}


