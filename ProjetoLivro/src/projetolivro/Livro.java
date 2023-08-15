package projetolivro;

public class Livro implements Publicacao{
    //Atributos
    private String Livro;
    private String auto;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos

    public String detalhes() {
        return "Livro{" +
                "\nLivro='" + Livro + '\'' +
                ", \nauto='" + auto + '\'' +
                ", \ntotPaginas=" + totPaginas +
                ", \npagAtual=" + pagAtual +
                ", \naberto=" + aberto +
                ", \nLeito=" + leitor.getNome() +
                ", \nIdade=" + leitor.getIdade() +
                ", \nSexo=" + leitor.getSexo() +

                '}';
    }


    //Métodos especiais


    public Livro(String livro, String auto, int totPaginas, Pessoa leitor) {
        Livro = livro;
        this.auto = auto;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getLivro() {
        return Livro;
    }

    public void setLivro(String livro) {
        Livro = livro;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if ( p > this.totPaginas ){
            this.pagAtual=0;
        }else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
