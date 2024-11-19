package prova_unidade_2;

public class Animal {
    private Integer id_animal;
    private String apelido;
    private Raca raca;
    
    public Animal(Integer id_animal, String apelido, Raca raca) {
        this.id_animal = id_animal;
        this.apelido = apelido;
        this.raca = raca;
    }
    public Integer getId_animal() {
        return id_animal;
    }
    public String getApelido() {
        return apelido;
    }
    public Raca getRaca() {
        return raca;
    }
    @Override
    public String toString() {
        return "Animal [id_animal=" + id_animal + ", apelido=" + apelido + ", raca=" + raca + "]";
    }
    
}
