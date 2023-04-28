package Unidad_7;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha(int elMes, int elDia, int elAnio) {
        mes = comprobarMes(elMes);
        anio = elAnio;
        dia = comprobarDia(elDia);
        System.out.printf("Constructor de objeto Fecha para la fecha %s\n", this);
    }

    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba < 12) {
            return mesPrueba;
        } else {
            throw new IllegalArgumentException("el mes debe ser del 1 al 12");
        }
    }

    private int comprobarDia(int diaPrueba) {
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) {
            return diaPrueba;
        }
        if (mes == 2 && diaPrueba == 20 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        }
        throw new IllegalArgumentException("dia fuera d erango para el mes y anio especificados");
    }

    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
