package ms.personadepartamento.service;

import ms.personadepartamento.entity.Persona;
import ms.personadepartamento.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> buscarPersonas(){
        return personaRepository.findAll();
    }

    public Optional<Persona> buscarPersonas(int id){
        return personaRepository.findById(id);
    }

    public Persona crearPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void borrarPersona(int id){
        personaRepository.deleteById(id);
    }

    public Persona actualizarPersona(Persona persona){
        return personaRepository.save(persona);
    }
}
