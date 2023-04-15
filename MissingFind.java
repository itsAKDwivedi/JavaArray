import java.util.Arrays;
import java.util.Scanner;

public class MissingFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.print("arr[] = ");
        int i;
        for(i=0; i<N-1; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(i=0; i<=N; i++)
            {
                if(arr[i]!=i)
                {
                    System.out.println(i);
                    break;
                }
            }
    }
}
