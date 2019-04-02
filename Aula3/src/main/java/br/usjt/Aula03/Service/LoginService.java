package br.usjt.Aula03.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Aula03.model.Usuario;
import br.usjt.Aula03.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}