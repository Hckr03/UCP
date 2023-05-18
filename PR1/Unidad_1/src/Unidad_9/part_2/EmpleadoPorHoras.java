package Unidad_9.part_2;

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    public EmpleadoPorHoras(String primerNombre,
                            String apellidoPaterno,
                            String numeroSeguroSocial,
                            double sueldo,
                            double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSueldo(sueldo);
        setHoras(horas);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo >= 0.0){
            this.sueldo = sueldo;
        }else{
            throw new IllegalArgumentException(
                    "El sueldo por horas debe ser >= 0.0"
            );
        }
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if((horas >= 0.0) && (horas <= 168.0)){
            this.horas = horas;
        }else{
            throw new IllegalArgumentException(
                    "Las horas trabajadas deben ser >= 0.0 y <= 168.0"
            );
        }
    }

    @Override
    public double ingresos() {
        if(horas <= 40){
            return  sueldo * horas;
        }else{
            return  40 * sueldo + (horas - 40) * sueldo * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(),
                "sueldo por hora", sueldo,
                "horas trabajadas", horas
        );
    }
}
