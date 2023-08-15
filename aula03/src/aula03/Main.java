package aula03;
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta(0.5f);
        c1.carga = 90;
        c1.tampada = true;
        c1.status();


    }
}