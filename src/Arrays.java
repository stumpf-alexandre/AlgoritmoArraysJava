public class Arrays {
    public static void main(String[] args) {
        String[] pessoas = new String[5];
        pessoas[0] = "João";
        pessoas[1] = "Maria";
        pessoas[2] = "Felipe";
        pessoas[3] = "Jaqueline";
        pessoas[4] = "Carol";

        int[] idades = new int[5];
        idades[0] = 18;
        idades[1] = 20;
        idades[2] = 25;
        idades[3] = 17;
        idades[4] = 19;

        System.out.println("Nome: " + pessoas[3] + ", idade: " + idades[0] + " anos");
        System.out.println("Nome: " + pessoas[0] + ", idade: " + idades[2] + " anos");
        System.out.println("Nome: " + pessoas[4] + ", idade: " + idades[1] + " anos");
        System.out.println("Nome: " + pessoas[1] + ", idade: " + idades[4] + " anos");
        System.out.println("Nome: " + pessoas[2] + ", idade: " + idades[3] + " anos");

        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Pessoas: " + pessoas[i]);
        }

        for (int idade : idades){
            System.out.println("Idades: " + idade);
        }
    }
}
