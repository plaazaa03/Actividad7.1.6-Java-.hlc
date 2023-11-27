public class Operacion implements Algoritmo{

    private int valorCifrado = 64;
    @Override
    public int cifrar(int code) {
        return code ^ valorCifrado;
    }

    @Override
    public int descifrar(int code) {
        return code ^ valorCifrado;
    }
}
