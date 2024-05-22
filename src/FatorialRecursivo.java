public class FatorialRecursivo {
    public long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
           // System.out.print(1);
            return 1;
        }
        //System.out.print(numero+"*");
        return numero * calcularFatorial(numero - 1);
    }
}
    
   
