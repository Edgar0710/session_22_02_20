import javax.swing.JOptionPane;
public class Ejemplo {
    public static void main(String[] args){
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
        int res=a+b;
        JOptionPane.showMessageDialog(null,"la suma se los dos numeros es "+res);
    }
}
