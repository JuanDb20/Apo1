public class Hora {
    public static void main(String[] args) {
    int hora, minuto, segundo, horatemp;
    hora = 20;
    minuto = 02;
    segundo= 46;
    System.out.println ("Cantidad de segundos transcurridos desde la medianoche: " + (hora*60*60 + minuto*60 + segundo));
    horatemp = (hora*60*60 + minuto*60 + segundo);

    System.out.println ("Los segundos que le quedan al día son: " + (86400 - horatemp) + " segundos");
    System.out.println ("El porcentaje que ha transcurrido del día es: " + ((horatemp*100)/86400) + "%" );

    }
}
