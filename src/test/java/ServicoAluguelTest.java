import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoAluguelTest {

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Aluguel");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}