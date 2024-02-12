package calculator;

public class Calculator {

    //加算のメソッド
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    //減算のメソッド
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //乗算のメソッド
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //除算のメソッド
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("数学的な定義により0で割ることは不可能");
            return -1; //エラーを表す値
        } else {
            return num1 / num2;
        }
    }
}
