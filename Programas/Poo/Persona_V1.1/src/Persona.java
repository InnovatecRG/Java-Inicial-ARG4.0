
public class Persona {
    //Atributos
    private String Nombre;
    private String Apellido;
    private int Documento;
    private String Domicilio;
public Persona (){
    this.Nombre=this.Apellido=this.Domicilio="";
    this.Documento=0;
}

    public Persona(int doc,String nom,String ape,String dom){
        this.Nombre=nom;
        this.Apellido=ape;
        this.Documento=doc;
        this.Domicilio=dom;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    //metodo para registrar una persona
    public void RegistrarPersona(int i){


        Nombre=setNombre();
    }













}
