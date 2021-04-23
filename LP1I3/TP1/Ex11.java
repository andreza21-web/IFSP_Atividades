//ANDREZA CB3012191
//LIDIANE CB3012026
/*11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

import java.util.Scanner;
class Ex11{
public static void main(String[] args) {
 
    double diametro, area_c, raio;
 
    Scanner scanner = new Scanner(System.in);
 
    System.out.print("Digite o diâmetro do circulo: ");
    String valor = scanner.next();
    diametro = Double.parseDouble(valor);
 
    raio = diametro / 2; 
    area_c = 3.14 * (raio*raio);
 
    System.out.print("A área do circulo é: "+ area_c);
}
}
