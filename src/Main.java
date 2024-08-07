import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //punto 1, mayor,menor
        int A;
        int B;
        int C;

        System.out.println("Ingrese el valor de A");
        Scanner scannerA=new Scanner(System.in);
        A=scannerA.nextInt();

        System.out.println("Ingrese el valor de B");
        Scanner scannerB=new Scanner(System.in);
        B=scannerB.nextInt();

        System.out.println("Ingrese el valor de C");
        Scanner scannerC=new Scanner(System.in);
        C=scannerC.nextInt();

        if(A==B && B==C){
            System.out.println("Los valores no pueden ser iguales");

           /* System.out.println("Ingrese el valor de A");
            Scanner scannerA=new Scanner(System.in);
            A=scannerA.nextInt();

            System.out.println("Ingrese el valor de B");
            Scanner scannerB=new Scanner(System.in);
            B=scannerB.nextInt();

            System.out.println("Ingrese el valor de C");
            Scanner scannerC=new Scanner(System.in);
            C=scannerC.nextInt();*/

        } if(A>B && A>C){
            System.out.println("El mayor es A que tiene un valor de:"+A);
            if(B>C){
                System.out.println("El menor es C que tiene un valor de:"+C);
            }else{
                System.out.println("El menor es B que tiene un valor de:"+B);
            }
        }else if(B>A && B>C){
            System.out.println("El mayor es B que tiene un valor de:"+B);
            if(C>A){
                System.out.println("El menor es A que tiene un valor de:"+A);
            }else{
                System.out.println("El menor es C que tiene un valor de:"+C);
            }
        }else if(C>A && C>B){
            System.out.println("El mayor es C que tiene un valor de:"+C);
            if(A>B){
                System.out.println("El menor es B que tiene un valor de:"+B);
            }else{
                System.out.println("El menor es A que tiene un valor de:"+A);
            }
        }








        //Calificación númerica puntos 2

      /*  int nota;
        System.out.println("Ingrese la nota");

        Scanner scannerGaby=new Scanner(System.in);

        nota=scannerGaby.nextInt();

        //System.out.println(nota);
        switch(nota){
            case 1:
                System.out.println("Su calificación es:F");
                break;
            case 2:
                System.out.println("Su calificación es:F");
                break;
            case 3:
                System.out.println("Su calificación es: D");
                break;
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
                System.out.println("Su calificación es: C");
                break;
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
                System.out.println("Su calificación es: B");
                break;
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
                System.out.println("Su calificación es: A");
                break;
            case 10:
                System.out.println("Su calificación es: A");
                break;

            default:
                System.out.println("Número no válido, por favor verifique");

        }*/

    }
}