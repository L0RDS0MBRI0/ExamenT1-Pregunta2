package service;

import model.Curso;
import model.Estudiante;
import repository.HistorialRepository;

public class MatriculaService {

    private HistorialRepository historialRepository;

    public boolean puedeMatricular(Estudiante est, Curso curso) {
        return historialRepository.cumplePrerequisitos(est, curso);
    }

    public boolean puedeAgregarCurso(Estudiante est, Curso curso) {

        int actuales = historialRepository.creditosActuales(est);

        int limite = est.esNuevo() ? 12 : 20;

        return (actuales + curso.getCreditos()) <= limite;
    }
}