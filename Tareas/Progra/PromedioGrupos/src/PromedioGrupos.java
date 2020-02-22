
import javax.swing.JOptionPane;

public class PromedioGrupos {
    public static String[] nombres(String nom[]) {
        for (int i = 0; i < nom.length; i++) {
            nom[i] = JOptionPane.showInputDialog("ingres el nombre del alumno " + 
                    (i + 1) + ":");
        }
        return nom;
    }
    public static float[] calificaciones(float[] cal, String[] nom) {
        int j = 0;
        while (j < cal.length) {
            cal[j] = Float.parseFloat(JOptionPane.showInputDialog
                 ("Ingrese la calificacion del alumno " + nom[j]));
            if (cal[j] <= 10 && cal[j] >= 0) {
                j++;
            } else {
                JOptionPane.showMessageDialog(null, "El valor ingresado es invalido\n"
                        + "Valores validos entre(0-10)");
            }
        }
        return cal;
    }
    public static float promedio(float[] prom) {
        float promedio = 0.f ,promf;
        for (int i = 0; i < prom.length; i++) {
            promedio += prom[i];
        }
        promf = (promedio /(int)( prom.length));
        return promf;
    }
    public static String ane(String[] cad, float[] cal) {
        float menor = 10, mayor = 0;
        int i = 0;
        String ane = "", let = "",
        alumaymen = "Los alumnos con la mayor y menor calificacion son:\n";
        while (i < cal.length) {
            if (cal[i] >= mayor) {
                if (mayor == cal[i]) {
                    ane += " " + cad[i];
                } else {
                    mayor = cal[i];
                    ane = cad[i];
                }
            }
            if (cal[i] <= menor) {
                if (cal[i] == menor) {
                    let += " " + cad[i];
                } else {
                    menor = cal[i];
                    let = cad[i];
                }
            }
            i++;
        }
        alumaymen += ane + " Con una calificacion de " + mayor + "\n" +
                     let + " Con una calificacion de " + menor;
        return alumaymen;
    }
    public static void main(String[] args) {
        int tam;
        float a[], c;
        String b[], e, grupo;
        grupo=JOptionPane.showInputDialog("Ingrese el nombre del grupo que desea promediar");
        tam = Integer.parseInt(JOptionPane.showInputDialog("ingrese es el tamaño del  grupo "+grupo));
        a = new float[tam];
        b = new String[tam];
        b = nombres(b);
        a = calificaciones(a, b);
        c = promedio(a);
        e = ane(b, a);
        JOptionPane.showMessageDialog(null, "el promedio del grupo "+grupo
                +" es: " + c + "\n" + e);
    }
}
 