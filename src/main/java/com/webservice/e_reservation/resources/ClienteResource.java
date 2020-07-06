package com.webservice.e_reservation.resources;

import com.webservice.e_reservation.modelo.Cliente;
import com.webservice.e_reservation.resources.vo.ClienteVo;
import com.webservice.e_reservation.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *Clase que respresenta todos los servicios web de Cliente
 * @author juanse962
 *
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteResource
{
    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PutMapping("/{identificacion}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("identificacion") String identificacion,
    ClienteVo clienteVo)
    {
        Cliente cliente = this.clienteService.findByIdentificacionCli(identificacion);
        if (cliente == null){
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }else {
            cliente.setNombreCli(clienteVo.getNombreCli());
            cliente.setApellidoCli(clienteVo.getApellidoCli());
            cliente.setApellidoCli(clienteVo.getApellidoCli());
            cliente.setDireccionCli(clienteVo.getDireccionCli());
            cliente.setDireccionCli(clienteVo.getDireccionCli());
            cliente.setEmailCli(clienteVo.getEmailCli());

            return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVo clienteVo)
    {
        Cliente cliente = new Cliente();
        cliente.setNombreCli(clienteVo.getNombreCli());
        cliente.setApellidoCli(clienteVo.getApellidoCli());
        cliente.setApellidoCli(clienteVo.getApellidoCli());
        cliente.setDireccionCli(clienteVo.getDireccionCli());
        cliente.setDireccionCli(clienteVo.getDireccionCli());
        cliente.setEmailCli(clienteVo.getEmailCli());

        return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
    }
}
