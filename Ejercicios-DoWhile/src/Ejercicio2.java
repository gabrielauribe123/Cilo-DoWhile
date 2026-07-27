import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args){
        int num;
        int suma = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para salir)"));
            suma += num;
        }while (num != 0);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
