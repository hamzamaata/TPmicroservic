package exemple.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import exemple.com.entities.Client;
import exemple.com.repository.ClientRepository;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping("/clients")
    public List findAll(){
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client findById(@PathVariable Long id) throws Exception{
        return clientRepository.findById(id).orElseThrow(()->new Exception("Client not found"));
    }

    @PostMapping("/clients")
    public Client save(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @DeleteMapping("/clients/{id}")
    public void delete(@PathVariable Long id){
        clientRepository.deleteById(id);
    }
}
