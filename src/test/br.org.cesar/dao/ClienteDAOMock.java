package dao;

import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
