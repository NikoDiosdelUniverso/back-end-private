package com.portfolio.app.controller;

import com.portfolio.app.Services.IHabilidadesService;
import com.portfolio.app.model.habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/skills")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins= "https://portfolio-abf44.web.app")
public class habilidadesController {

    @Autowired
    private IHabilidadesService skillServ;

    @PostMapping("/new")
    public @ResponseBody
    String agregarHabilidad(@RequestBody habilidades skill) {
        skillServ.crearSkill(skill);
        return "Guardado";
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<habilidades> verHabilidades() {
        return skillServ.verSkills();
    }
    
        @GetMapping("/detail/{id}")
     public @ResponseBody habilidades detailEducacion(@PathVariable Integer id) {
         habilidades skill= skillServ.buscarSkill(id);
         return skill;
     }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHabilidad(@PathVariable Integer id) {
        skillServ.borrarSkill(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarHabilidad(@PathVariable Integer id,
            @RequestBody habilidades hab) {
        habilidades skill = skillServ.buscarSkill(id);
        skill.setNombre(hab.getNombre());

        skill.setLogo(hab.getLogo());
        skillServ.crearSkill(skill);
        return new ResponseEntity(HttpStatus.OK);
    }


}
