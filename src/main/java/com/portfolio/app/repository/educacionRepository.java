
package com.portfolio.app.repository;

import com.portfolio.app.model.educacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends CrudRepository<educacion, Integer> {
    
}
