package idat.edu.pe.demo.models.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import idat.edu.pe.demo.models.entity.Citas;

@Repository
public interface ICitasRepor extends JpaRepository<Citas, Long>{
 
    @Query("select c FROM Citas c WHERE c.psicologo.id = ?1 and c.fechacita = ?2")
    List<Citas> buscarCitas(Long idPsicologa, Date fecha);

    @Query("select c FROM Citas c WHERE c.paciente.id = ?1 and c.fechacita = ?2")
    List<Citas> validarcita(Long idPaciente, Date fecha);

    // @Query("select c FROM Citas c WHERE c.fechacita = ?1")
    // List<Citas> validarcita(Date fecha);

    @Query("select distinct DAY(c.fechacita) FROM Citas c WHERE MONTH(c.fechacita) = ?1")
    List<Integer> listardiascitas(Integer dia);
}
