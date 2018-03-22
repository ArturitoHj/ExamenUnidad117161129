
//@author Arturo Hernandez Jimenez
public class pruebaempleado 
{
    public static void main(String[] args) 
    {
        //*****************************************Primer empleado*******************
        empleado empleado1=new empleado("Artemio","Perez",5000);
        empleado1.setNombreempleado("Arturo");
        empleado1.setApellidoempleado("Hernandez");
        System.out.println("Empleado: "+empleado1.getNombreempleado()+" "+empleado1.getApellidoempleado());
        empleado1.setSalariomensual(2500);
        if(empleado1.getSalariomensual()<0)
        {
            empleado1.setSalariomensual(0.0);
             System.out.println("Su salario mensual de "+ empleado1.getNombreempleado()+" es de "+empleado1.getSalariomensual());
        }
        else
        {
            System.out.println("Su salario mensual de "+ empleado1.getNombreempleado()+" es de "+empleado1.getSalariomensual());
            System.out.println("Su salario anual de "+ empleado1.getNombreempleado()+" es de "+empleado1.getSalariomensual()*12+"\n");
        }
        
        
        //*****************************************Segundo empleado*******************
        
        empleado empleado2=new empleado("Artemio","Perez",8.0);
        empleado2.setNombreempleado("Josue");
        empleado2.setApellidoempleado("Maldonado");
        System.out.println("Empleado: "+empleado2.getNombreempleado()+" "+empleado2.getApellidoempleado());
        if(empleado2.getSalariomensual()<0)
        {
            empleado2.setSalariomensual(0.0);
             System.out.println("Su salario mensual de "+ empleado2.getNombreempleado()+" es de "+empleado2.getSalariomensual());
        }
        else
        {
            System.out.println("Su salario mensual de "+ empleado2.getNombreempleado()+" es de "+empleado2.getSalariomensual());
            System.out.println("Su salario anual de "+ empleado2.getNombreempleado()+" es de "+empleado2.getSalariomensual()*12+"\n");
        }
        
        //***********************************Tercer empleado*******************
        
        empleado empleado3=new empleado("Artemio","Perez",-2500);
        System.out.println("Empleado: "+empleado3.getNombreempleado()+" "+empleado3.getApellidoempleado());
        if(empleado3.getSalariomensual()<0)
        {
            empleado3.setSalariomensual(0.0);
             System.out.println("Su salario mensual de "+ empleado3.getNombreempleado()+" es de "+empleado3.getSalariomensual());
        }
        else
        {
            System.out.println("Su salario mensual de "+ empleado3.getNombreempleado()+" es de "+empleado3.getSalariomensual());
        }
    }
}
