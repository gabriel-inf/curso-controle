package com.curso.model.monitor;


import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MonitorRepository extends CrudRepository<Monitor, Long> {

    @Modifying
    @Query ("UPDATE Monitor m SET m.ativa=false WHERE :id=m.id")
    public int desativarMonitor(@Param("id") Long id); 

}