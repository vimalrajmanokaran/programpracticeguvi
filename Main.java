import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      double a=in.nextInt();
      double b=in.nextInt();
      if(a>=1 && b>=1)
      {
      double c=(a*b)/2;
      System.out.print(c);
      }
      else
      {
       System.out.print("Check the number");   
      }
    }
}
