
//ANDREZA CB3012191
//LIDIANE CB3012026
/*12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.*/

import java.util.Scanner;
class Ex12{
public static void main(String[] args) {
 
   double v_cone, altura, raio_base;
 
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Digite altura do cone: ");
   String valor = scanner.next();
   altura = Double.parseDouble(valor);
 
   System.out.print("Digite raio d base do cone: ");
   valor = scanner.next();
   raio_base = Double.parseDouble(valor);
 
   v_cone = (3.14 * (raio_base*raio_base) * altura) / 3;
 
   System.out.print("O volume do cone é: "+ v_cone);
}
}
 
