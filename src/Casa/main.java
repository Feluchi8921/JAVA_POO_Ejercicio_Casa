package Casa;

public class main {
    public static void main (String []args){
        Ciudad ciudad1 = new Ciudad();
        Ciudad ciudad2 = new Ciudad("Tandil", "Centro", "Blanco y Ocre");
        Ciudad ciudad3 = new Ciudad("Procrear", "Blanco y Ocre", 2);
        Ciudad ciudad4 = new Ciudad(2, 2, 3, 1);

        //Ciudad 1
        System.out.println("--------------------Objeto Ciudad 1---------------------");
        System.out.println("\nCiudad: "+ciudad1.getCiudad()+"\nBarrio: "+ciudad1.getBarrio()+"\nColor: "+ciudad1.getColor()
                            +"\nPisos: "+ciudad1.getPisos()+"\nHabitaciones: "+ciudad1.getHabitaciones()+
                "\nBaños: "+ciudad1.getBanios()+"\nCocinas: "+ciudad1.getCocinas());
        //Ciudad 2
        System.out.println("--------------------Objeto Ciudad 2---------------------");
        System.out.println("\nCiudad: "+ciudad2.getCiudad()+"\nBarrio: "+ciudad2.getBarrio()+"\nColor: "+ciudad2.getColor());
        System.out.println("--------------------Objeto Ciudad 3---------------------");
        //Ciudad 3
        System.out.println("\nBarrio: "+ciudad3.getBarrio()+"\nColor: "+ciudad3.getColor()
                +"\nPisos: "+ciudad3.getPisos());
        //Ciudad 4
        System.out.println("--------------------Objeto Ciudad 4---------------------");
        System.out.println("\nPisos: "+ciudad1.getPisos()+"\nHabitaciones: "+ciudad1.getHabitaciones()+
                "\nBaños: "+ciudad1.getBanios()+"\nCocinas: "+ciudad1.getCocinas());
    }
}
