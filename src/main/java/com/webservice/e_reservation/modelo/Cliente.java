package com.webservice.e_reservation.modelo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Clase que representa la tabla cliente
 *
 * @author juanse962
 */
@Entity
@Table( name = "cliente" )
@Data
@NamedQuery(name = "Cliente.findByIdentificacion", query = "SELECT c FROM Cliente c where c.identificacionCli = ?1")
public class Cliente {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
    private String idCli;
    private String apellidoCli;
    private String nombreCli;
    private String identificacionCli;
    private String direccionCli;
    private String telefonoCli;
    private String emailCli;
    @OneToMany(mappedBy = "cliente")
    private Set<Reserva> reservas;

    public Cliente() { }
}
