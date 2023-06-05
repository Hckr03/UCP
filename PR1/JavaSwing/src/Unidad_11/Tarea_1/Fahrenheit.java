
package Unidad_11.Tarea_1;

/**
 *
 * @author Hckr
 */
public class Fahrenheit {
    private Double number;

    public Fahrenheit(Double number) {
        this.number = number;
    }

    public Fahrenheit() {
    }

    
    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
    
    public String convertFahrenheitCelsius(Double numero){
        Double resultado;
        resultado = ((numero - 32) * 5) / 9 ;
        return String.format("%.2f", resultado);
    }
    
    public String convertFahrenheitKelvin(Double numero){
        Double resultado;
        resultado = (((numero - 32) * 5) / 9) + 273.15;
        return String.format("%.2f", resultado);
    }
    
}
