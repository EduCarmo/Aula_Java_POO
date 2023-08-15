package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(("Esta tampada? " + this.tampada));
    }

    public void tampada(){
        this.tampada = true;
    }

    private void destampada(){
        this.tampada = false;
    }
}
