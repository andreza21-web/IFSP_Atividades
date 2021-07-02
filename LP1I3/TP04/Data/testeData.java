
package Data;

public class testeData {
    public static void main(String[] args) {
		
     Data d = new Data();
	System.out.println(d.mostra1());
	System.out.println(d.mostra2());
	System.out.println("Quantidade de dias transcorridos: " + d.diasTranscorridos());
	d.apresentaDataAtual();
	}

}