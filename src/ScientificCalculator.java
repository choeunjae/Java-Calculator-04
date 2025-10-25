public class ScientificCalculator extends Calculator {
    @Override
    public int factorial(){

        result = 1;

        for (int i = 1; i <= num1; i++){
            result *= i;
        }

        return result;
    }
}