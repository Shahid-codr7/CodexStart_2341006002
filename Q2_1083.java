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
            System.out.println("Enter n=");
            int n = in.nextInt();
            int m = n-1;
            int a[]=new int [m];
            int i,j,x=1,flg=0;
            //ENTER NOS. 1 TO N
            System.out.println("Enter nos. between 1 and "+n);
            for(i=0;i<m;i++)
            {
                a[i]=in.nextInt();
            }
            //Sorting in ascending order

            for(i=0;i<m-1;i++)
            {
                for(j=0;j<m-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            for(i=0;i<m;i++)
            {
                if(x!=a[i])
                {
                    System.out.print(x+" ");
                    flg=1;
                }
                if(flg==1)
                break;
                
                x++;
            }
            System.out.println(n);
            

        }

    }