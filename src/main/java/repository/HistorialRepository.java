package repository;

import model.Curso;
import model.Estudiante;

public interface HistorialRepository {

    boolean cumplePrerequisitos(Estudiante est, Curso curso);

    int creditosActuales(Estudiante est);
}