package JavaObjetos_Conta;

import java.sql.SQLOutput;

public class Conta {
    int numero;
    String Titular;

    double saldo, limite;

    public Conta (int numero, String Titular, double saldo, double limite){
        this.numero = numero;
        this.Titular = Titular;
        this.saldo = saldo;
        this.limite = limite;
    }
    Boolean SacarDinheiro(double valor) {
        if (valor > limite || valor > saldo || saldo < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    Boolean DepositarDinheiro(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    void info() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Nome do Titular: " + Titular);
        System.out.println("Saldo da conta: " + saldo + " Reais");
        System.out.println("Seu limite é: " + limite + " Reais\n");
    }
}
