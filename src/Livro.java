public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private int id;
    private static int proximoId = 1;
    private LivroEmprestado livroEmprestado;

    public LivroEmprestado getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(LivroEmprestado livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public int getId() {
        return id;
    }

    public int getProximoId() {
        return proximoId;
    }

    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.id = proximoId++;
        this.livroEmprestado = LivroEmprestado.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
