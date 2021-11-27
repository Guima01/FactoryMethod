import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoCompraTest {

    @Test
    public void deveAprovarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra Aprovada", servico.aprovado());
    }

    @Test
    public void deveReprovarVenda() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra Reprovada", servico.reprovado());
    }
}