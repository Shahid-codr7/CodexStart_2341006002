/* NAME: SHAHID ABDUL FARHAD
 * REGD. NO.: 2341006002
 * PS LINK:  https://cses.fi/problemset/task/1068
 */

package CodexStart_2341006002;             
import java.util.*;
public class Q1_1068
{
    public static void main(String[] args) 
    {

    Scanner sc = new Scanner (System.in);
    int n;        
    System.out.println("Enter a no.=");
    n=sc.nextInt();
    while(n!=1)
        {
        System.out.print(n+" ");
        if(n%2==0)
            {
             n=n/2;
            }
        else
           {
            n=n*3;
            n=n+1;
           }
        }
        System.out.print(n);
    }


}
    
