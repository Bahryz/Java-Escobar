public class PagamentoCripto implements iPagamento {
    
    private Double saldo = 500.0;

    @Override
    public String processandoPagamento(Double valor){
        if (saldo > valor) {
            return("Saldo suficiente, pagamento concluido!");
        } else {
            return("Saldo insuficiente, pagamento reprovado!");
        }
    }

}
