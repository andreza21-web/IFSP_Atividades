//ANDREZA CB3012191
//LIDIANE CB3012026
/*2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.*/
import java.util.Scanner;
class Ex02 {
 
    
    public static void main(String[] args) {
    
    double aresta, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da aresta do quadrado: ");
    String valor = scanner.next();
    aresta = Double.parseDouble(valor);

    area = Math.pow(aresta, 2);

    System.out.println();
    System.out.println("Area do quadrado é : " + area);
  }
}
