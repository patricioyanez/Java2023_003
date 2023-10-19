import java.util.ArrayList;

public class Empresa {
    //ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado empleado)
    {
        // verificar que no se repita el rut
        return empleados.add(empleado);
    }
    public boolean buscarEmpleado(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut))
                return true;
        }
        return false;
    }
    public void listarEmpleado()
    {
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado.imprimir());
        }
    }
    public boolean eliminarEmpleado(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut))
                return empleados.remove(empleado);
        }
        return false;
    }
    
    // listar los empleados filtrando por puesto
    
    public void filtarEmpleadosPorPuesto(int codigoPuesto)
    {
        for(Empleado empleado: empleados)
        {
            if(empleado.getPuesto().getCodigo()== codigoPuesto)
                System.out.println(empleado.imprimir());
        }
    }
}
