package br.com.bartsch.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.bartsch.forum.modelo.Curso;
import br.com.bartsch.forum.modelo.Topico;
import br.com.bartsch.forum.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotBlank
	private String titulo;
	@NotNull @NotBlank
	private String mensagem;
	@NotNull @NotBlank
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
