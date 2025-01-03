import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\n==== Sistema de Controle de Estoque ====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Quantidade de Produto");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a escolha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, quantidade, preco);
                    estoque.adicionarProduto(produto);
                    break;

                case 2:
                    System.out.print("Digite o nome do produto para atualizar a quantidade: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a quantidade a ser adicionada: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    estoque.atualizarEstoque(nomeAtualizar, quantidadeAdicionar);
                    break;

                case 3:
                    estoque.exibirEstoque();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
