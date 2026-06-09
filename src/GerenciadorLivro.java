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
            System.out.println("---Lista de Livros Cadastrados ---");
            for (Livro l: livros){
                System.out.println("Titulo: "+l.getTitulo());
                System.out.println("Autor: "+l.getAutor());
                System.out.println("Ano: "+l.getAno());
            }
    }

}
