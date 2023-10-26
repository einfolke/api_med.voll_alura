package med.voll.api.domain.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPacientes(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}