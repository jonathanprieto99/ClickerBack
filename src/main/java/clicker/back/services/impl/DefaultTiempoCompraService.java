package clicker.back.services.impl;

import clicker.back.entities.TiempoCompra;
import clicker.back.repositories.TiempoCompraRepository;
import clicker.back.services.TiempoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTiempoCompraService implements TiempoCompraService{

    @Autowired
    TiempoCompraRepository tiempoCompraRepository;


    @Override
    public TiempoCompra save(TiempoCompra tiempoCompra) {
        return tiempoCompraRepository.save(tiempoCompra);
    }

    @Override
    public void delete(TiempoCompra tiempoCompra) {
        tiempoCompraRepository.delete(tiempoCompra);
    }

    @Override
    public TiempoCompra getById(TiempoCompra tiempoCompra) {
        return tiempoCompraRepository.findById(tiempoCompra.getIdTiempocompra()).orElse(null);
    }

    @Override
    public List<TiempoCompra> getAll() {
        return (List<TiempoCompra>) tiempoCompraRepository.findAll();
    }
}