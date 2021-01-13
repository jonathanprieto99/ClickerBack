package clicker.back.services;

import clicker.back.entities.VentaSemiNuevo;

import java.util.List;

public interface VentaSemiNuevoService {


    VentaSemiNuevo save(VentaSemiNuevo ventaSemiNuevo);

    void delete(VentaSemiNuevo ventaSemiNuevo);

    VentaSemiNuevo getById(VentaSemiNuevo ventaSemiNuevo);

    List<VentaSemiNuevo> getAll();

}
