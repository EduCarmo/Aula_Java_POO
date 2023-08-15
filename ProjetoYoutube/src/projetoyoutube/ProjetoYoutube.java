package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Usuario[] u = new Usuario[2];
        u[0] = new Usuario("Jubileu", 22, "M", "juba");
        u[1] = new Usuario("Creuza", 12, "F", "creuzita");

        Visualizacao[] vis = new Visualizacao[5];

        vis[0] = new Visualizacao(u[0], v[2]); //Jubileu assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(u[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());


    }
}