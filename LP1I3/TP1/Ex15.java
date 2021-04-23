
//ANDREZA CB3012191
//LIDIANE CB3012026
/* 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).*/

import java.util.Scanner;
class Ex15{
public static void main(String[] args) {
 
   double cot_dolar, qtd_dolar, valor_reais;
 
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Digite a cotação do dolar: ");
   String valor = scanner.next();
   cot_dolar = Double.parseDouble(valor);
 
   System.out.print("Digite a quantidade de dolar: ");
   valor = scanner.next();
   qtd_dolar = Double.parseDouble(valor);
 
   valor_reais = qtd_dolar * cot_dolar;
 
 
 
   System.out.print("O valor correspondente em reais é: " + valor_reais);
  
}
}
