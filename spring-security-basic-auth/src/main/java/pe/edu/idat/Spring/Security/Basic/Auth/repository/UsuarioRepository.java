package pe.edu.idat.Spring.Security.Basic.Auth.repository;


import pe.edu.idat.Spring.Security.Basic.Auth.model.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario findByUsername(String username);

    List<Usuario> findAll();
}
