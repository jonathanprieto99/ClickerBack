package clicker.back.services;

import clicker.back.entities.Documentos;
import clicker.back.entities.EmpresasTaxi;

import java.util.List;

public interface EmpresasTaxiService {
    EmpresasTaxi save(EmpresasTaxi empresasTaxi);

    void delete(EmpresasTaxi empresasTaxi);

    EmpresasTaxi getById(EmpresasTaxi empresasTaxi);

    List<EmpresasTaxi> getAll();


}
