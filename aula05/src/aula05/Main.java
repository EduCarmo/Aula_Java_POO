import aula05.ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");


        ContaBanco p2 = new ContaBanco();
        p2.setNunConta(2222);
        p2.setDono("Rosana");
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}