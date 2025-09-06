import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String endereco;
    private Categoria categoria;
    private LocalDateTime horario;
    private String descricao;
    private List<Usuario> participantes = new ArrayList<>();

    public Evento(String nome, String endereco, Categoria categoria, LocalDateTime horrio, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horrio;
        this.descricao = descricao;
    }

public voide adicionarParticipante(Usuario usuario) {
        participantes.add(usuario);
    }

public void removerParticipante(Usuario usuario) {
        participantes.remove(usuario);
    }

public boolean estaOcorrendo() {
        LocalDateTime agora = LocalDateTime.now();
        return agora.isAfter(horario) && agora.isBefore(horario.plusHours(1)); // Supondo que o evento dura 1 hora
    }

public boolean jaOcorrido() {
        return LocalDateTime.now().isAfter(horario);
    }    
    
}
