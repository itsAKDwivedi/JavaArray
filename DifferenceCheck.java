/*Given an array sorted in increasing order of size n and an integer x, find if there exists a pair in the array whose absolute difference is exactly x.(n>1)*/
import java.util.*;
public class DifferenceCheck 
{
  public static void main(String args[])
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int arr[] = new int[N];
    System.out.print("Arr[] = ");
    for(i=0; i<N; i++)
        arr[i] = sc.nextInt();
    System.out.print("x = ");
    int x = sc.nextInt();
    String s = "No";
    for(i=0; i<N-1; i++)
      {
        for(j=i+1; j<N; j++)
          {
            if(arr[j] - arr[i] == x)
            {
              s = "Yes";
              break;
            }
          }
        if(s == "Yes")
          break;
      }
    System.out.println(s);
  }
}