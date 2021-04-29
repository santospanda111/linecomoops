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
      double length2;
      System.out.println("Enter third co-ordinates:");
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      System.out.println("Enter fourth co-ordinates:");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      length2=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
      System.out.println("Length of the line:" + length2);
      String str1=length+"";
      String str2=length2+"";
      if(str1.equals(str2)==true)
         System.out.println("The two lines are equal");
      else
         System.out.println("The two lines are not equal");

	}
}
