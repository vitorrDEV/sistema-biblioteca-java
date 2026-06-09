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

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
