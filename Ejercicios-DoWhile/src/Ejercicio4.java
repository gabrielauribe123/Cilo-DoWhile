import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args){
        int num;
        int i = 1;
        String resultado = "";
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        do{
            resultado += num + "x" + i + "=" + (num * i) + "\n";
            i++;
        }while(i <= 10);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
