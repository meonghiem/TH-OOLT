// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    static double sum(double num1, double num2){
        return num1 +num2;
    }

    static double difference (double num1, double num2){
        return num1 - num2;
    }

    static double product (double num1, double num2){
        return num1*num2;
    }

    static double quotient (double num1, double num2){
        return num1/num2;
    }
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification ="You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number",
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double result = quotient(num1,num2);
        JOptionPane.showMessageDialog(null,result, "show result", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
}