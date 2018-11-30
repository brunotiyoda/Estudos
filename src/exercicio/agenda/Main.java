package exercicio.agenda;

import exercicio.agenda.model.Contato;
import exercicio.agenda.service.AgendaService;

public class Main {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setEmail("bruno_tiyoda@hotmail.com");
        contato.setNome("Bruno Yudi Tiyoda");

        AgendaService agendaService = new AgendaService();

        agendaService.adicionaContato(contato);
        agendaService.quantidadeDeContatos();
        agendaService.buscaContato(contato);

    }

}
