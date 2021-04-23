
//ANDREZA CB3012191
//LIDIANE CB3012026
/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
*/

import java.util.Scanner;
class Ex14 {
    
    public static void main(String[] args) {
    
    double volume, r, a, aresta, volume_livre;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor da aresta da esfera: ");
    String valor = scanner.next();
    a = Double.parseDouble(valor);
    
    System.out.print("Informe o valor do raio: ");
     valor = scanner.next();
    r = Double.parseDouble(valor);
    
    aresta = Math.pow(a,3);

    volume = (4*Math.PI*Math.pow(r,3)) / 3;
     volume_livre = aresta - volume;

    System.out.println();
    System.out.println("O volume livre é: " + volume_livre);
  }
}


