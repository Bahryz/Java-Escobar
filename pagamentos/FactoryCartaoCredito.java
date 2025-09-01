public class FactoryCartaoCredito extends PagamentoFactory {
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCredito();
    }
}