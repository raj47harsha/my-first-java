import java.util.Scanner;

public class evodd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int     a  = sc.nextInt();
    if (a%2==0) {
      System.out.println("number is even");
    }else System.out.println("number is odd");
    sc.close();
  } 
}
