package br.com.bartsch.forum.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.bartsch.forum.modelo.Curso;

@SpringBootTest
class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	@Test
	void deveriaCarregarCursoPeloNome() {
		String nomeCurso = "HTML 5";
		
		Curso curso = repository.findByNome(nomeCurso);
		
		Assertions.assertNotNull(curso);
		Assertions.assertEquals(nomeCurso, curso.getNome());
	}

}
