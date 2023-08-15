package aula12;

public class Reptil extends Animal{
    private String corEscama;
    @Override
    public void lovomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vejetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
