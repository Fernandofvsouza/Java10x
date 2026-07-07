package com.souza.fernando.batismoJava.desafio.desafioCrudUsers;

import java.util.ArrayList;

public class UsuarioService {
    ArrayList<Usuario> usuarios;
    private int id = 1;


    public UsuarioService(ArrayList<Usuario> usuarios) {
        this.usuarios = new ArrayList<>();
    }

    public Usuario cadastrarUsuario(String nome, String email) throws NomeInvalidoException, EmailInvalidoException{
       if(nome == null || nome.isBlank()){
           throw new NomeInvalidoException("Nome não pode ser vazio ");
       }
       if(email == null || email.isBlank()|| !email.contains("@")){
           throw new NomeInvalidoException("Email invalido");
       }
        Usuario usuario = new Usuario(id, nome, email);
        usuarios.add(usuario);
        id++;
        return usuario;
    }

    public boolean listarUsuarios() {
        if (usuarios.isEmpty()) {
            return false;
        }
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + " | Nome: " + usuario.getNome() + " | Email: " + usuario.getEmail());
        }
        return true;
    }

    public int buscarPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario.getId();
            }
        }
        return -1;
    }

    public Usuario atualizarUsuario(int id, String nome, String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setNome(nome);
                usuario.setEmail(email);
                return usuario;
            }
        }
        return null;
    }

    public boolean excluirUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }



    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int getId() {
        return id;
    }
}
