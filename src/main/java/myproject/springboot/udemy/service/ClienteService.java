package myproject.springboot.udemy.service;

import myproject.springboot.udemy.model.Cliente;
import myproject.springboot.udemy.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(){
    }

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvarCliente (Cliente cliente) {
        validarCliente(cliente);
        this.clienteRepository.persistirCliente(cliente);
    }

    public void validarCliente(Cliente cliente){
        //Validando um cliente
    }
}
