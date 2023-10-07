package JavaObjetos_Conta;

public class Main {
    public static void main(String[] args) {
        Conta a1 = new Conta(4334 , "Ronaldo", 3344, 6500);
        Conta a2 = new Conta(5675 , "Zezé", 38950, 200000);

        a1.SacarDinheiro(40);// Não funciona para sacar dinheiro acima do saldo,limite ou ambos;
        a2.DepositarDinheiro(70000);// Não funciona para códigos igual ou abaixo de zero.

        a1.info();
        a2.info();
    }
}