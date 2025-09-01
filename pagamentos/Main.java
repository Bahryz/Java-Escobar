public class Main {
    public static void main(String[] args) {
        PagamentoService servico = new PagamentoService();

        System.out.println("Cliente tentando pagar com Cartão de Crédito...");
        servico.realizarPagamento("cartao", 150.75);

        System.out.println("\nCliente tentando pagar com PayPal...");
        servico.realizarPagamento("paypal", 200.00);

        System.out.println("\nCliente tentando pagar com Criptomoedas (saldo suficiente)...");
        servico.realizarPagamento("cripto", 350.50);

        System.out.println("\nCliente tentando pagar com Criptomoedas (saldo insuficiente)...");
        servico.realizarPagamento("cripto", 1000.00);

        System.out.println("\nCliente tentando pagar com um método que não existe...");
        servico.realizarPagamento("boleto", 99.90);
    }
}


