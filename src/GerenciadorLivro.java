import java.util.ArrayList;

public class GerenciadorLivro {

    ArrayList<Livro> livros = new ArrayList<>();


    public void cadastrarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro: "+livro.getTitulo()+" cadastrado com sucesso");
    }

    public void listarLivros(){
            if (livros.isEmpty()){
                System.out.println("Nenhum livro cadastrado ainda.");
            }
            System.out.println("=== Lista de Livros ===\n");
            for (Livro l: livros){
                System.out.println("Id: "+l.getId());
                System.out.println("Titulo: "+l.getTitulo());
                System.out.println("Autor: "+l.getAutor());
                System.out.println("Ano: "+l.getAno());
                System.out.println("Status: "+l.getLivroEmprestado());
                System.out.println("\n-----------------\n");
            }
    }

    public void emprestarLivro(int id){
        boolean encontrado = false;
        for (Livro l: livros){
            if (l.getId() == id){
                encontrado = true;
                if (l.getLivroEmprestado() == LivroEmprestado.DISPONIVEL){
                    l.setLivroEmprestado(LivroEmprestado.EMPRESTADO);
                    System.out.println("Livro: "+l.getTitulo()+" emprestado com sucesso");
                } else {
                    System.out.println("*** Não foi possivel: Este livro ja esta emprestado no momento ***");
                }
                break;
            }
        } if (!encontrado) {
            System.out.println("Livro com o ID "+id+" não foi encontrado");
        }
    }


}
