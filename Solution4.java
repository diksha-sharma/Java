/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully
converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
n can range between −100 to 100 inclusive.
 */
import java.util.*;
import java.security.*;

public class Solution4
{
    public static void main(String[] args)
    {
        Do_Not_Terminate.forbidExit();

        try{
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            String s= String.valueOf(n);

            if(n==Integer.parseInt(s))
            {
                System.out.println("Good job");
            }
            else
            {
                System.out.println("Wrong answer.");
            }
        }
        catch (Do_Not_Terminate.ExitTrappedException e)
        {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class Do_Not_Terminate
{

    public static class ExitTrappedException extends SecurityException
    {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit()
    {
        final SecurityManager securityManager = new SecurityManager()
        {
            @Override
            public void checkPermission(Permission permission)
            {
                if (permission.getName().contains("exitVM"))
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
