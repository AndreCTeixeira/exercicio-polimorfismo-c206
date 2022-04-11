public class Comprador {

    String nome;
    double saldo;
    Brownie brownie;

    public Comprador(String nome, double saldo){

        this.nome = nome;
        this.saldo = saldo;

    }

    public void efetuarCompra(Brownie brownie){

        brownie.addCarrinhodeCompras();

        brownie.calculaValor();

        System.out.println(brownie.nome + " comprado!");

    }



}
