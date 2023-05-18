package Unidad_9.Tarea_1;

public class EmpleadoPorPiezas extends Empleado{
    private double sueldo;
    private int piezas;
    public EmpleadoPorPiezas(String primerNombre,
                             String apellidoPaterno,
                             String numeroSeguroSocial,
                             double sueldo,
                             int piezas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSueldo(sueldo);
        setPiezas(piezas);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
       if(sueldo > 0){
           this.sueldo = sueldo;
       }else{
           throw new IllegalArgumentException("El sueldo debe ser > 0");
       }
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    @Override
    public double ingresos() {
        return sueldo * piezas;
    }

    @Override
    public String toString() {
        return String.format("empleado por piezas: %s\n%s: $%,.2f; %s: %d",
                super.toString(),
                "sueldo por piezas", sueldo,
                "piezas hechas", piezas
        );
    }
}
