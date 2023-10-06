package ms.personadepartamento.controller;

import ms.personadepartamento.entity.Departamento;
import ms.personadepartamento.entity.Persona;
import ms.personadepartamento.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/persona")
@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/buscar")
    public List<Persona> buscarPersons(){
        return personaService.buscarPersonas();
    }
    @GetMapping("/buscar/{id}")
    public Optional<Persona> buscarPer(@PathVariable int id){
        return personaService.buscarPersonas(id);
    }

    @PostMapping("/crear")
    public Persona crearPer(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarPer(@PathVariable int id){
        personaService.borrarPersona(id);
    }

    @PutMapping("/actualizar")
    public Persona actualizar(@RequestBody Persona persona){
        return personaService.actualizarPersona(persona);
    }

}
