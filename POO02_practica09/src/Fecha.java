/**
 * @author Ramirez Mora Carolina
 * Soto Huerta Gustavo Isaac
 * Zarazua Cuautle Ximena
 * Lazcano-Vasquez Carlos
 */

public class Fecha {
    private byte dia;
    private byte mes;
    private int anio;

    /**
     * {@summary} Crea una fecha con la información actual por defecto.
     */
    public Fecha() {
        long milis = System.currentTimeMillis();
        int dia = (int) (milis % 8640000);
        int mes = dia / 31;
        dia = dia - 31 * mes;
        int anio = mes % 12;
        anio = anio - mes * 12;
        this.dia = (byte) dia;
    }

    /**
     * {@summary} Crea una fecha con los datos dados en los parametros, día no puede
     * ser mayor a 31, mes no puede pasar de 12, anho.
     */
    public Fecha(byte dia, byte mes, short anho) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anho;
    }

    /**
     * {@summary} Regresa el dia especificado en la fecha
     *
     * @return byte dia
     */
    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    /**
     * {@summary} Regresa el nes especificado en la fecha
     *
     * @return byte mes
     */
    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    /**
     * {@summary} Regresa el año especificado en la fecha
     *
     * @return short anho
     */
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "" + this.dia + "-" + this.mes + "-" + this.anio;
    }
}