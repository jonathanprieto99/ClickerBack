package clicker.back.services;

import clicker.back.Antiguo.TiempoCompra;

import java.util.List;

public interface TiempoCompraService {

    TiempoCompra save(TiempoCompra tiempoCompra);

    void delete(TiempoCompra tiempoCompra);

    TiempoCompra getById(TiempoCompra tiempoCompra);

    List<TiempoCompra> getAll();
}
