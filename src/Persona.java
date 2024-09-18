public class Persona {


    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio

    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con argumentos
    public Persona(String nombre, String tel, String email) {
        this(); //Se llama el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id= id ;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getEmail(String email){
        return this.email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel){
        this.tel=tel;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
