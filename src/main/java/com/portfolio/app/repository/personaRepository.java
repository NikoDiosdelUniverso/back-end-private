
package com.portfolio.app.repository;

import com.portfolio.app.model.persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends CrudRepository<persona, Integer>{
    
}
