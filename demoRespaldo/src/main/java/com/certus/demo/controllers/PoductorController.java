package com.certus.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hola/server")
public class PoductorController {

	@GetMapping
	public String hola() {
		return "Hola soy el resvicio de respaldo";
	}
}
