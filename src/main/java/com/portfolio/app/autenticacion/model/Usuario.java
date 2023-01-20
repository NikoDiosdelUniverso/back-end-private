
package com.portfolio.app.autenticacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class Usuario implements Serializable {
    
    @Id
    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String id) {
        this.userId = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
