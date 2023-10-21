/* NAME: SHAHID ABDUL FARHAD
 * REGD. NO.: 2341006002
 * PS LINK:  https://cses.fi/problemset/task/1069
 */ 
package CodexStart_2341006002;
import java.util.*;
public class Q3_1069 
{
    public static void main(String[] args) 
        {
            Scanner in= new Scanner(System.in);
            String s= in.next();
            int i,l,c=1,max=1;
            char ch;
            l=s.length();
            for(i=1;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch==s.charAt(i-1))
                {
                    c++;
                }
                else
                {
                    max=(int)(Math.max(max,c));
                    c=1;
                         
                }
            }
            max=(int)(Math.max(max,c));
            System.out.println(max);
        }
    
}
