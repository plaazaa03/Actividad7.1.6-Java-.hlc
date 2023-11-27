public class Multiplicador implements Algoritmo
{

    private int valorCifrado = 21;

    @Override
    public int cifrar(int code) {

        return code * valorCifrado;
    }

    @Override
    public int descifrar(int code) {

        return code * valorCifrado;
    }
}
