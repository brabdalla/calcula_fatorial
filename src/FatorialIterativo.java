public class FatorialIterativo {
    public long calcularFatorial(int numero) { 
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            //System.out.print(i+"*");
        }
       // System.out.println("");
        return fatorial;
    }
    
}
