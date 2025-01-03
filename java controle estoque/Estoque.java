import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public Produto buscarProduto(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void atualizarEstoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado do produto: " + produto.getNome());
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }
}
