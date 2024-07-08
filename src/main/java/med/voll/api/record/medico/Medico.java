package med.voll.api.record.medico;

import med.voll.api.record.endereco.Endereco;

public record Medico(String nome, String crm, String email, Especialidade especialidade, Endereco endereco) {

}
