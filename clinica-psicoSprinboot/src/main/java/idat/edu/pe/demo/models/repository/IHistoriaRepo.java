package idat.edu.pe.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import idat.edu.pe.demo.models.entity.Historia;

public interface IHistoriaRepo extends JpaRepository<Historia, Long>{

}
