package Contador;

import java.util.Scanner;

public class Contador 
{
    public static int contador1(int x, int y) 
    {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int c = 0;
        if (x > 0 && y > 0) 
        {
            System.out.println("Escribe un número");
            num = entrada.nextInt();
            if (num >= x && num <= y)    
            {
                System.out.println("Número en rango");
                c++;
            } 
            else
                System.out.println("Número fuera de rango");
        }
        else 
            c = -1;
        entrada.close();
        return c;
    }
}
