

//@author Arturo Hernandez Jimenez
public class empleado 
{
    String nombreempleado; 
    String apellidoempleado;
    double salariomensual;

    public empleado(String nombreempleado, String apellidoempleado, double salariomensual)
    {
        this.nombreempleado=nombreempleado;
        this.apellidoempleado=apellidoempleado;
        this.salariomensual=salariomensual;    
    }
    public String getNombreempleado() {
        return this.nombreempleado;
    }

    public void setNombreempleado(String nombreempleado) {
        this.nombreempleado = nombreempleado;
    }

    public String getApellidoempleado() {
        return apellidoempleado;
    }

    public void setApellidoempleado(String apellidoempleado) {
        this.apellidoempleado = apellidoempleado;
    }

    public void Salariomensual(double salariomensual) 
    {
        if(salariomensual<0)
        {
            this.salariomensual=0.0;
        }
        else
        {
                System.out.println("Su salario mensual de "+getNombreempleado()+" es de "+ salariomensual);
        }
    }

    public double getSalariomensual() {
        return salariomensual;
    }

    public void setSalariomensual(double salariomensual) {
        this.salariomensual = salariomensual;
    } 
}
