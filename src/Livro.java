public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){
        this();
        this.autor = autor;
    }
    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }
    void setValor(double valor){
        this.valor = valor;
    }
    double getValor(){
        return this.valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
    String mostrarDetalhes(){
     return "Nome: " + nome + "\n"
             + "Descricao: " + descricao + "\n"
             + "Valor: " + valor + "\n"
             + "ISBN: " + isbn + "\n"
             + "Mostrando os detalhes do autor: " + "\n"
             + "Nome do Autor: " + autor.getNome() + "\n"
             + "Email: " + autor.getEmail() + "\n"
             + "CPF: " + autor.getCpf();
    }
}
