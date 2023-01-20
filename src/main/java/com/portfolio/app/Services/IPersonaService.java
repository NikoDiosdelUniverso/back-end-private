
package com.portfolio.app.Services;

import com.portfolio.app.model.persona;



public interface IPersonaService {
        public Iterable<persona> verPersonas();

    public void crearPersona(persona per);

    public void borrarPersona(Integer id);

    public persona buscarPersona(Integer id);

}
