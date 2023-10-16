
/* NAME: SHAHID ABDUL FARHAD
 * REGD. NO.: 2341006002
 * PS LINK:  https://cses.fi/problemset/task/1083
 */
package CodexStart_2341006002;
import java.util.*;
class Q2_1083
    {
        public static void main(String[] args) 
        {
            Scanner in= new Scanner(System.in);
            int n,i,j,s=0,s1=0;
            n=in.nextInt();
            for(i=1;i<n;i++)
            {
                j=in.nextInt();
                s=s+j;
            }
            for(i=1;i<=n;i++)
            {
                s1=s1+i;

            }
            System.out.println(s1-s);
        }
    }
            
            