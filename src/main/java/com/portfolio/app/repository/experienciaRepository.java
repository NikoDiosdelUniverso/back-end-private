
package com.portfolio.app.repository;

import com.portfolio.app.model.experiencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends CrudRepository<experiencia, Integer> {
    
}
