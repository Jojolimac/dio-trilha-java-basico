public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
            //Sempre que uma condição tiver mais de uma instrução
            //é necessário criar um bloco com {}
        }else
            System.out.println("Saldo Insificiente!");
    }
}
