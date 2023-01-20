public class Ebook extends Livro{
    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public void setWatermark(String watermark){
        this.watermark = watermark;
    }
    public String getWatermark(){
        return watermark;
    }
    @Override
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.15) {
            return false;
        }
        return super.aplicaDesconto(porcentagem);
    }
}
