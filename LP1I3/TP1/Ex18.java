//ANDREZA CB3012191
//LIDIANE CB3012026
/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. */

import java.util.Scanner;
class Ex18 {
    
    public static void main(String[] args) {
    
    double a1,a2,a3,a4,a5,pagamento,somapreco, total;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o produto 1:  ");
    String valor = scanner.next();
    a1 = Double.parseDouble(valor);

    System.out.print("Informe o produto 2:  ");
    valor = scanner.next();
    a2 = Double.parseDouble(valor);

    System.out.print("Informe o produto 3:  ");
    valor = scanner.next();
    a3 = Double.parseDouble(valor);
    
    System.out.print("Informe o produto 4:  ");
    valor = scanner.next();
    a4 = Double.parseDouble(valor);

    System.out.print("Informe o produto 5:  ");
    valor = scanner.next();
    a5 = Double.parseDouble(valor);
    
    total = a1+ a2 + a3 + a4 + a5;
   System.out.println("O valor total gasto em produtos é " + total);

    System.out.print("Informe o valor pago:  ");
     valor = scanner.next();
    somapreco = Double.parseDouble(valor);

    pagamento =  somapreco - total;
    

    System.out.println();
    System.out.println("O troco é de : " +  pagamento);
     
  }
}
