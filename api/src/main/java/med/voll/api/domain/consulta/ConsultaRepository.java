package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    boolean existsByMedicoAndData(Long idMedico, LocalDateTime data);

    boolean existByPacienteIdAndDataBetween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
