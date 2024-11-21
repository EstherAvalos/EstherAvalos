public class Tablas_de_Multiplicar {
    public static void main(String[] args) {
        int n=10;
        for(int m=1;m<=n;m++){
            System.out.printf(("Tabla del: "+ m + "\t"));
        }
        System.out.println();
        for(int t=1; t<=n; t++){
            for(int m=1; m<=n; m++){
                System.out.printf(m + " * " + t+ " = "+ (m*t)+"\t");
            }
            System.out.println();
        }
    }
