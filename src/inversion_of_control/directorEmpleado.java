package inversion_of_control;

public class directorEmpleado implements Empleados {

    @Override
    public String getTareas() {
        return "Gestiona la plantilla de la empresa";
    }

    @Override
    public String getInformes() {
        return null;
    }
    
}
