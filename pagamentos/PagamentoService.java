public class PagamentoService {

    public void realizarPagamento(String tipoDePagamento, Double valor) {
        
        PagamentoFactory factory = null; 

        if (tipoDePagamento.equalsIgnoreCase("cartao")) {
            factory = new FactoryCartaoCredito();
        } else if (tipoDePagamento.equalsIgnoreCase("paypal")) {
            factory = new FactoryPayPal();
        } else if (tipoDePagamento.equalsIgnoreCase("cripto")) {
            factory = new FactoryCripto();
        } else {
            System.out.println("======================================");
            System.out.println("Status da Transação: Tipo de pagamento inválido.");
            System.out.println("======================================");
            return; 
        }

        if (factory != null) {
            iPagamento pagamento = factory.criarPagamento();
            
            String resultado = pagamento.processandoPagamento(valor);
            
            System.out.println("======================================");
            System.out.println("Status da Transação: " + resultado);
            System.out.println("======================================");
        }
    }
}