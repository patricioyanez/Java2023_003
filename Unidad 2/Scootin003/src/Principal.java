
public class Principal {
    public static void main(String[] args) {
        Puesto p1 = new Puesto(1, "Gerente");
        Puesto p2 = new Puesto(2, "Ejecutivo");
        
        Empleado e1 = new Empleado("1-9", "Jhon", "M", 10, 50, p1);
        Empleado e2 = new Empleado("2-7", "Jaztine", "F", 3, 40, p2);
        Empleado e3 = new Empleado("3-5", "Thalia", "F", 3, 40, p2);
        Empleado e4 = new Empleado("4-3", "Ana", "F", 3, 40, p2);
        
        Empresa scootin = new Empresa();
        scootin.agregar(e1);
        scootin.agregar(e2);
        scootin.agregar(e3);
        scootin.agregar(e4);
        
        boolean existe = scootin.buscarEmpleado("1-9");
        if(existe)
            System.out.println("El empleado ya existe");
        else
            System.out.println("El rut no fue encontrado");
        
        System.out.println("\n**** Listado de empleados *****");
        scootin.listarEmpleado();
        
        if(scootin.eliminarEmpleado("1-9"))
            System.out.println("Empleado Eliminado");
        else
            System.out.println("Rut no fue eliminado");
        
        System.out.println("\n**** Listado de empleados *****");
        scootin.listarEmpleado();
        
        
        System.out.println("\n**** Listado de Ejecutivos *****");
        scootin.filtarEmpleadosPorPuesto(2);
        
        // crear un menu con la opciones:
        // ingresar empleado, buscar si existe, 
        // listar todo, listar por puesto (seleccionar), 
        // eliminar por rut y salir

    }
}
