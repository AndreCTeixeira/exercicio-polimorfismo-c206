public class BrownieCafe extends Brownie {


    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);

    }

    public void adicionaCafe(){

        System.out.println("Café adicionado!");
    }

    @Override
    public void addCarrinhodeCompras() {
        System.out.println("Brownie de Café adicionado!");
    }
}
