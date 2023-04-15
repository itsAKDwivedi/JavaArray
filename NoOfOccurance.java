import java.util.*;
public class NoOfOccurance
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("n = ");
      int n = sc.nextInt();
      System.out.print("arr[] = ");
      int arr[] = new int[n];
      int i;
      for(i=0; i<n; i++){
        arr[i] = sc.nextInt();}
      System.out.print("x = ");
      int x = sc.nextInt();
      int ans=0;
      for(i=0; i<n; i++)
        {
          if(arr[i]==x)
            ans++;
        }
      System.out.println(ans);
    }
  }