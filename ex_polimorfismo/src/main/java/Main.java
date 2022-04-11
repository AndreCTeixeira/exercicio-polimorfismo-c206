public class Main {

    public static void main(String[] args) {

        Brownie b1 = new BrownieNutella("Brownie de nutella", 8, "Nutella");
        Brownie b2 = new BrownieDocedeLeite("Brownie de Doce de Leite", 7, "Doce de leite");

        Comprador c1 = new Comprador("Jeca Tatu", 20);

        c1.efetuarCompra(b1);

        c1.efetuarCompra(b2);

    }

}
