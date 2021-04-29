import java.util.Scanner;
public class Linecom {
   public static void main(String[] args) {
      System.out.println("Welcome to Line Comparison Computation Program");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first two co-ordinates:");
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      System.out.println("Enter second two co-ordinates:");
      int y1=sc.nextInt();
      int y2=sc.nextInt();
      double length;
      length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("Length of the line:" + length);

	}
}
