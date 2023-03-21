public class TestTv {
    public static void main(String[] args) {
        TallerTv Tv = new TallerTv();
        System.out.println("Recibimiento de equipo a Arreglar");

        Tv.setDate("23/03/23");
        Tv.setDueño("Ricardo");
        Tv.setModelo("SamsungTv 22ZM");
        Tv.setDamage("No enciende");
        Tv.setRecibe("Juan Lopez");
        Tv.mostrarDatos();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("ENTREGA DE EQUIPO ARREGLADO");

        TallerTv T2 = new TallerTv();

        T2.setModelo("SamsungTv 22ZM");
        T2.setRecibe("Ricardo");
        T2.setDañoOriginal("Corto circuito por corriente externa");
        System.out.println("Gracias por su confianza");
        T2.MostrarDatos();








    }
}
