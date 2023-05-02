package Practica7;

import java.util.ArrayList;
import java.util.List;

public class daw1 {
    private List<daw1> listaAlumnos;

    public daw1() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public void exportarXML(String nombreArchivo) {
        // código para exportar el archivo XML con la información de las intervenciones de cada alumno
    }

    public void importarXML(String nombreArchivo) {
        // código para importar el archivo XML con la información de las intervenciones de cada alumno
    }

    public void reiniciarIntervenciones() {
        for (Alumno alumno : listaAlumnos) {
            alumno.setNumIntervenciones(0);
        }
    }

    public daw1 seleccionarAlumno() {
        int numIntervencionesMin = Integer.MAX_VALUE;
        List<Alumno> alumnosMinIntervenciones = new ArrayList<>();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNumIntervenciones() < numIntervencionesMin) {
                numIntervencionesMin = alumno.getNumIntervenciones();
                alumnosMinIntervenciones.clear();
                alumnosMinIntervenciones.add(alumno);
            } else if (alumno.getNumIntervenciones() == numIntervencionesMin) {
                alumnosMinIntervenciones.add(alumno);
            }
        }
        int indiceSeleccionado = (int) (Math.random() * alumnosMinIntervenciones.size());
        Alumno seleccionado = alumnosMinIntervenciones.get(indiceSeleccionado);
        seleccionado.setNumIntervenciones(seleccionado.getNumIntervenciones() + 1);
        return seleccionado;
    }
}

