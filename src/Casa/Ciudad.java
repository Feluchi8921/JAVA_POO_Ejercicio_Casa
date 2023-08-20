package Casa;

public class Ciudad {
    //Atributos
    private String ciudad;
    private String barrio;
    private String color;
    private int pisos;
    private int habitaciones;
    private int banios;
    private int cocinas;

    //Constructores

    public Ciudad() {
        this.ciudad = "Tandil";
        this.barrio = "Centro";
        this.color = "Blanco";
        this.pisos = 1;
        this.habitaciones = 2;
        this.banios = 2;
        this.cocinas = 1;
    }

    public Ciudad(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public Ciudad(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public Ciudad(int pisos, int habitaciones, int banios, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.cocinas = cocinas;
    }

    //Metodos
    //Getters

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public int getPisos() {
        return pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public int getCocinas() {
        return cocinas;
    }
}
