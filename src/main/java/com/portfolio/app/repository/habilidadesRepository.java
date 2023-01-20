
package com.portfolio.app.repository;

import com.portfolio.app.model.habilidades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface habilidadesRepository extends CrudRepository<habilidades, Integer> {
    
}
