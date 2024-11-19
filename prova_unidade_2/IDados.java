package prova_unidade_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public interface IDados {
    Set<Cliente> Cliente();
    Set<Colaborador> Colaborador();
    List<Animal> getAnimais();
    LinkedList<Atendimento> Atendimento();

}
