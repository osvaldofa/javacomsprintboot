package com.aula.webdemo.controllers;

import com.aula.webdemo.domain.Tarefa;
import com.aula.webdemo.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TarefasController {

    @Autowired
    private TarefasService tarefasService;

    @GetMapping("/tarefas")
    public List<Tarefa> listarTarefas(){
        return tarefasService.listarTodasAsTarefas();
    }

    @GetMapping("/tarefas/{idTarefa}")
    public ResponseEntity<Tarefa> listarDadosTarefa(@PathVariable String idTarefa){
        Tarefa tarefa = tarefasService.listarTarefaPeloId(idTarefa);
        if (tarefa != null){
            return ResponseEntity.ok(tarefa);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/tarefas")
    public String adicionarNovaTarefa(@RequestBody Tarefa tarefa){
        tarefasService.adicionarTarefa(tarefa);
        return "Tarefa adicionada com sucesso!";
    }

}
