package exercicio.agenda.service;

import exercicio.agenda.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class AgendaService {

    private List<Contato> contatos = new ArrayList<>();

    public List<Contato> adicionaContato(Contato contato) {
        contatos.add(contato);
        return contatos;
    }

    public String buscaContato(Contato contato) {
        if (contatos.contains(contato)) {
            return contato.getNome();
        } else {
            return null;
        }
    }

    public int quantidadeDeContatos() {
        return contatos.size();
    }

}
