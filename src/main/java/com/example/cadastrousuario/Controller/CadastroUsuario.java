package com.example.cadastrousuario.Controller;

import com.example.cadastrousuario.Entity.Usuario;
import com.example.cadastrousuario.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CadastroUsuario {

@Autowired
private UsuarioService usuarioService;

@GetMapping("usuario/{id}")
    public Usuario buscarUsuario(@PathVariable Long id ){
return usuarioService.buscarusuario(id);


}
@PostMapping("usuario/salvar")
public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
    return usuarioService.cadastrarUsuario(usuario);
}
@GetMapping("usuarios")
public List<Usuario> buscarUsuarios(){
    return usuarioService.buscarUsuarios();
}

@PutMapping("atualizar/{id}")
public  Usuario atualizarUsuario(@PathVariable long id, @RequestBody Usuario usuario){
    return usuarioService.atualizarUsuario(id, usuario);
}
}