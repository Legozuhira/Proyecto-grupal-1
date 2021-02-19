package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            String user, pass, changePass = "admin";
            int j = 0, option = 0, articulo = 0;
            boolean salir = false, artCheck = false;
            User profile = new User();
            String articulos[] = {"Celular", "Televisor", "Zapatillas"};
            Date fecha = new Date();
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");


            for(int i = 0; i < 3; i++){

                System.out.println("introduzca su usuario:");
                user = sc.nextLine();
                System.out.println("introduzca su contraseña(sugerencia admin):");
                pass = sc.nextLine();

                if(pass.equals(changePass) && user.equals(user)){

                    while(!salir){
                        System.out.println("Bienvenido " + user);
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
                                        System.out.println("Por seguridad, escriba su contraseña actual:");
                                        pass = sc.next();
                                        if(pass.equals(changePass)){
                                            System.out.println("Escbriba su nueva contraseña:");
                                            changePass = sc.next();
                                            break;
                                        }else{
                                            System.out.println("contraseña incorrecta");
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("Bienvenido a su perfil, porfavor rellene todos los campos en orden:");
                                    System.out.println(" ");
                                    System.out.println("Nombre completo:");
                                    sc.nextLine();
                                    profile.name = sc.nextLine();
                                    System.out.println(" ");

                                    System.out.println("Dirección:");
                                    profile.direction = sc.nextLine();
                                    System.out.println(" ");


                                    System.out.println("Número de telefono:");
                                    profile.phoneNum = sc.next();
                                    System.out.println(" ");

                                    System.out.println("Cédula:");
                                    profile.ID = sc.next();
                                    System.out.println(" ");

                                    System.out.println("Nacionalidad");
                                    profile.country = sc.next();
                                    System.out.println(" ");

                                    System.out.println("Perfil rellenado correctamente");
                                    break;

                                case 3:
                                    while(!artCheck){
                                        System.out.println("Escriba el número del articulo que desea pedir: ");
                                        System.out.println(" ");
                                        System.out.println("0. Celular");
                                        System.out.println("1. Televisor");
                                        System.out.println("2. Zapatillas");

                                        articulo = sc.nextInt();
                                        if(articulo >= 0 && articulo <=2){
                                            artCheck = true;
                                        }else{
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
                    break;
                }else{
                    System.out.println("contraseña o usuario incorrecto, intentelo otra vez");
                    j++;
                }

            }

            if(j == 3){
                System.out.println("limite de intentos exedidos, vuelva a iniciar el programa");
            }

            System.out.println(profile.name+" Su orden de "+ articulos[articulo]+" fue completada con éxito, a la hora "+timeFormat.format(fecha) +" - La misma será enviada a su domicilio en: " +profile.direction);
    }
}
