public class CadastroLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mario Castro");
        autor.setEmail("mariohaha@gmail.com");
        autor.setCpf("127.0.0.1");

        Livro livro = new Livro();
        livro.setNome("Logica da programacao");
        livro.setDescricao("Crie seus programas em Java");
        livro.setValor(59.90);
        livro.setIsbn("998-87-66554-32-1");
        livro.setAutor(autor);

        System.out.println(livro.mostrarDetalhes());
        System.out.println("Valor atual: " + livro.getValor());

        if (!livro.aplicaDesconto(0.2)){
            System.out.println("Desconto não pôde ser aplicado. Desconto maior que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }
    }
}
