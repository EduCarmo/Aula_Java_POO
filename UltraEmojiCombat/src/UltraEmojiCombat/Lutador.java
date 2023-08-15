package UltraEmojiCombat;

public class Lutador {
    //Atributos
    private String nome;
    private String nascionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private  int derrota;
    private  int empates;

    //Métodos Públicos
    public void apresentar(){
        System.out.println("--------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador ");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNascionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void status(){
        System.out.println("--------------------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");

    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setVitorias(this.getVitorias() - 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //Métodos Especiais


    public Lutador(String nome, String nascionalidade, int idade, float altura, float peso, int vitorias, int derrota, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrota = derrota;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Ivalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
