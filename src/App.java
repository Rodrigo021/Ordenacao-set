public class App {
    public static void main(String[] args) throws Exception {
        CadastroProduto cp = new CadastroProduto();

        cp.adicionarProduto(1, "p1", 15, 5);
        cp.adicionarProduto(2, "p0", 20, 10);
        cp.adicionarProduto(1, "p3", 10, 2);
        cp.adicionarProduto(9, "p9", 2, 2);

        System.out.println(cp.produtos);

        //System.out.println(cp.exibiProdutoPorNome());
        System.out.println(cp.exibiProdutoPorPreco());
    }
}
