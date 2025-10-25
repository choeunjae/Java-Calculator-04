// 계산기 v3.0 관련 클래스
// https://github.com/choeunjae/Java-Calculator-04/issues/8
public class ScientificCalculator extends Calculator {
    // 계산기 v3.0 팩토리 기능 개발 완료
    // https://github.com/choeunjae/Java-Calculator-04/issues/9

    public void setNumbers(int num1) {
        this.num1 = num1;
    }

    @Override
    public int factorial(){

        result = 1;

        for (int i = 1; i <= num1; i++){
            result *= i;
        }

        return result;
    }
}