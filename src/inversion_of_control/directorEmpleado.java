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
    
    @Override
    public String getEmail() {
        return "este es el email: ";
    }
    @Override
    public String getNombreEmpresa() {
        return "Nombre de la empresa";
    }     
}
