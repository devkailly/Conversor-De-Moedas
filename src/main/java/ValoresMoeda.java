public class ValoresMoeda {

    public static final double realParaDolar = 0.20;
    public static final double realParaEuro = 0.18;
    public static final double realParaLibraEsterlina = 0.16;
    public static final double realParaPesoArgentino = 71.76;
    public static final double realParaPesoChileno = 173.6;

    public static final double dolarParaReal = 4.88;
    public static final double euroParaReal = 5.28;
    public static final double libraEsterlinaParaReal = 6.15;
    public static final double pesoArgentinoParaReal = 0.014;
    public static final double pesoChilenoParaReal = 0.0058;

    public double converterRealEmDolar(double valor) {

        return valor * realParaDolar;

    }
    public double converterEuroEmReal(double valor) {
        return valor * realParaEuro;
    }
    public double converterLibraEsterlinaEmReal(double valor) {
        return valor * realParaLibraEsterlina;
    }
    public double converterPesoArgentinoEmReal(double valor) {
        return valor * realParaPesoArgentino;
    }
    public double converterPesoChilenoEmReal(double valor) {
        return valor * realParaPesoChileno;
    }


    public double converterDolarEmReal(double valor) {
        return valor * dolarParaReal;}

    public double converterRealEmEuro(double valor) {
        return valor * euroParaReal;}

    public double converterRealEmLibraEsterlina(double valor) {
        return valor * libraEsterlinaParaReal;}

    public double converterRealEmPesoArgentino(double valor) {
        return valor * pesoArgentinoParaReal;}

    public double converterRealEmPesoChileno(double valor) {
        return valor * pesoChilenoParaReal;}



}