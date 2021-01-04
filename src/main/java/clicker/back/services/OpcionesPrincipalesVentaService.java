package clicker.back.services;

import clicker.back.entities.EmpresasTaxi;
import clicker.back.entities.OpcionesPrincipalesVenta;

import java.util.List;

public interface OpcionesPrincipalesVentaService {

    OpcionesPrincipalesVenta save(OpcionesPrincipalesVenta opcionesPrincipalesVenta);

    void delete(OpcionesPrincipalesVenta opcionesPrincipalesVenta);

    OpcionesPrincipalesVenta getById(OpcionesPrincipalesVenta opcionesPrincipalesVenta);

    List<OpcionesPrincipalesVenta> getAll();
}
