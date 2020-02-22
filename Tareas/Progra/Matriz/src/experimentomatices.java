import javax.swing.JOptionPane;

public class experimentomatices {
    public static float[][] llenado(float[][] arr){
         //para llenar arreglos multidimencional utiliza dos ciclos uno recorre fila otra columnas
        for(int k=0;k<arr.length;k++){
         for (int i=0;i<arr.length;i++){
                arr[k][i]=Float.parseFloat(JOptionPane.showInputDialog
                ("Ingrese el valor de la columna "+(k+1)+" Fila "+(i+1)));
            
        }
        }
       return arr;  
     }     
    public static float[][] suma(float[][] arruno,float[][] arrdos){
        float[][] suma=new float[3][3];
        for(int k=0;k<arruno.length;k++){
         for (int i=0;i<arruno.length;i++){
          suma[k][i]=arruno[k][i]+arrdos[k][i];     
        }
        }
        return suma;
    }
    public static String mostrar(float[][] suma){
        String mostrar="El resultado de la suma de las matrizes es \n";
         for (float[] suma1 : suma) {
             for (int i = 0; i<suma.length; i++) {
                 mostrar += suma1[i] + " ";
             }
             mostrar+="\n";
         }
        return mostrar;
    }
    public  static void main(String[] args){
        
        float[][] matrizUno=new float[3][3];
        float[][] matrizDos=new float[3][3];
        float[][] res=new float[3][3];
        String fin;
        matrizUno=llenado(matrizUno);
        matrizDos=llenado(matrizDos);
        res=suma(matrizUno,matrizDos); 
        fin=mostrar(res);
        JOptionPane.showMessageDialog(null,fin);
    }
}
