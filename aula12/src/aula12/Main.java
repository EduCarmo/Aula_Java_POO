package aula12;
public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        c.lovomover();
        c.usarBolsa();

        m.setPeso(35.3f);
        m.setCorPelo("Marron");
        m.alimentar();
        m.lovomover();
        m.emitirSom();

        a.lovomover();
        p.lovomover();
        r.lovomover();

    }
}