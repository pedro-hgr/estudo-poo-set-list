package prova_unidade_2;

public class Executar {
    public static void main(String[] args) {
        Dados db = new Dados();
        Imprimir imp = new Imprimir();
        imp.impressao(db.Atendimento());
    }
}
