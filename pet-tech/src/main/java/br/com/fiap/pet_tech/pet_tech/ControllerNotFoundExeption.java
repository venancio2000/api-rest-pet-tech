package br.com.fiap.pet_tech.pet_tech;

public class ControllerNotFoundExeption extends  RuntimeException {
    public ControllerNotFoundExeption(String message) {
        super(message);
    }
}
