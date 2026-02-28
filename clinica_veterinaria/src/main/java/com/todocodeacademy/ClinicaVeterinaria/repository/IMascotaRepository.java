package com.todocodeacademy.ClinicaVeterinaria.repository;

import com.todocodeacademy.ClinicaVeterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}
