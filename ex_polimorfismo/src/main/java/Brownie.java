public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;;

    public Brownie(String nome, double preco, String sabor){
    this.nome = nome;
    this.preco = preco;
    this.sabor = sabor;
    }


    public void addCarrinhodeCompras(){

        System.out.println("Produto " + nome + " adicionado no carrinho de compras");

    }


    public void calculaValor(){



        System.out.println(nome + ", preço total: " + preco);

    }

    public void mostraInfo(){

        System.out.println("Nome: " + nome + " Preço: " + preco + " Sabor: " + sabor);

    }


}
