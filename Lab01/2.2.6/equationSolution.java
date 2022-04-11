import javax.swing.JOptionPane;
// import static java.lang.Math;
public class equationSolution{

    public static void problem1(double a, double b){
        
        if(a == 0 ){
            if(b == 0 ){
                JOptionPane.showMessageDialog(null, "Vo so nghiem", "result", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Vo nghiem", "result", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            double result = -b /a;
            JOptionPane.showMessageDialog(null, "Nghiem la:" +result, "result", JOptionPane.INFORMATION_MESSAGE);    
        }
    }

    public static void problem2(double a11, double a12, double b1, double a21, double a22, double b2){
        // tính Det của ma trận
        double D = a11 * a22 - a12 * a21;
        double D1 = b1 *a22 - b2 *a12;
        double D2 = a11 *b2 - a21*b1;

        if (D != 0 ){
            double x1 =  D1/D;
            double x2 =  D2/D;
            JOptionPane.showMessageDialog(null, "(x1, x2):" +"("+x1 +',' +x2 +")", "result", JOptionPane.INFORMATION_MESSAGE); 
        }else{
            if( D1 == 0 && D2 == 0){
                JOptionPane.showMessageDialog(null, "Vo so nghiem", "result", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Vo nghiem", "result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void problem3(double a, double b, double c){
        if (a == 0){
            problem1(b,c);
        }else{
            double delta = b * b -4 * a * c;
            if(delta == 0 ){
                double x = -b/(2*a);
                JOptionPane.showMessageDialog(null, "1 nghiem:" +x, "result", JOptionPane.INFORMATION_MESSAGE);
            }else if( delta < 0){
                JOptionPane.showMessageDialog(null, "Vo nghiem", "result", JOptionPane.INFORMATION_MESSAGE);
            }else{
                double x1 = (-b + Math.sqrt(delta))/(2 * a);
                double x2 = (-b -Math.sqrt(delta))/(2 * a);
                JOptionPane.showMessageDialog(null, "(x1, x2):" +"("+x1 +',' +x2 +")", "result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void main(String[] args){
        int option;
        option = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Please input the option number: ","Input the option number",
            JOptionPane.INFORMATION_MESSAGE));

        if ( option == 1)
        {
            String strNum1, strNum2;
            strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number: ","Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
            strNum2 = JOptionPane.showInputDialog(null,
            "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(strNum1);
            double b = Double.parseDouble(strNum2);
            problem1(a,b);
        }else if (option == 2){
            double a11,a12,a21,a22,b1,b2;
            a11 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the a11: ", "Input the a11:",JOptionPane.INFORMATION_MESSAGE));

            a12 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the a12: ", "Input the a12:",JOptionPane.INFORMATION_MESSAGE));

            a21 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the a21: ", "Input the a21:",JOptionPane.INFORMATION_MESSAGE));

            a22 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the a22: ", "Input the a22:",JOptionPane.INFORMATION_MESSAGE));

            b1 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the b1: ", "Input the b1:",JOptionPane.INFORMATION_MESSAGE));

            b2 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the b2: ", "Input the b2:",JOptionPane.INFORMATION_MESSAGE));

            problem2(a11,a12,a21,a22,b1,b2);
        }else{
            double a,b,c;
            a = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the a: ", "Input the a:",JOptionPane.INFORMATION_MESSAGE));

            b = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the b: ", "Input the b:",JOptionPane.INFORMATION_MESSAGE));

            c = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Please input the c: ", "Input the c:",JOptionPane.INFORMATION_MESSAGE));

            problem3(a,b,c);
        }
        System.exit(0);
    }
}