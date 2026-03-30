public class Operaciones {
    public static void main(String[] args) {
        int miNumero = 7;

        if (esPar(miNumero)) {
            System.out.println(miNumero + " es par.");
        } else {
            System.out.println(miNumero + " es impar.");
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
