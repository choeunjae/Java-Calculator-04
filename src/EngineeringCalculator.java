// 계산기 v4.0 관련 클래스
// https://github.com/choeunjae/Java-Calculator-04/issues/13
public class EngineeringCalculator extends Calculator {
    // 계산기 v4.0 파이 기능 개발 완료
    // https://github.com/choeunjae/Java-Calculator-04/issues/14

    double PI = 3.141592;
    double result;

    public void setNumbers(double num1) {
        this.num1 = (int) num1;
    }

    public double calcCircle() {
        result = 2 * PI * num1;
        return result;
    }

    public void displayCircle() {
        System.out.println(result);
    }
}   