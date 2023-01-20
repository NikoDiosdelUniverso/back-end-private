
package com.portfolio.app.repository;

import com.portfolio.app.model.proyectos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends CrudRepository<proyectos, Integer> {
    
}
