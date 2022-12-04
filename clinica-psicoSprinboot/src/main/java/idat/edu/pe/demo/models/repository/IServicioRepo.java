package idat.edu.pe.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import idat.edu.pe.demo.models.entity.Servicio;

public interface IServicioRepo extends JpaRepository<Servicio, Long>{

}
