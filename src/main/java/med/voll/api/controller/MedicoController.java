package med.voll.api.controller;

import org.springframework.web.bind.annotation.RestController;

import med.voll.api.record.medico.Medico;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody Medico medico){
        System.out.println(medico);
    }
}
