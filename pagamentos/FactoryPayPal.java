public class FactoryPayPal extends PagamentoFactory {
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPayPal();
    }
}
