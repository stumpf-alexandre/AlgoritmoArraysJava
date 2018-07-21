public class ArraysObjetos {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        Carro carro1 = new Carro();
        carro1.cor = "Verde";
        carro1.modelo = "HB20";
        carro1.velocidadeMaxima = 270;

        Carro carro2 = new Carro();
        carro2.cor = "Branco";
        carro2.modelo = "Passat";
        carro2.velocidadeMaxima = 250;

        carros[0] = carro1;
        carros[1] = carro2;

        //carros[0].cor = "Preto";

        System.out.println("Carro 1 de cor " + carros[0].cor + " e modelo " + carros[0].modelo + ", chega a uma velocidade maxima de " + carros[0].velocidadeMaxima + " Km.");
        System.out.println("Carro 2 de cor " + carros[1].cor + " e modelo " + carros[1].modelo + ", chega a uma velocidade maxima de " + carros[1].velocidadeMaxima + " Km.");

        for (Carro carro : carros){
            System.out.println("Carro: " + carro.modelo);
            System.out.println("Cor: " + carro.cor);
        }
    }
}