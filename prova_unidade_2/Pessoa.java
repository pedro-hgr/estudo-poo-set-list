package prova_unidade_2;

public class Pessoa{
    private Integer id;
    private String nome;
    
    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + "]";
    }
    

}