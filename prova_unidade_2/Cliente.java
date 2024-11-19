package prova_unidade_2;

public class Cliente extends Pessoa{
    private Procedimento procedimento;

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public Cliente(Integer id, String nome, Procedimento procedimento) {
        super(id, nome);
        this.procedimento = procedimento;
    }

    @Override
    public String toString() {
        return "Cliente [procedimento=" + procedimento + "]";
    }


}
