public class Persona {
    //atributos
  private int docuemento;
  private    String nombre;
  private String  apellido;
  //metodo para consular el nombre
    public String cualEsTuNombre(){

        return nombre;
    }
    //metodo para cambiar el nombre
    public void NuevoNombre(String NuevoNombre){
        do
        {
            nombre=NuevoNombre;
        }while (NuevoNombre.isEmpty());
    }
}
