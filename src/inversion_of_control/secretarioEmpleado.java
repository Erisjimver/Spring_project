package inversion_of_control;


public class secretarioEmpleado implements Empleados {
    //creacion de campo tipo CreacionInformes(interfaz)
    private CreacionInformes informeNuevo;
    private String email, nombreEmpresa;
    
    //creacion de constructor que inyecta la dependencia
    public void setInformeNuevo(CreacionInformes informeNuevo){
        this.informeNuevo = informeNuevo;
    }
    //setters and getters email y nombre empresa
    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    //terminan lso setters and getters    

    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInformes() {
        return "informe creado por la secretaria: " +informeNuevo.getInformes();
    }
    
}