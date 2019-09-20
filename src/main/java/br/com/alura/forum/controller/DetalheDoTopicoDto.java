
package br.com.alura.forum.controller;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalheDoTopicoDto {

   private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao; 
    private String nomeAutor;
    private StatusTopico stauts;
    private List<RespostaDto> respostas;
    
    //Retorna detalhes da api
    public DetalheDoTopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.stauts = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMesagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public StatusTopico getStauts() {
        return stauts;
    }

    public List<RespostaDto> getRespostas() {
        return respostas;
    }
    
    
    
    
    
    
}
