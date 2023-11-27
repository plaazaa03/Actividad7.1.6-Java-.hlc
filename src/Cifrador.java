public class Cifrador
{
    public int ejecutar(int codigo, Algoritmo algoritmo, String orden)
    {
     int codigoResultado = 0;

     if (orden.equals("cifrar")){

         /*Aplica el algoritmo basado en argumento*/

         codigoResultado = algoritmo.cifrar(codigo);

     } else if (orden.equals("descifrar")) {
         codigoResultado = algoritmo.descifrar(codigo);
     }
        return codigoResultado;
    }
}
