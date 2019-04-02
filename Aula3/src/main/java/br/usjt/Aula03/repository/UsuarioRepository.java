package br.usjt.Aula03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula03.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}