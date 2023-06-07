package com.example.cadastrousuario.Repository;

import com.example.cadastrousuario.Entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    List<Usuario> usuarios = new ArrayList<>();


    public List<Usuario> buscarUsuarios() {
        return usuarios;
    }

    public Usuario adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;

    }

    public Usuario buscarUsuarioPorId(Long id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    public Usuario deletarUsuario(Usuario usuario){
        usuarios.remove(usuario);
        return usuario;
    }
}