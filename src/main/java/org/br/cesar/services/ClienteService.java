package org.br.cesar.services;

import org.br.cesar.dao.ClienteDAO;
import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService (IClienteDAO clienteDAO){
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return clienteDAO.buscarPorCpf(cpf);
    }
}
