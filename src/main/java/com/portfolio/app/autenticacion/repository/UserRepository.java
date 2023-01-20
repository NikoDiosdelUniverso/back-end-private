
package com.portfolio.app.autenticacion.repository;

import com.portfolio.app.autenticacion.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Usuario, String> {
    
    Usuario findByUserId(String Id);
}
