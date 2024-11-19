package prova_unidade_2;

public class Colaborador extends Pessoa {
    private Funcao funcao;

    public Funcao getFuncao() {
        return funcao;
    }

    public Colaborador(Integer id, String nome, Funcao funcao) {
        super(id,nome);
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Colaborador [funcao=" + funcao + ", getId()=" + getId() + ", getNome()=" + getNome() + "]";
    }


    
}
