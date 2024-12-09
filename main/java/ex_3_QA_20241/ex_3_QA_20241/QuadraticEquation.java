package ex_3_QA_20241.ex_3_QA_20241;

/**
 * Hello world!
 */
public class QuadraticEquation {

    public String classifyRoots(int a, int b, int c) {
        if (a == 0) {
            return "Not a quadratic equation";}

        if (a < 5 || a > 200 || b < 5 || b > 200 || c < 5 || c > 200) {
            return "Error: Input out of range";
        }

        int delta = b * b - 4 * a * c;

 
        if (delta > 0) {
            return "Real roots"; }
        else if (delta == 0) {
            return "Equal roots"; } else {
            return "Imaginary roots";
        }

    }
}

    

