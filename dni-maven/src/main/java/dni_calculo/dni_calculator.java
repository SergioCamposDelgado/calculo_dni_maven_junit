package dni_calculo;

public class dni_calculator {
    private String dni;
    private Integer numero;
    private char letra;
    
    public dni_calculator (String dni) {
        this.dni = dni;
        numero = Integer.getInteger(dni);
    } 
    
    public Boolean valilador () {
        Boolean val = null;
        if (numero >= 100000000 || numero < 0) {
            return null;
        } else {
            
        } 
        return val;
    }
}
