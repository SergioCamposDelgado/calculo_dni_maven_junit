package dni_calculo;

public class main {
    public static void main( String[] args ) {
        String dni_texto = "11111111H";
        dni_calculator dni = new dni_calculator(dni_texto);
        if (dni.esValido()) {
            System.out.println("Valido");
        } else {
            System.out.println("No valido");
        }
    }
}
