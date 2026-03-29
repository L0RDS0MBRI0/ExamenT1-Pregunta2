package service;

import model.Curso;
import model.Estudiante;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.HistorialRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MatriculaServiceTest {

    @Mock
    HistorialRepository historialRepository;

    @InjectMocks
    MatriculaService matriculaService;

    @Test
    void noDebeMatricularSiNoTienePrerequisitos() {

        Estudiante est = new Estudiante("Juan");
        Curso curso = new Curso("Programación Avanzada");

        when(historialRepository.cumplePrerequisitos(est, curso))
                .thenReturn(false);

        boolean resultado = matriculaService.puedeMatricular(est, curso);

        assertFalse(resultado);
    }

    @Test
    void alumnoNuevoNoDebeExceder12Creditos() {

        Estudiante est = new Estudiante("Ana", true); // nuevo
        Curso curso = new Curso("Matemática", 5);

        when(historialRepository.creditosActuales(est))
                .thenReturn(10);

        boolean resultado = matriculaService.puedeAgregarCurso(est, curso);

        assertTrue(resultado);
    }

}