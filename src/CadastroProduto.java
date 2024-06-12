import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibiProdutoPorNome(){
        Set<Produto> exibir = new TreeSet<>(produtos);

        return exibir;

    }

    public Set<Produto> exibiProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());

        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }


    
}
