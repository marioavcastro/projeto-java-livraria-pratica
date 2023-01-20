public class Descontos {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Layane Castro");

        Livro lv1 = new Livro(autor);
        lv1.setValor(59.90);
        if(!lv1.aplicaDesconto(0.3)){
            System.out.println("Desconto de livro nao pode ser aplicado");
        }else{
            System.out.println("Valor do livro com desconto: " + lv1.getValor());
        }

        Ebook eb1 = new Ebook(autor);
        eb1.setValor(29.90);

        if (!eb1.aplicaDesconto(0.3)){
            System.out.println("Desconto no ebook nao pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + eb1.getValor());
        }

        System.out.println("Autor(a): " + eb1.getAutor().getNome());
    }
}
