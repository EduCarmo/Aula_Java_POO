package aula05;

import java.util.Objects;

public class ContaBanco {

    //Atributos
    public int nunConta;
    protected String tipo;
    private String dono;
    private  float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("**************************************");
        System.out.println("Conta: " + this.getNunConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());

    }

    //Métodos
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")){
            this.setSaldo(50);
        }else if (t.equals("cp")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Tem saldo na conta não pode fechar a conta");
        }else if (this.getSaldo() < 0){
            System.out.println("Sem saldo na conta nçao pode fechar a conta");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + getDono());
        }else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Sac relizado na conta de " + this.getDono());
            } else {
                System.out.println("saque insuficiente");
            }

        } else {
            System.out.println("Impossivel sacar em uma conta fechada");
        }
    }

    public void pagarMensal(){
        int valor = 0;
        if (this.getTipo() == "cc"){
            valor = 12;
        }else if (this.getTipo() == "cp"){
            valor = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    //Constructor

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Get e Set


    public int getNunConta() {
        return nunConta;
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
