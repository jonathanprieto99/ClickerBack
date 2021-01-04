package clicker.back.services.impl;

import clicker.back.entities.EmpresasTaxi;
import clicker.back.repositories.EmpresasTaxiRepository;
import clicker.back.services.EmpresasTaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultEmpresasTaxiService implements EmpresasTaxiService {

    @Autowired
    EmpresasTaxiRepository empresasTaxiRepository;


    @Override
    public EmpresasTaxi save(EmpresasTaxi empresasTaxi) {
        return empresasTaxiRepository.save(empresasTaxi);
    }

    @Override
    public void delete(EmpresasTaxi empresasTaxi) {
        empresasTaxiRepository.delete(empresasTaxi);
    }

    @Override
    public EmpresasTaxi getById(EmpresasTaxi empresasTaxi) {
        return empresasTaxiRepository.findById(empresasTaxi.getIdEmptaxi()).orElse(null);
    }

    @Override
    public List<EmpresasTaxi> getAll() {
        return (List<EmpresasTaxi>) empresasTaxiRepository.findAll();
    }
}
