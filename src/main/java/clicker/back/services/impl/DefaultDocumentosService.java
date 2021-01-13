package clicker.back.services.impl;

import clicker.back.Antiguo.Documentos;
import clicker.back.repositories.DocumentosRepository;
import clicker.back.services.DocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultDocumentosService implements DocumentosService {
    @Autowired
    DocumentosRepository documentosRepository;


    @Override
    public Documentos save(Documentos documentos) {
        return documentosRepository.save(documentos);
    }

    @Override
    public void delete(Documentos documentos) {
        documentosRepository.delete(documentos);
    }

    @Override
    public Documentos getById(Documentos documentos) {
        return documentosRepository.findById(documentos.getDocumentname()).orElse(null);
    }

    @Override
    public List<Documentos> getAll() {
        return (List<Documentos>) documentosRepository.findAll();
    }
}
