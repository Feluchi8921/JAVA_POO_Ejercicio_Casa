package Casa;

public class main {
    public static void main (String []args){
        Ciudad ciudad1 = new Ciudad();
        System.out.println("Ciudad: "+ciudad1.getCiudad()+"\nBarrio: "+ciudad1.getBarrio()+"\nColor: "+ciudad1.getColor()
                            +"\nPisos: "+ciudad1.getPisos()+"\nHabitaciones: "+ciudad1.getHabitaciones()+
                "\nBaños: "+ciudad1.getBanios()+"\nCocinas: "+ciudad1.getCocinas());
    }
}
