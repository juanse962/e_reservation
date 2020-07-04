package com.webservice.e_reservation.services;

import com.webservice.e_reservation.modelo.Cliente;
import com.webservice.e_reservation.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Clase para definir los servicios de Cliente
 * @author jgomez40
 */
@Service
@Transactional(readOnly = true)
public class ClienteService
{
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository)
    {
        this.clienteRepository = clienteRepository;
    }

    //Metodo para realizar la operacion de guardar un cliente
    @Transactional
    public Cliente create(Cliente cliente)
    {
        return this.clienteRepository.save(cliente);
    }

    //Metodo para actualizar un cliente
    @Transactional
    public Cliente update(Cliente cliente)
    {
        return this.clienteRepository.save(cliente);
    }

    //Metodo para eliminar un cliente
    @Transactional
    public void delete(Cliente cliente)
    {
       this.clienteRepository.delete(cliente);
    }

    //Metodo para consultar un cliente por su identificacion
    public Cliente findByIdentificacionCli(String identificacionCli)
    {
       return this.clienteRepository.findByIdentificacionCli(identificacionCli);
    }

}
