package CodexStart_2341006002;
import java.util.*;
class Q3_1069
    {
        public static void main(String[] args) 
        {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter a string");
            String s= in.next();
            int i,l,j,c=0,ind=0,max=0;
            char ch,ch1;
            l=s.length();
            int a[]= new int [l];
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                for(j=0;j<l;j++)
                {
                    ch1=s.charAt(j);
                    if(ch1==ch)
                    {
                        c++;
                    }

                }
                a[ind]=c;
                c=0;
                ind++;
            }

            max=a[0];
            for(i=1;i<l;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
            }
            System.out.println(max);
    }
}
