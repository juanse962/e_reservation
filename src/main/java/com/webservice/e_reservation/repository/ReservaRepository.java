package com.webservice.e_reservation.repository;

import com.webservice.e_reservation.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva,String>
{
    @Query("SELECT r from Reserva r where r.fechaIngresoRes =:fechaInicio and r.fechaSalidaRes =:fechaSalida")
    List<Reserva> find(@Param("fechaInicio") Date fechaInicio,@Param("fechaSalida")  Date fechaSalida);

}
