package database.repository;

import database.repository.model.Cargo;
import database.repository.model.CargoException;

public interface CargoRepository {
    void salvar(Cargo cargo) throws CargoException;

    Cargo consultarPorId(Integer id);

    Cargo[] consultarPorNome(String nome);

    Cargo[] consultarTodos();

    void removerCargo(Cargo cargo);
}
