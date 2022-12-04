package idat.edu.pe.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import idat.edu.pe.demo.models.entity.Citas;

public interface ICitasRepo extends JpaRepository<Citas, Long>{

}
