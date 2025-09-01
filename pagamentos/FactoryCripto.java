public class FactoryCripto extends PagamentoFactory {
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCripto();
    }
}
