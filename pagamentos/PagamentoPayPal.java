public class PagamentoPayPal implements iPagamento {
    
    private Boolean emailVinculado = true;

    @Override
    public String processandoPagamento(Double valor){
        if (emailVinculado == false) {
            return("Email não vinculado, pagamento não concluido!");
        } else {
            return("Email vinculado, pagamento concluido!");
        }
    }

}
