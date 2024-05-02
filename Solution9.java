//You are given an integer  n, you have to convert it into a string.
//
//Please complete the partially completed code in the editor. If your code successfully converts  n into a string  s the code will print "Good job". Otherwise it will print "Wrong answer".
//
//n can range between -100 to 100  inclusive.
//
//Sample Input 0
//
//100
//Sample Output 0
//
//Good job
package HackerRankCode;

import java.security.Permission;
import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution9 {
   


    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // Convert integer n to a string
            String s = String.valueOf(n);
            // Print "Good job"
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class prevents the program from terminating when calling System.exit()
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

    

