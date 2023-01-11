public class Main {
 
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nombre = "Maria";
    cliente.edad = 30;
    cliente.telefono = 9283645;
    cliente.credito = 1919191;

    System.out.println(cliente.nombre);
    System.out.println(cliente.edad);
    System.out.println(cliente.telefono);
    System.out.println(cliente.credito);

    Trabajador trabajador = new Trabajador();
    trabajador.nombre = "Jesus";
    trabajador.edad = 24;
    trabajador.telefono = 7383635;
    trabajador.salario = 500;

    System.out.println(trabajador.nombre);
    System.out.println(trabajador.edad);
    System.out.println(trabajador.telefono);
    System.out.println(trabajador.salario);
  }
}

class Persona{
  int edad;
  String nombre;
  int telefono;
}

class Cliente extends Persona {
  int credito;
}

class Trabajador extends Persona {
  int salario;
}