package br.com.bartsch.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.bartsch.forum.modelo.Resposta;
import br.com.bartsch.forum.modelo.Usuario;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String autor;

	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.autor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getAutor() {
		return autor;
	}

}
