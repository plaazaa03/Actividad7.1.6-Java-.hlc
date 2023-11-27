public class Diferenciador implements Algoritmo{

    private int valorCifrado = 1;

    @Override
    public int cifrar(int code) {
        return code - valorCifrado;
    }

    @Override
    public int descifrar(int code) {
        return code + valorCifrado;
    }
}
