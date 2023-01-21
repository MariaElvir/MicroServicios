package com.certus.demo.service;


import com.certus.demo.model.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
