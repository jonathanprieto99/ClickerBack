package clicker.back.services;

import clicker.back.entities.Registrodecambio;
import clicker.back.entities.ResultadosInfocorp;

import java.util.List;

public interface ResultadosInfocorpService {

    ResultadosInfocorp save(ResultadosInfocorp resultadosInfocorp);

    void delete(ResultadosInfocorp resultadosInfocorp);

    ResultadosInfocorp getById(ResultadosInfocorp resultadosInfocorp);

    List<ResultadosInfocorp> getAll();

}