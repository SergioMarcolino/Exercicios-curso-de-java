package map.agendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Eventos> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put (data, new Eventos(nome, atracao));
    }
    public void exibirAgenda() {
        agendaEventosMap = new TreeMap<>( agendaEventosMap );
        for (Map.Entry<LocalDate, Eventos> entry : agendaEventosMap.entrySet()) {
            System.out.println("Data do evento " + entry.getKey() + " evento " + entry.getValue());
        }
    }
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        for (Map.Entry<LocalDate, Eventos> entry : agendaEventosMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.equals(dataAtual) ||  dataEvento.isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                proximaData = dataEvento;
                break;
            }
            if(proximoEvento != null) {
                System.out.println("Proxima data do evento " + proximoEvento.getNome() + "acontecerá na data " + dataEvento);
            }
            else {
                System.out.println("Não há eventos futuros nak agenda");
            }
        }
    }

}
