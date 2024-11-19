package prova_unidade_2;

public class Atendimento {
    private Integer id_atendimento;
    private Procedimento procedimento;
    private Colaborador colaborador;
    private Animal animal;
    private String data_atendimento;
    private String data_pagamento;
    
    public Atendimento(Integer id_atendimento, Procedimento procedimento, Colaborador colaborador, Animal animal,
            String data_atendimento, String data_pagamento) {
        this.id_atendimento = id_atendimento;
        this.procedimento = procedimento;
        this.colaborador = colaborador;
        this.animal = animal;
        this.data_atendimento = data_atendimento;
        this.data_pagamento = data_pagamento;
    }
    public Integer getId_atendimento() {
        return id_atendimento;
    }
    public Procedimento getProcedimento() {
        return procedimento;
    }
    public Colaborador getColaborador() {
        return colaborador;
    }
    public Animal getAnimal() {
        return animal;
    }
    public String getData_atendimento() {
        return data_atendimento;
    }
    public String getData_pagamento() {
        return data_pagamento;
    }
    @Override
    public String toString() {
        return "Atendimento [id_atendimento=" + id_atendimento + ", procedimento=" + procedimento + ", colaborador="
                + colaborador + ", animal=" + animal + ", data_atendimento=" + data_atendimento + ", data_pagamento="
                + data_pagamento + "]";
    }

    

}
