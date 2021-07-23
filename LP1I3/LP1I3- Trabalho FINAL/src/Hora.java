package src;

import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    Scanner scanner = new Scanner(System.in);

    private int valor;

    public Hora(){
        hora = 0;
        min = 0;
        seg = 0;
        setHor();
        setMin();
        setSeg();
    }

    public Hora( int h, int m, int s)
    {
        hora = h;
        min = m;
        seg = s;

        try {
            validate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

 public void setHor(int h)
    {
        hora = h;

        try {
            validate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   public void setMin(int m)
   {
       min = m;

       try {
           validate();
       }catch (Exception e){
           e.printStackTrace();
       }
   }
   public void setSeg(int s)
   {
       seg = s;

       try {
           validate();
       }catch (Exception e){
           e.printStackTrace();
       }
   }

   //metodo setHor() para que o usuario digite um valor em horas 
   

   public void setHor()
   {
       do {
           System.out.print("Digite o valor em horas: ");
           valor = scanner.nextInt();
       }while (valor < 0 || valor > 23);

       try {
           validate();
           hora = valor;
       }catch (Exception e){
           e.printStackTrace();
       }
   }

    //metodo setMin() para que o usuario digite um valor de minutos

   public void setMin()
   {
       do {
           System.out.print("Digite o valor em minutos: ");
           valor = scanner.nextInt();
       }while (valor < 0 || valor > 59);

           try {
               validate();
               min = valor;
           }catch (Exception e){
               e.printStackTrace();
           }
   }

    //metodo setSeg() para que o usuario digite um valor em segundos

   public  void setSeg()
   {
       do {
           System.out.print("Digite o valor em segundos: ");
           valor = scanner.nextInt();
       }while (valor < 0 || valor >59);

       try {
           validate();
           seg = valor;
       }catch (Exception e){
           e.printStackTrace();
       }
   }
   //devolve as respostas do usuario
   public  int getHor()
   {
       return hora;
   }
   public int getMin()
   {
       return min;
   }
   public int getSeg()
   {
    return seg;
   }
   //devolve em formato hh:mm:ss
   public  String getHora1()
   {
       return "" + hora + ":" + min + ":" + seg;
   }
   //devolve em dois formatos tanto am quanto pm
   public String getHora2()
   {
       if (hora >= 0 && hora < 12)
       {
           return "" + hora + ":" + min + ":" + seg + " a.m";
       }
       else {
           return "" + hora + ":" + min + ":" + seg + " p.m";
       }
   }

   // devolve o resultado total de horas em segundos
   public int getSegundos()
   {
    System.out.print("Em segundos: ");
    return ((hora * 60) * 60) + (min * 60) + seg ;
   }

  
   //em caso de erro de inconsistencia de dados retornara estas mensagens
   private  void  validate() throws Exception
   {
       if (hora < 0 || hora > 23)
       {
           throw new Exception("Esta incorreto");
       }
       if (min < 0 || min > 59)
       {
           throw new Exception("Incorreto minutos é ate 60 segundo!");
       }
       if (seg < 0 || seg > 59 )
       {
           throw new Exception("Segundos está invalido");
       }
   }


}
