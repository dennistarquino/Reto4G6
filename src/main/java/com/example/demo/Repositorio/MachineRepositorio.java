
package com.example.demo.Repositorio;
import com.example.demo.Interface.MachineInterface;
import com.example.demo.Modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dennis Tarquino
 */
@Repository

public class MachineRepositorio {
@Autowired
    private MachineInterface machineCrudRepository;
    
      public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    
    public Optional<Machine> getMachine(int id){
        return machineCrudRepository.findById(id);
    }

    public Machine save(Machine machine){
        return machineCrudRepository.save(machine);
    }
    public void delete (Machine machine){
        machineCrudRepository.delete(machine);
    }
    
}


