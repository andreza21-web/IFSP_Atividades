
//ANDREZA CB3012191
//LIDIANE CB3012026
/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.*/

import java.util.Scanner;
class Ex08 {
    
    public static void main(String[] args) {
    
    double mm = 1852;
    double km = 1000;
    double milhas, comp_m, comp_k;
    
    String valor = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("Conversor de milha em Km: ");
    valor = scanner.next();
    milhas = Double.parseDouble(valor);
    
    comp_m = milhas * mm;
    comp_k = comp_m / km;
    

    System.out.println();
    System.out.println("A conversão de milha em km é  " + comp_k);
  }
}
