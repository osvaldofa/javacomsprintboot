package com.aula.webdemo.service;

import com.aula.webdemo.domain.Tarefa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TarefasService {

    private List<Tarefa> listaDeTarefas;

    // Método construtor, chamado no momento da instanciação do objeto
    public TarefasService(){
        listaDeTarefas = new ArrayList<Tarefa>();
    }

    public List<Tarefa> listarTodasAsTarefas(){
        return listaDeTarefas;
    }

    public Tarefa listarTarefaPeloId(String idTarefa){
        // Percorre a listagem até encontrar uma tarefa com idTarefa igual ao procurado
        for (int i = 0; i < listaDeTarefas.size(); i++){
            if (listaDeTarefas.get(i).getIdTarefa().equalsIgnoreCase(idTarefa)){
                return listaDeTarefas.get(i);
            }
        }
        return null;
    }

    // Método que adiciona uma nova tarefa na lista
    public void adicionarTarefa(Tarefa tarefa){
        listaDeTarefas.add(tarefa);
    }
}
