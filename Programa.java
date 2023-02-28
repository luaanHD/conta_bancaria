public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular="Luan Toniolo";
        minhaConta.saldo=673;

        Conta minhaConta2;
        minhaConta2 = new Conta();
        minhaConta2.numero=2;
        minhaConta2.titular="Eduardo Rorato";
        minhaConta2.saldo=13699;

        System.out.println("Número da Conta: " + minhaConta.numero);
        System.out.println("Titular da Conta: " + minhaConta.titular);
        System.out.println("Saldo da Conta: " + minhaConta.saldo);

        System.out.println("\n");

        System.out.println("Número da Conta: " + minhaConta2.numero);
        System.out.println("Titular da Conta: " + minhaConta2.titular);
        System.out.println("Saldo da Conta: " + minhaConta2.saldo);
    }
}
