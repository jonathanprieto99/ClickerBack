package clicker.back.services;

import clicker.back.entities.Solicitudes;
import clicker.back.entities.TiempoCompra;

import java.util.List;

public interface TiempoCompraService {

    TiempoCompra save(TiempoCompra tiempoCompra);

    void delete(TiempoCompra tiempoCompra);

    TiempoCompra getById(TiempoCompra tiempoCompra);

    List<TiempoCompra> getAll();
}
