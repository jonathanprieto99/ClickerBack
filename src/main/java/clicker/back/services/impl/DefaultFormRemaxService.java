package clicker.back.services.impl;

import clicker.back.entities.FormRemax;
import clicker.back.repositories.FormRemaxRepository;
import clicker.back.services.FormRemaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultFormRemaxService implements FormRemaxService {
    @Autowired
    FormRemaxRepository formRemaxRepository;


    @Override
    public FormRemax save(FormRemax formRemax) {
        return formRemaxRepository.save(formRemax);
    }

    @Override
    public void delete(FormRemax formRemax) {
        formRemaxRepository.delete(formRemax);
    }

    @Override
    public FormRemax getById(FormRemax formRemax) {
        return formRemaxRepository.findById(formRemax.getId()).orElse(null);
    }

    @Override
    public List<FormRemax> getAll() {
        return (List<FormRemax>) formRemaxRepository.findAll();
    }
}
