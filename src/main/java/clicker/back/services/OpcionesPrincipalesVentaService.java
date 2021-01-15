package clicker.back.services;

import clicker.back.Antiguo.OpcionesPrincipalesVenta;

import java.util.List;

public interface OpcionesPrincipalesVentaService {

    OpcionesPrincipalesVenta save(OpcionesPrincipalesVenta opcionesPrincipalesVenta);

    void delete(OpcionesPrincipalesVenta opcionesPrincipalesVenta);

    OpcionesPrincipalesVenta getById(Long id);

    List<OpcionesPrincipalesVenta> getAll();
}
