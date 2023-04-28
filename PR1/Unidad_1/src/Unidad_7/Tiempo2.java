package Unidad_7;

public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2() {
        this(0, 0, 0);
    }

    public Tiempo2(int h) {
        this(h, 0, 0);
    }

    public Tiempo2(int h, int m) {
        this(h, m, 0);
    }

    public Tiempo2(int h, int m, int s) {
        setTiempo(h, m, s);
    }

    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
    }

    public void setTiempo(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public void setHora(int h) {
        if (h >= 0 && h < 24) {
            hora = h;
        } else {
            throw new IllegalArgumentException("hora debe ser de 0 a 23");
        }
    }

    public void setMinuto(int m) {
        if (m >= 0 && m < 60) {
            minuto = m;
        } else {
            throw new IllegalArgumentException("minuto debe ser de 0 a 59");
        }
    }

    public void setSegundo(int s) {
        if (s >= 0 && s < 60) {
            segundo = ((s >= 0 && s < 60) ? s : 0);
        } else {
            throw new IllegalArgumentException("segundo debe ser de 0 a 59");
        }
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

}
