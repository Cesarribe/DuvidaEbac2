package org.br.cesar.dao;

import org.br.cesar.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    public Cliente buscarPorCpf(Long cpf);
}
