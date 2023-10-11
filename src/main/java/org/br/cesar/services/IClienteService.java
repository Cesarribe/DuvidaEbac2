package org.br.cesar.services;

import org.br.cesar.domain.Cliente;

public interface IClienteService {

    public void salvar(Cliente cliente);

    public Cliente buscarPorCpf(Long cpf);
}
