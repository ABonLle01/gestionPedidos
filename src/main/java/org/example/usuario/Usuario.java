package org.example.usuario;

import lombok.Data;

import java.io.Serializable;

@Data
public class Usuario implements Serializable {
    private Long id_usuario;
    private String nombre;
    private String email;
    private String password;
}
