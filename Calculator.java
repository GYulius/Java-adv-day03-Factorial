package task02;

public class Calculator {
    public static int factorial(int number) {
        if(number < 0 ){
            throw new IllegalArgumentException("factorial doesn't exist for negative numbers");

        }
        int result = 1;
        for (int i = 2; i <= number ; i++) {
            result = result * i;
        }
        return result; // factorial method

    }
    public static int binominalCoefficient(int n, int k){
        if(k > n || n < 0 || k < 0) {
           throw new IllegalArgumentException("Invalid input for n and k");
        }
        return factorial(n) / (factorial(n-k) * factorial(k));


    }
}
