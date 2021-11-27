import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoVendaTest {

    @Test
    public void deveAprovarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda Aprovada", servico.aprovado());
    }

    @Test
    public void deveReprovarVenda() {
        IServico servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda Recusada", servico.reprovado());
    }
}