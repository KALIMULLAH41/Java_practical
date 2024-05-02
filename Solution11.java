//Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.
//
//Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return type that is some subclass of the original return type. It is best practice to use the @Override annotation when overriding a superclass method.
//
//Implement the classes and methods detailed in the diagram below:
//
//image
//
//You will be given a partially completed code in the editor where the main method takes the name of a state (i.e., WestBengal, or AndhraPradesh) and prints the national flower of that state using the classes and methods written by you.
//
//Note: Do not use access modifiers in your class declarations.
//
//Resources
//Covariant Return Type
//Java Covariant Type
//
//Input Format
//
//The locked code reads a single string denoting the name of a subclass of State (i.e., WestBengal, Karnataka, or AndhraPradesh), then tests the methods associated with that subclass. You are not responsible for reading any input from stdin.
//
//Output Format
//
//Output is handled for you by the locked code, which creates the object corresponding to the input string's class name and then prints the name returned by that class' national flower's whatsYourName method. You are not responsible for printing anything to stdout.
//
//Sample Input 0
//
//AndhraPradesh
//Sample Output 0
//
//Lily
//Explanation 0
//
//An AndhraPradesh object's yourNationalFlower method returns an instance of the Lily class, and the Lily class' whatsYourName method returns Lily, which is printed by the hidden code checker.
//
//Language
//Java 15
//More
//474849505152535455565758596061626364656667686970
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//// Complete the classes below
//
//class Flower {
//    String whatsYourName() {
//        return "I have many names and types.";
//    }
//…
//Line: 70 Col: 1
//
//Test against custom input
//Congratulations!
//
//You have passed the sample test cases. Click the submit button to run your code against all the test cases.
//
//
//Sample Test case 0
//Input (stdin)
//AndhraPradesh
//Your Output (stdout)
//Lily
//Expected Output
//Lily

package HackerRankCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kalim
 */

    
// Complete the classes below

class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        bufferedReader.close();

        Region region;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
            default:
                region = new Region();
                break;
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

    

