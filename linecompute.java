import java.util.*;
class Linecom {
      double length;
      double length2;
      Scanner sc = new Scanner(System.in);
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int y1=sc.nextInt();
      int y2=sc.nextInt();
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
   static{
      System.out.println("Welcome to Line Comparison Computation Program");
      System.out.println("Enter your 8 coordinates for computation");
   }

   Linecom(){
      System.out.println("Processing..............");
   }
   void length1computation(){
      length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
      System.out.println("Length of the line1:" + length);
   }
   void length2computation(){
      length2=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
      System.out.println("Length of the line2:" + length2);
   }
   void comparision(){
      String str1=length+"";
      String str2=length2+"";
      if(str1.equals(str2)==true)
         System.out.println("The two lines are equal");
      else
         System.out.println("The two lines are not equal");
      double check = str1.compareTo(str2);
      if(check == 0)
         System.out.println("The two lines are equal");
      else if(check < 0.0)
         System.out.println("Line1 is smaller than Line2");
      else
         System.out.println("Line1 is greater than Line2");
   }
   public static void main(String[]args){
      Linecom a=new Linecom();
      a.length1computation();
      a.length2computation();
      a.comparision();
   }
}
