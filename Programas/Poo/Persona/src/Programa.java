public class Programa {
    public static void main(String[] args) {
        Persona a;//a es una variable del tipo (Objeto)Persona y se llama variable referencias
        Persona b;
       a= new Persona ();//crea una instancia de la persona
       b= new Persona ();
      /*
       a.docuemento=111;
       a.nombre="Elias";*/
       a.NuevoNombre("Adrian");

        b.NuevoNombre("Emanuel");
        System.out.println(a.cualEsTuNombre());


    }
}
