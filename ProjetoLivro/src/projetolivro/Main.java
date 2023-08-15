import projetolivro.Livro;
import projetolivro.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("Maria", 8, "F");
        p[1]= new Pessoa("Eduardo", 27, "M");

        Livro[] l = new Livro[2];
        l[0] = new Livro("Java POO", "João", 300, p[0]);
        l[1] = new Livro("Python", "Carlos", 500, p[1]);

        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
}