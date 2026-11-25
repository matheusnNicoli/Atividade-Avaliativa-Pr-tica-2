package pm_projeto2;

public class Musculacao extends Atividade {
    private String horario;
    private int quantidadeAparelhos;

    public Musculacao(String nome, String horario, int duracao, int maximo, double valor, StatusAtividade status, int quantidadeAparelhos) {
        super(nome, duracao, maximo, valor, status);
        this.horario = horario;
        this.quantidadeAparelhos = quantidadeAparelhos;
    }

    public String getHorario(){ return horario; }
    public int getQuantidadeAparelhos(){ return quantidadeAparelhos; }
    @Override
    public boolean atividadeColetiva(){ return false; }
    @Override
    public void exibirDetalhes(){
        System.out.printf("musculaçao: %s | horario: %s | duraçao: %d minutos | maximo: %d | aparelhos: %d | Mensal: R$%.2f | %s%n",getNome(),horario,getDuracaoAula(),getQuantidadeMaximaParticipantes(),quantidadeAparelhos,getValorMensal(),getStatus());
    }
}
