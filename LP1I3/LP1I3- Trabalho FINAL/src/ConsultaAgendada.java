package src;

import java.util.Scanner;

public class ConsultaAgendada {
      Scanner scanner =  new Scanner(System.in);
      private Data data;
      private Hora hora;
      private String nomePaciente;
      public static int quantidade = 0;
      private String nomeMedico;

        /** ConsultaAgendada()
          * Permite a digitação dos valores
          */
   public ConsultaAgendada(){
         System.out.println("Sistema de agendamento de consulta.");

         /**
          * receber informações de Data e Hora
          */
         this.data = new Data();
         this.hora = new Hora();
          quantidade++;
               
        System.out.println("Digite o nome do paciente: ");
        nomePaciente = scanner.nextLine();

        System.out.println("Digite o nome do medico: ");
        nomeMedico = scanner.nextLine();
    }
    /**
     * recebe os valores no parametro
     * @param h
     * @param mi
     * @param s
     * @param d
     * @param m
     * @param a
     * @param p
     * @param me
     */
    public ConsultaAgendada( int h, int mi, int s, int d, int m, int a, String p, String me){

    this.hora = new Hora(h, mi, s);
    this.data = new Data(d, m, a);
    this.nomeMedico = me;
    this.nomePaciente = p;  
}
  /**
   * recebe os valores no parametrp
   * @param d
   * @param h
   * @param p
   * @param m
   */
  public  ConsultaAgendada (Data d, Hora h, String p, String m){

    this.data = d;
    this.hora = h;
    this.nomePaciente = p;
    this.nomeMedico = m;
  }
 
   public void setData(int a, int b, int c){
    this.data = new Data(a,b,c);
  }
   public void setData(){
    this.data = new Data();
   }
   public void setHora(int a, int b, int c){
        this.hora = new Hora(a,b,c);
   }
   public void setHora(){
       this.hora = new Hora();
   }

   public void setNomePaciente(String p){
       nomePaciente = p;
   }

   public int getAmostra(){
       int quant = ConsultaAgendada.quantidade;
       return quant;
   }
   
   public void setNomePaciente(){
       this.nomePaciente = scanner.nextLine();
   }
 
   public void setNomeMedico( String m){
       nomeMedico = m;
   }

   /**
    * altera valor das propriedades
    */
   public void setNomeMedico(){
      this.nomeMedico = scanner.nextLine();
   }
   /**
    * getData()
    * devolve em formato dd/mm/aa;
    * recebe da classe Data
    * @return
    */
   public String getData(){
       return this.data.mostra1();
   }
    
   /**
    * getHora()
    * devolve em formato hh:mm:ss
    * recebe da classe Hora
    * @return
    */
   public String getHora(){
       return this.hora.getHora1();
   }

   /**
    * 
    * devolve informações do nomePaciente
    * @return
    */
   public String getNomePaciente(){
       return nomePaciente;
   }

   /**
    *  devolve informações do nomeMedico
    * @return
    */
   public String getNomeMedico(){
       return nomeMedico;
   }
   
  
}
