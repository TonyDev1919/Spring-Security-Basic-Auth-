package pe.edu.idat.Spring.Security.Basic.Auth.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.Spring.Security.Basic.Auth.model.Usuario;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    //usuarios admin:1234 user:abcd
    public UsuarioRepositoryImpl() {
        usuarios.add(new Usuario("admin", "$2a$12$hHm2rBwxwyWkJ4KP8ttnMeg1NAiGFXR2lbCh18Ua2MQExcoF4J.pa", true));
        usuarios.add(new Usuario("user", "$2a$12$DDtLTOvcIKsgbDDN/TBUA.mm2Yuf1AGZkczeUUVrhG6ROPm7vw3tK", true));
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
