import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      if(a>=1 && b>=1)
      {
      int c=(a*b)/2;
      System.out.print(c);
      }
      else
      {
       System.out.print("Check the number");   
      }
    }
}
