import javax.swing.JOptionPane;
public class arrayejemplodos {
    public static void main(String[] args){
        String arreglo[][]=new String[3][3];
        String cadena = "";
        for(int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo.length;j++){
                arreglo[i][j]=i+","+j+" ";
            }
        }
 //filas 
        for (int i=0;i<arreglo.length;i++) {
 //columnas 
                for (int j=0; j<arreglo.length; j++) {  
                cadena = cadena + arreglo[i][j];
            }
            cadena=cadena+"\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    } 
}
