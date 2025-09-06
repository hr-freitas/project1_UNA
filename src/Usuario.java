import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String cidade;
    private List<Evento> eventosConfirmados = new ArrayList<>();

    public Usuario(String nome, String email, String cidade) {
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
    }

    public void confirmarPresenca(Evento evento) {
        eventosConfirmados.add(evento);
        evento.adicionarParticipante(this);
    }

    public void cancelarPresenca(Evento evento) {
        eventosConfirmados.remove(evento);
        evento.removerParticipante(this);
    }

    public List<Evento> getEventosConfirmados() {
        return eventosConfirmados;
    }
}
