
package src;

public class teste{
    public static void main(String[] args) {
        
        ConsultaAgendada p1 = new ConsultaAgendada(18, 28, 21, 23, 07, 2021, "Andreza", "Lidiane");
        System.out.println(p1.getData() + "\n" + p1.getHora() + "\n" + p1.getNomeMedico() + "\n" + p1.getNomePaciente());

        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println(p2.getData() + "\n" + p2.getHora() + "\n" + p2.getNomeMedico() + "\n" + p2.getNomePaciente());
          System.out.println(p1.getAmostra());

        p1.setHora();
        p1.setData();
        p1.setNomePaciente();
        p1.setNomeMedico();
         System.out.println("---------P1------------");
        System.out.println(p1.getData() + "\n" + p1.getHora() + "\n" + p1.getNomeMedico() + "\n" + p1.getNomePaciente());
        System.out.println(p1.getAmostra());
       
    }
}