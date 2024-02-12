package calculator;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("数値1を入力してください: ");
        double num1 = scanner.nextDouble();

        System.out.println("数値2を入力してください");
        double num2 = scanner.nextDouble();

        //計算結果を一時的に保存する
        double result;

        System.out.println("演算子(+,-,*,/)を入力してください: ");
        char operator = scanner.next().charAt(0); //1文字目を取得

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                System.out.println("計算実行結果: " + result);
                break;

            case '-':
                result = calculator.subtract(num1, num2);
                System.out.println("計算実行結果: " + result);
                break;

            case '*':
                result = calculator.multiply(num1, num2);
                System.out.println("計算実行結果: " + result);
                break;

            case '/':
                result = calculator.divide(num1, num2);
                    if (result != -1) {  //0での除算エラーチェック
                        System.out.println("計算実行結果: " + result);
                    }
                    break;

            default:
                    System.out.println("無効な演算子です。");
                

        }
    }
}
