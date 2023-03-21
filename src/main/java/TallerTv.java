public class TallerTv {
    private String modelo;
   private String dueño;
    private  String date;
    private String damage;
    private String recibe;
    private String dañoOriginal;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getDañoOriginal() {
        return dañoOriginal;
    }

    public void setDañoOriginal(String dañoOriginal) {
        this.dañoOriginal = dañoOriginal;
    }


    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public TallerTv (){

    }

    public void mostrarDatos(){
        System.out.println("modelo:"+getModelo());
        System.out.println("dueño:"+getDueño());
        System.out.println("date:"+getDate());
        System.out.println("damage:"+getDamage());
        System.out.println("recibe:"+getRecibe());

    }
    public void MostrarDatos(){
        System.out.println("dañoOriginal:"+getDañoOriginal());
        System.out.println("recibe:"+getRecibe());
    }



}
