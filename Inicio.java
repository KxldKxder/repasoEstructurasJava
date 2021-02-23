package fes.aragon.inicio;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {

        try {
            String[] programas = {"1.If", "2.While", "3.Do-while", "4.While(Factorial)", "5.While(Obtener valor de e)", "6.While(Obtener el valor de e^x)", "7.Arreglos"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "¿Qué ejemplo deseas ejecutar?",
                    "Selección", JOptionPane.QUESTION_MESSAGE, null, programas, JOptionPane.DEFAULT_OPTION);

            switch (seleccion) {
                case "1.If":
                    //JOptionPane.showMessageDialog(null, "1.If");
                    control();
                    break;
                case "2.While":
                    //JOptionPane.showMessageDialog(null, "2.While");
                    ciclos();
                    break;
                case "3.Do-while":
                    //JOptionPane.showMessageDialog(null, "3.Do-while");
                    ciclosDos();
                    break;
                case "4.While(Factorial)":
                    //JOptionPane.showMessageDialog(null, "4.While(Factorial)");
                    ciclosTres();
                    break;
                case "5.While(Obtener valor de e)":
                    //JOptionPane.showMessageDialog(null, "5.While(Obtener valor de e)");
                    ciclosCuatro();
                    break;
                case "6.While(Obtener el valor de e^x)":
                    //JOptionPane.showMessageDialog(null, "6.While(Obtener el valor de e^x)");
                    ciclosCinco();
                    break;
                case "7.Arreglos":
                    //JOptionPane.showMessageDialog(null, "7.Arreglos");
                    arregos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccion invalida");
                    break;
            }
        } catch (Exception main) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public static void control() {
        String palabra = JOptionPane.showInputDialog(null, "Inserte un valor", "If", JOptionPane.DEFAULT_OPTION);
        try {
            int a = Integer.parseInt(palabra);
            if (a == 10) {
                JOptionPane.showMessageDialog(null, "A es " + a, "If", JOptionPane.DEFAULT_OPTION);
            } else if (a == 20) {
                JOptionPane.showMessageDialog(null, "A es " + a, "If", JOptionPane.DEFAULT_OPTION);
            } else if (a == 30) {
                JOptionPane.showMessageDialog(null, "A es " + a, "If", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "No está en el rango permitido", "If", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.fillInStackTrace();
        }
    }

    public static void ciclos() {
        try {
            int a = 0;
            while (a <= 10) {
                JOptionPane.showMessageDialog(null, "El contador vale " + a, "While", JOptionPane.DEFAULT_OPTION);
                a++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.fillInStackTrace();
        }
    }

    public static void ciclosDos() {
        try {
            int dec;
            String numeros;
            int intNumeros[] = new int[2];
            do {
                numeros = JOptionPane.showInputDialog(null, "Teclea dos numeros: \nEjemplo: 16 12", "DoWhile", JOptionPane.DEFAULT_OPTION);
                String arregloNumeros[] = numeros.split(" ");
                intNumeros[0] = Integer.parseInt(arregloNumeros[0]);
                intNumeros[1] = Integer.parseInt(arregloNumeros[1]);
                JOptionPane.showMessageDialog(null, "La suma de los numeros es: \n" + intNumeros[0] + " + " + intNumeros[1] + " = " + (intNumeros[0] + intNumeros[1]), "DoWhile", JOptionPane.DEFAULT_OPTION);
                dec = JOptionPane.showConfirmDialog(null, "¿Otra suma?", "DoWhile", JOptionPane.YES_NO_OPTION);
            } while (dec == 0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.fillInStackTrace();
        }
    }

    public static void ciclosTres() {
        try {
            String numero = JOptionPane.showInputDialog(null, "Teclea un valor:", "Factorial", JOptionPane.DEFAULT_OPTION);
            int numeroFact = Integer.parseInt(numero);
            double n = 1;
            double fact = 1;
            while (n <= numeroFact) {
                fact *= n;
                n++;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + fact, "Factorial", JOptionPane.DEFAULT_OPTION);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.fillInStackTrace();
        }
    }

    public static void ciclosCuatro() {
        try {
            double n = 1, m = 1;
            double fact = 1;
            double e = 1;
            while (m < 10) {
                n = 1;
                //Calcular el valor del factorial
                while (n <= m) {
                    fact *= n;
                    n++;
                }
                e += 1 / fact;
                fact = 1;
                m++;
            }
            JOptionPane.showMessageDialog(null, "El valor de e es: " + e, "Valor de e", JOptionPane.DEFAULT_OPTION);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.fillInStackTrace();
        }
    }

    public static void ciclosCinco() {
        try {
            String numero = JOptionPane.showInputDialog(null, "Teclea un valor de x para calcular: \ne^x:", "Valor de e^x", JOptionPane.DEFAULT_OPTION);
            int x = Integer.parseInt(numero);

            double n = 1, m = 1;
            double fact = 1;
            double e = 1;
            //calcular el valor del e^x
            while (m < 10) {
                n = 1;
                while (n <= m) {
                    fact *= n;
                    n++;
                }
                e += 1 / fact;
                fact = 1;
                m++;
            }
            //Elevamos e a x
            e = Math.pow(e, x);
            JOptionPane.showMessageDialog(null, "El valor de e^" + numero + " es: " + e, "Valor de e^x", JOptionPane.DEFAULT_OPTION);
        } catch (Exception ex) {

        }
    }

    public static void arregos() {
        String[] arreglo = {"Norte", "Sur", "Este", "Oeste"};
        int[][] arreglo2 = {{1, 2, 3}, {3, 4}};
        String[] imp = new String[arreglo2.length];
        String imp2 = "";
        for(int i =0; i<imp.length;i++){
            imp[i]="";
        }
        
        int[] arreglo3 = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            JOptionPane.showMessageDialog(null, arreglo[i]);
        }

        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                imp[i] = imp[i] + String.valueOf(arreglo2[i][j]);
                System.out.print(arreglo2[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i =0; i<imp.length;i++){
            JOptionPane.showMessageDialog(null, imp[i]);
        }
        
        for (int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = i;
            imp2 = imp2 + String.valueOf(arreglo3[i]);
        }
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.print(arreglo3[i] + " ");
        }
        
        JOptionPane.showMessageDialog(null, imp2);
        
    }
}