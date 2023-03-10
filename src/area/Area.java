package area;


import javax.swing.JOptionPane;
public class Area { 
//Atributos de la clase Area

double base = 0.0;
double altura = 0.0;
double radio = 0.0;
double areaCuadrado = 0.0;
double areaCirculo = 0.0;
double pi = 3.1416;

//Metodos
// Metodo para pedir al usuario los datos
public void leerNumeros(){
  base = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la base"));
  radio = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite el radio"));
  altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la altura "));
  }
//Metodo para Calcular 
public void calcularAreas(){
areaCuadrado = base * altura;
areaCirculo = pi * (radio * radio);
}
// Metodo de Resultado

public void mostrarResultado(){
JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+ areaCuadrado);
JOptionPane.showMessageDialog(null, "El área de la circunferencia es: "+ areaCirculo);

  }

}