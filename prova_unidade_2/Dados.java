package prova_unidade_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Dados implements IDados {

    @Override
    public Set<prova_unidade_2.Cliente> Cliente() {
        // TODO Auto-generated method stub
        Set<Cliente> cl = new HashSet<Cliente>();
        cl.add(new Cliente(1, "Pedro", Procedimento.EMERGENCIA));
        return cl;
    }

    @Override
    public Set<prova_unidade_2.Colaborador> Colaborador() {
        // TODO Auto-generated method stub
        Set<Colaborador> col= new LinkedHashSet<Colaborador>();
        col.add(new Colaborador(3, "Sergio", Funcao.VETERINARIO));
        col.add(new Colaborador(6, "Juarez", Funcao.AUXILIAR));
        return col;
    }

    @Override
    public List<prova_unidade_2.Animal> getAnimais() {
        // TODO Auto-generated method stub
        ArrayList<Animal> pet = new ArrayList<Animal>();
        pet.add(new Animal(15, "Scooby", Raca.POODLE));
        return pet;
        
    }

    @Override
    public LinkedList<prova_unidade_2.Atendimento> Atendimento() {
        // TODO Auto-generated method stub
        Animal a = null;
        for(Animal x : getAnimais()){
            a = x;
        }
        Colaborador b = null;
        for(Colaborador x : Colaborador()){
            b = x;
        }
        LinkedList<Atendimento> att = new LinkedList<Atendimento>();
        att.add(new Atendimento(1, Procedimento.EMERGENCIA, b, a, "20/10/20", "25/11/20"));
        return att;
    }
    
}
