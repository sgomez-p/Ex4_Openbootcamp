public class numeroIf {


    public static void main(String[] args)
    {
         int numeroIf = -23;

         if (numeroIf > 0)
         {
             System.out.println("El numero es positivo");
         }
         else if (numeroIf < 0)
         {
             System.out.println("El numero es negativo");
         }
         else {
             System.out.println("El numero es cero");
         }
         int numeroWhile = 0;
         while (numeroWhile < 3)
         {
             System.out.println(numeroWhile);
             numeroWhile++;
         }
         int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 1);
        int numeroFor = 0;
        for (int i = 0; i < 3; i++)
        {
            numeroFor++;
            System.out.println("El valor de numeroFor es: " + numeroFor);
        }

        var estacion = "Primavera";
        switch (estacion)
        {
            case "Primavera":
                System.out.println("La estacion es primavera");
                break;
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("La estacion no existe");
        }

    }
}
