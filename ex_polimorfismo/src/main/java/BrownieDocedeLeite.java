public class BrownieDocedeLeite extends Brownie {

    public BrownieDocedeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDocedeLeite(){

        System.out.println("Doce de Leite adicionado!");

    }

    @Override
    public void addCarrinhodeCompras() {
        System.out.println("Brownie de Doce de Leite adicionado!");
    }

    }