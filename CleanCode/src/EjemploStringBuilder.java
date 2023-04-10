public class EjemploStringBuilder {
    public static void main(String[] args) {
        System.out.println(" hola " + "de " + " concatenacion");
        //Según las reglas de buenas prácticas
        //en vez de +, crear un StringBuilder

        //1) crear un objeto StringBuilder

        StringBuilder sb = new StringBuilder("Ejemplo ");
        // si ahora quiero encadenarle algo utilizo el metodo append.
        sb.append(devolverCalzado());
        sb.append("StringBuilder");
        System.out.println(sb);
    }
    public static

    String devolverCalzado(){

        return "hola javier";
    }
}
