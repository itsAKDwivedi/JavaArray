import java.util.*;
public class Main {
  static void InputArray(int a[] , int length , Scanner sc) {
    for(int i=0; i<length; i++) {
      a[i]=sc.nextInt();
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    InputArray(a, n, sc);
    InputArray(b, n, sc);
    boolean ans = true;
    for(int i=0; i<n; i++) {
      if(a[i]!=b[i]) {
        ans = false;
        break;
      }        
    }
    System.out.println(ans);
  }
}