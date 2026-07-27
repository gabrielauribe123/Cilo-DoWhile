import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n" + "1. Saludar\n" + "2. Salir"));
            if (opcion == 1){
                JOptionPane.showMessageDialog(null, "ODAAAAAA");
            }
        }while(opcion != 2);
        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}
