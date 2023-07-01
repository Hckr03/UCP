
package Tema_2;

/**
 *
 * @author hckr
 */
public class Rectangulo implements PerimetroArea {
    private Double largo;
    private Double ancho;

    public Rectangulo() {
    }

    public Rectangulo(Double largo, Double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public Double perimetro(Double largo, Double ancho) {
        return (largo + ancho) * 2;
    }

    @Override
    public Double area(Double largo, Double ancho) {
        return largo * ancho;
    }
    
}
