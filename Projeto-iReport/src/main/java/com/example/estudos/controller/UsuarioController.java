package com.example.estudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estudos.domain.Usuario;
import com.example.estudos.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	/*
	@GetMapping
	public ResponseEntity<List<Usuario>> getUserList() {
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	*/
	public List<Usuario> getList(){
		return usuarioRepository.findAll();
	}

}
