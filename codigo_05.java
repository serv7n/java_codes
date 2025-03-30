// loops
public class codigo_05 {
    public static void main(String[] args) {
        // enquanto(0, 10, "par");
        // lista();
    }
    static void para(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
    public static void lista(){
        String[][] conversas =  {
            {"joao" , "nao  vi"} ,
            {"joel" , "Ocupado"}  ,
            {"lara" , "seila"} 
        };
        int inicio = -1, fim = 2;
        while (inicio++ < fim) {
            System.out.println(conversas[inicio][0] + " disse : "  + conversas[inicio][1] );
            // System.out.println(inicio);
        }
    }
    public static void enquanto(int inicio, int fim, String verificar) {
        while (inicio++ < fim) {
            if ((inicio % 2 == 0) && (verificar == "par")) {
                System.out.println(inicio + " e " + verificar);
                break;
            } else if ((inicio % 2 == 1) && (verificar == "impar")) {
                System.out.println(inicio + " e " + verificar);
                break;
            } else {
                System.out.println(inicio);

            }

        }
    }
}
