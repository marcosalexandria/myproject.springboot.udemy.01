package myproject.springboot.udemy.repository;

import myproject.springboot.udemy.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    public void persistirCliente(Cliente cliente){
        //inserir cliente no banco de dados
    }
}
