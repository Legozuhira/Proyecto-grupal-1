package com.company;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Object escoger;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String prueba;
        USUARIO usuario1 = new USUARIO("");
        Pedido pedido1 = new Pedido("");
        int j = 0, option = 0;
        boolean salir = false, artCheck = false;


usuario1.setContraseña("admin");
        for(int i = 0; i < 3; i++){
            System.out.println("Escriba el usuario");
            usuario1.setNombre(sc.nextLine());
            System.out.println("Escriba la contraseña (si es primera vez pruebe admin)");
            prueba = sc.nextLine();
            if(prueba.equals(usuario1.getContraseña())){

            while(!salir){
                System.out.println("Bienvenido " + usuario1.getNombre());
                System.out.println(" ");
                System.out.println("Escriba el número para elejir una de las siguientes opciones: ");
                System.out.println("1. Cambio de contraseña");
                System.out.println("2. Rellenar la información de perfil");
                System.out.println("3. Pedidos");
                System.out.println("4. Salir");

                try{
                    option = sc.nextInt();

                    switch(option){
                        case 1:
                            for(int k = 0; k < 3; k++){
                                sc.next();
                                System.out.println("Por seguridad, escriba su contraseña actual:");
                                prueba = sc.nextLine();
                                if(prueba.equals(usuario1.getContraseña())){
                                    System.out.println("Escriba su nueva contraseña:");
                                    usuario1.setContraseña(sc.nextLine());
                                    break;
                                }else{
                                    System.out.println("contraseña incorrecta");
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Bienvenido a su perfil, porfavor rellene todos los campos en orden:");
                            sc.nextLine();
                            System.out.println("Dirección:");
                            usuario1.setDireccion(sc.nextLine());
                            System.out.println(" ");


                            System.out.println("Número de telefono:");
                            usuario1.setCelular(sc.nextLine());
                            System.out.println(" ");

                            System.out.println("Cédula:");
                            usuario1.setDNI(sc.nextLine());
                            System.out.println(" ");

                            System.out.println("Nacionalidad");
                            usuario1.setNacionalidad(sc.nextLine());
                            System.out.println(" ");

                            System.out.println("Perfil rellenado correctamente\n");
                            break;

                        case 3:
                            while(!artCheck){
                                System.out.println("Escriba el número del articulo que desea pedir: ");
                                System.out.println(" ");
                                System.out.println("0. Celular");
                                System.out.println("1. Televisor");
                                System.out.println("2. Zapatillas");
                                pedido1.escoger(sc.nextByte());
                                if(pedido1.getEscoger() >= 0 && pedido1.getEscoger() <=2){
                                    artCheck = true;
                                }else {
                                    System.out.println("Porfavor solo introduzca un número entre 0 y 2");
                                }
                            }
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            System.out.println("Porfavor escribir un número entre el 1 y el 4");
                    }
                }catch(InputMismatchException e){
                    System.out.println("introducir solo números");
                    sc.next();
                }

            }
            break;}
            else{
                System.out.println("contraseña o usuario incorrecto, intentelo otra vez");
                j++;
            }

        }

        if(j == 3){
            System.out.println("limite de intentos exedidos, vuelva a iniciar el programa");
        }

        System.out.println("Estimado "+usuario1.getNombre() + " Su orden #"+ pedido1.getCodigo_de_pedido() +" fue completada con éxito con un precio total de " + pedido1.getPrecio() + " A la hora " + LocalTime.now() + " La misma sera enviada a su domicilio en " + usuario1.getDireccion());

    }
}
