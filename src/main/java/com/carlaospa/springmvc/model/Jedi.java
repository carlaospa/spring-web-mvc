package com.carlaospa.springmvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class Jedi {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 20, message = "Permitido no mínimo 3 e no máximo 20")
    private String name;

    @Size(max = 20, message = "Último nome não tem mais de 20 palavras")
    private String lastName;

    public Jedi(final String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
