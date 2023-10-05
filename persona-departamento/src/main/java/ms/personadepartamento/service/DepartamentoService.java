package ms.personadepartamento.service;

import ms.personadepartamento.entity.Departamento;
import ms.personadepartamento.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<Departamento> buscarDepartamentos(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> buscarDepartamento(int id){
        return departamentoRepository.findById(id);
    }

    public Departamento crearDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void borrarDepartamento(int id){
        departamentoRepository.deleteById(id);
    }

    public Departamento actualizarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }


}
