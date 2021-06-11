package Hora;

public class teste {
    public static void main(String[] args) {

        

        Hora h = new Hora();

        int hora = h.getHor();
        int seg = h.getSeg();
        int min = h.getMin();

        String h1 = h.getHora1();
        System.out.println(h1);

        String h2 = h.getHora2();
        System.out.println(h2);

        int second = h.getSegundos();
        System.out.println(second);



       
   }

    
}
