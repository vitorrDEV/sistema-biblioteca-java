import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();
        int op = 0;

        do {
            System.out.println("""
                    ==========================
                       SISTEMA DE BIBLIOTECA
                    ==========================
                    
                    1 - Cadastrar Livro
                    2 - Listar Livros
                    3 - Emprestar Livro
                    4 - Devolver Livro
                    5 - Buscar Livro
                    6 - Remover Livro
                    0 - Sair
                    """);

            System.out.println("Escolha uma opção");
            System.out.print(">");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
                    System.out.println("=== CADASTRAR LIVRO ===\n");
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorLivro.cadastrarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    gerenciadorLivro.listarLivros();
                    break;
                case 3:
                    System.out.println("Digite o ID do livro:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorLivro.emprestarLivro(id);
                    break;
                case 4:
                    System.out.println("=== DEVOLUÇÃO ===\n");
                    System.out.println("Digite o id do livro: ");
                    int idDevolucao = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorLivro.devolverLivro(idDevolucao);
                    break;
                case 5:
                    System.out.println("=== BUSCAR LIVRO ===\n");
                    System.out.println("Digite o ID do livro: ");
                    int idBuscarLivro = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorLivro.buscarLivro(idBuscarLivro);
                    break;
                case 6:
                    System.out.println("=== REMOVER LIVRO ===\n");
                    System.out.println("Digite o ID: \n");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();
                    gerenciadorLivro.removerLivro(idRemover);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!!!");
            }
        } while (op != 0);
    }
}
