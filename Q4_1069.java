package CodexStart_2341006002;
import java.util.*;
public class Q4_1069
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        int i;
        long moves=0,diff;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                diff= arr[i-1]-arr[i];
                moves= moves+diff;
                arr[i]=arr[i-1];
            }

        }
        System.out.println(moves);
        
    }

}