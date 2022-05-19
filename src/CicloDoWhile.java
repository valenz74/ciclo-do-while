public class CicloDoWhile {
    public static void main(String[] args) {
        /*
        DO-WHILE:
        Permite ejecutar varias veces una porción de código hasta que la
        condición deje de cumplirse.
        Nota: Este código va a ejecutarse por lo menos UNA vez
         */
        // BREAK: Interrumpir el proceso de un ciclo.
        // CONTINUE: No se sale del ciclo, sino una se ejecuta, va e inicia
        //           el ciclo de nuevo

        int i = 300;
        do {
            System.out.println(i);
            i++;
            if (i == 7) {
                System.out.println("Antes del continue");
                continue;
            }
            System.out.println("Despues del continue");
        } while (i<10);
    }
}
