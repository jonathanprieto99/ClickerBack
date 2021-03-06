package clicker.back.services;

import clicker.back.entities.FormRemax;

import java.util.List;

public interface FormRemaxService {

    FormRemax save(FormRemax formRemax);

    void delete(FormRemax formRemax);

    FormRemax getById(Long id);

    List<FormRemax> getAll();
}
