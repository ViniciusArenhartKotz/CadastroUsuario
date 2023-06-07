package com.example.cadastrousuario.Entity;

import lombok.*;

import javax.xml.transform.sax.SAXResult;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    private long id;
    private String nome;
    private String email;
    private String senha;




}
