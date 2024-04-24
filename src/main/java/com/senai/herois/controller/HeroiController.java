package com.senai.herois.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.herois.model.Heroi;
import com.senai.herois.service.HeroiService;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    @Autowired
    private HeroiService heroiService;

    @PostMapping
    public ResponseEntity<Heroi> cadastrar(@RequestBody Heroi heroi) {
        // Implement logic to create a new Heroi instance and save
        heroi = heroiService.inserir(heroi);
        return ResponseEntity.created(URI.create(heroi.getNome())).body(heroi);

    }

    @GetMapping
    public ResponseEntity<List<Heroi>> listar() {
        var heroi = heroiService.consultar();
        return ResponseEntity.ok().body(heroi);
    }
}
