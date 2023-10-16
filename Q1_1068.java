/* NAME: SHAHID ABDUL FARHAD
 * REGD. NO.: 2341006002
 * PS LINK:  https://cses.fi/problemset/task/1068*/
package CodexStart_2341006002;           
import java.util.*;
public class Q1_1068
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n;        
        n=sc.nextInt();
        WeirdAlgo(n);
    }
    public static void WeirdAlgo(long n)
    {
        System.out.print(n+" ");
        if(n==1)
        return;
        if(n%2==0)
        {
            n=n/2;
        }
        else if(n%2!=0)
          {
            n=n*3;
            n=n+1;
        }
      WeirdAlgo(n);

    }
}
