public class Main {

            public static void main(String[] args) {

                    int numero = -5;
                    if (numero > 0) {
                        System.out.println("Es un número positivo");
                    } else if (numero == 0) {
                        System.out.println("Es un cero");
                    } else {
                        System.out.println("Es un número negativo");
                    }


                    int numeroWhile = 4;
                    while (numeroWhile < 3) {
                        System.out.println(numeroWhile);
                        numeroWhile++;
                    }


                    int contador = 4;
                    do {
                        System.out.println(contador);
                        contador--;
                    } while (contador > 4);


                    var numeroFor = 0;
                    for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
                        System.out.println(numeroFor);
                    }

                    var estacion = "Otoño";
                    switch (estacion) {
                        case "Otoño":
                            System.out.println("Estamos en otoño");
                        case "Primavera":
                            System.out.println("Estamos en primavera");
                        case "Invierno":
                            System.out.println("Estamos en invierno");
                        case "Verano":
                            System.out.println("Estamos en verano");
                        default:
                            System.out.println("Esta no es una época del año");
                    }
            }
}
