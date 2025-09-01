public class PagamentoCredito implements iPagamento {
    

    private String numeroCartao = "1234567812345678";

    @Override
    public String processandoPagamento(Double valor){
        if (numeroCartao.length() != 16) {
            return("Erro: forma de pagamento inválida!");
        } else {
            return("Pagamento confirmado");
        }
    }

}