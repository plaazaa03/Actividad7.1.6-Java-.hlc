public class Main {
    public static void main(String[] args) {
        int dato = 131;
        int datoCifrado;
        int datoDescifrado;

        //Crea un cifrador

        Cifrador cifrador = new Cifrador();

        //Instanciar un algoritmo concreto (Multiplicador)
        Algoritmo mult = new Multiplicador();
        datoCifrado = cifrador.ejecutar(0,mult,"cifrar");

        //Cifrado XOR
        Algoritmo xor = new Operacion();
        datoCifrado = cifrador.ejecutar(0,xor,"cifrar");

        //Cifrado Diferenciador
        Algoritmo dif = new Diferenciador();
        datoCifrado = cifrador.ejecutar(0,dif,"cifrar");

    }
}
