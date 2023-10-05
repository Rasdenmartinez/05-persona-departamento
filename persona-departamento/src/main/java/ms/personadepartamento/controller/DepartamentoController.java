package ms.personadepartamento.controller;

import ms.personadepartamento.entity.Departamento;
import ms.personadepartamento.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/departamento")
@RestController
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/buscar")
    public List<Departamento> buscarDepas(){
        return departamentoService.buscarDepartamentos();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Departamento> buscarDep(@PathVariable int id){
        return departamentoService.buscarDepartamento(id);
    }

    @PostMapping("/crear")
    public Departamento crearDepa(@RequestBody Departamento departamento){
        return departamentoService.crearDepartamento(departamento);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarDepa(@PathVariable int id){
        departamentoService.borrarDepartamento(id);
    }

    @PutMapping("/actualizar")
    public Departamento actualizar(@RequestBody Departamento departamento){
        return departamentoService.actualizarDepartamento(departamento);
    }


}
