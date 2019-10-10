package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class usoEmpleados {


    public static void main(String[] args) {
        
        
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Creacion de objetos de tipo empleado
        
        Empleados Empleado1=new jefeEmpleado();
        Empleados Empleado2=new secretarioEmpleado();
        Empleados Empleado3=new directorEmpleado();
        
        System.out.println(Empleado1.getTareas());
        System.out.println(Empleado2.getTareas());
        System.out.println(Empleado3.getTareas());
               
        //uso de lso objetos creados
        Empleados Israel=contexto.getBean("secretarioEmpleado",Empleados.class);
        System.out.println(Israel.getTareas());
        System.out.println(Israel.getInformes());

       
        
        
        Empleados Maria=contexto.getBean("directorEmpleado",Empleados.class);
        System.out.println("Tareas del director: "+Maria.getTareas());
        System.out.println("Informes del director: "+Maria.getInformes());
        System.out.println("El correo es: "+Israel.getEmail());
        System.out.println("El nombre de la empresa es: "+Israel.getNombreEmpresa());
        
        contexto.close();
        
        
    }
    
}
