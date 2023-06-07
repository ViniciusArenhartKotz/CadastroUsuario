package com.example.cadastrousuario.Service;

import com.example.cadastrousuario.Entity.Usuario;
import com.example.cadastrousuario.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario buscarusuario (long id){
        return usuarioRepository.buscarUsuarioPorId(id);

    }
    public  Usuario cadastrarUsuario (Usuario usuario){
        for(Usuario u : usuarioRepository.buscarUsuarios()){
            if(u.getEmail().equals(usuario.getEmail())){
                return null;
            }
        }
        return usuarioRepository.adicionarUsuario(usuario);
    }
    public List<Usuario> buscarUsuarios(){
        return usuarioRepository.buscarUsuarios();
    }
public Usuario atualizarUsuario(Long id, Usuario usuario){
        Usuario usuario1 = usuarioRepository.buscarUsuarioPorId(id);
        if(usuario1 == null){
            return null;
        }else{
            usuario.setId(id);
            usuarioRepository.deletarUsuario(usuario1);
            usuarioRepository.adicionarUsuario(usuario);
            return usuario;
        }
}
}
