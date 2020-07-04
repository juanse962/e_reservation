package com.webservice.e_reservation.repository;

import com.webservice.e_reservation.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Interfaz para las operaciones de la bdd relacionadas con cliente
 * */
public interface ClienteRepository extends JpaRepository<Cliente,String>
{
    /**
     * Definicion de metodo para buscar clientes por apellido
     * utilizando JPQL
     * @param apellidoCli
     * @return
     */

    List<Cliente> findByApellidoCli(String apellidoCli);
    Cliente findByIdentificacionCli(String identificacionCli);

}
