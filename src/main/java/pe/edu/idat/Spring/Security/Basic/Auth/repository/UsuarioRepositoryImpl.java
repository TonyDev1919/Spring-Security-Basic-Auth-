package pe.edu.idat.Spring.Security.Basic.Auth.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.Spring.Security.Basic.Auth.model.Usuario;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepositoryImpl() {
        usuarios.add(new Usuario("admin", "1234", true));
        usuarios.add(new Usuario("user", "abcd", true));
    }

    @Override
    public Usuario findByUsername(String username){
        return usuarios.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> findAll(){
        return usuarios;
    }
}
