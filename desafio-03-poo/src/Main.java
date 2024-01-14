public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Veve kkkkkkk");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.sacar(100);
        cc.depositar(200);
        cc.sacar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }}