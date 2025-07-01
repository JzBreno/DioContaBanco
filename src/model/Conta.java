package model;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Float saldo;

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}
