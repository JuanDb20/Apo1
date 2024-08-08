public class Fecha {
    public static void main(String[] args) {
        String diaDeLaSemana = "Jueves";
        int diaDelMes = 8;
        String mes = "agosto";
        int anio = 2024;

        // Imprimir valores de variables
        System.out.println("Dia De La Semana: " + diaDeLaSemana);
        System.out.println("Dia Del Mes: " + diaDelMes);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);

        // Formato Colombiano
        System.out.println("Formato Colombiano: " + diaDeLaSemana + " " + diaDelMes + " de " + mes + " de " + anio);

        // Formato americano
        System.out.println("Formato americano: " + diaDeLaSemana + ", " + mes + " " + diaDelMes + ", " + anio);

        // Formato europeo
        System.out.println("Formato europeo: " + diaDeLaSemana + " " + diaDelMes + " " + mes + ", " + anio);
    }
}