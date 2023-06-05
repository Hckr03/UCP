
package Unidad_11.Tarea_1;

/**
 *
 * @author Hckr
 */
public class Celsius {
    private Double number;
    
    public Celsius() {
    }

    public Celsius(Double number) {
        this.number = number;
    }
     
    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
    
    public String convertCelsiusKelvin(Double numero){
        Double resultado;
        resultado = numero + 273.15;
        return String.format("%.2f", resultado);
    }
    
    public String convertCelsiusFahrenheit(Double numero){
        Double resultado;
        resultado = ((numero * 9) / 5) + 32;
        return String.format("%.2f", resultado);
    }
}
