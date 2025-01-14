package dni_calculo;

public class dni_calculator {
    private String dniCompleto;
    private String numero;
    private Character letra;
    private static final char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private final int DIVISOR_DNI = 23;
    private final int LONGITUD_NUMERO_DNI = 8;
    private final int LONGITUD_DNI_COMPLETO = 9;
    
    public dni_calculator (String dniCompleto) {

    } 
    
    /**
     * Verifica si un DNI es valido
     * @param dniCompleto DNI completo con 8 digitos y 1 letra
     * @return devuelve true si el DNI es valido, false si no lo es
     */
    public boolean esValido () {
        if ( numero == null || dniCompleto == null || numero.length() != LONGITUD_NUMERO_DNI|| dniCompleto.length() != LONGITUD_DNI_COMPLETO ) {
            return false;
        } 
        try {
            String numero = dniCompleto.substring(0, LONGITUD_NUMERO_DNI);
            char letraProporcionada = Character.toUpperCase(dniCompleto.charAt(LONGITUD_NUMERO_DNI));
            return letraProporcionada == generadorLetra(numero);
        } catch (IllegalArgumentException exception){
            return false;
        }
    }
    
    
    /**
     * Calcula la letra correspondiente al numero del dni
     * @param numero Cadena con el numero del DNI (8 digitos)
     * @return la letra correspondiente al DNI
     * @throws IllegalArgumentException Si el numero tiene un formato invalido
     */
    private char generadorLetra (String numeroDNI) {
        if (numeroDNI == null || numeroDNI.length() != LONGITUD_NUMERO_DNI || !numeroDNI.matches("\\d+")) {
            throw new IllegalArgumentException("El número del DNI no es valido");
        }
        int numero = Integer.parseInt(numeroDNI);
        int resto = numero % DIVISOR_DNI;
        boolean esta_incluido = false;
        for (int i = 0; i < letras.length; i++) {
            if (resto == i) {
                esta_incluido = true;
            }
        }
        
        if (esta_incluido) {
            return letras[numero];
        } else {
            return '*';
        }
    }
    
    public String generarAleatorioDNI () {
        int numeroAleatorio = (int) (Math.random() * 100000000);
        
    }
}
