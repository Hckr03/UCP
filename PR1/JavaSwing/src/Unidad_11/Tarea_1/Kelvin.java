
package Unidad_11.Tarea_1;

/**
 *
 * @author Hckr
 */
public class Kelvin {
    private Double number;

    public Kelvin(Double number) {
        this.number = number;
    }

    public Kelvin() {
    }
    
    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
    
    public String convertKelvinCelsius(Double numero){
        Double resultado;
        resultado = numero - 273.15;
        return String.format("%.2f", resultado);
    }
    
    public String convertKelvinFahrenheit(Double numero){
        Double resultado;
        resultado = (((numero - 273.15) * 9) / 5 ) + 32;
        return String.format("%.2f", resultado);
    }
}
