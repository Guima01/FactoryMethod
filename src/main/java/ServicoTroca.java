public class ServicoTroca implements IServico{

    public String aprovado() {
        return  "Troca Aprovada";
    }

    public String reprovado(){
        return "Troca Recusada, pois o limite do prazo foi excedido";
    }

}
