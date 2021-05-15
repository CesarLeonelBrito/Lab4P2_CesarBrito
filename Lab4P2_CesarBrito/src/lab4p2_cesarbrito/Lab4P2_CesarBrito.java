package lab4p2_cesarbrito;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_CesarBrito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList();
        ArrayList<Proyecto> proyectos = new ArrayList();
        System.out.print("Ingrese el usuario: ");
        String usernameInput = sc.next();
        System.out.print("Ingrese el contraseña: ");
        String passwordInput = sc.next();
        while (!usernameInput.equals("admin") || !passwordInput.equals("1234")) {
            System.out.println("======= USUARIO INCORRECTO =======");
            System.out.print("Ingrese el usuario: ");
            usernameInput = sc.next();
            System.out.print("Ingrese el contraseña: ");
            passwordInput = sc.next();
        }
        if (usernameInput.equals("admin") && passwordInput.equals("1234")) {
            System.out.println("======= USUARIO CORRECTO =======");
            int opcion = 14;
            while (opcion != 13) {
                System.out.println("************MENU************");
                System.out.println("1. Agregar empleado normal");
                System.out.println("2. Agregar desarrollador");
                System.out.println("3. Agregar director");
                System.out.println("4. Agregar consultor");
                System.out.println("5. Agregar proyecto");
                System.out.println("****************************");
                System.out.println("6. Listar empleados");
                System.out.println("7. Listar proyectos");
                System.out.println("****************************");
                System.out.println("8. Eliminar empleado");
                System.out.println("9. Eliminar proyecto");
                System.out.println("****************************");
                System.out.println("10. Modificar empleado");
                System.out.println("11. Modificar proyecto");
                System.out.println("****************************");
                System.out.println("12. Log In de empleados");
                System.out.println("13. Salir");
                System.out.println("****************************");
                System.out.print("Ingrese su opcion: ");
                opcion = sc.nextInt();
                System.out.println("");
                if (opcion == 1) {
                    try {
                        System.out.print("Ingrese su usuario: ");
                        String username = sc.next();
                        System.out.print("Ingrese su contraseña: ");
                        String password = sc.next();
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese su apellido: ");
                        String apellido = sc.next();
                        System.out.print("Ingrese su ID: ");
                        String id = sc.next();
                        System.out.print("Ingrese su nacionalidad: ");
                        String nacionalidad = sc.next();
                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                        int proyectoRealizados = sc.nextInt();
                        System.out.print("Ingrese su años de contrato: ");
                        int yearsContrato = sc.nextInt();
                        empleados.add(new Empleado(username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                    } catch (Exception e) {
                        System.out.println("OCURRIO UN ERROR EN EL SISTEMA");

                    }
                } else if (opcion == 2) {
                    try {
                        System.out.print("Ingrese su usuario: ");
                        String username = sc.next();
                        System.out.print("Ingrese su contraseña: ");
                        String password = sc.next();
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese su apellido: ");
                        String apellido = sc.next();
                        System.out.print("Ingrese su ID: ");
                        String id = sc.next();
                        System.out.print("Ingrese su nacionalidad: ");
                        String nacionalidad = sc.next();
                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                        int proyectoRealizados = sc.nextInt();
                        System.out.print("Ingrese su años de contrato: ");
                        int yearsContrato = sc.nextInt();
                        double sueldo = 0;
                        System.out.print("Ingrese su años de experienda tiene: ");
                        int yearsExperiencia = sc.nextInt();
                        System.out.print("Ingrese cuantas horas trabaja al dia: ");
                        int horasTrabajadas = sc.nextInt();
                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                        int proyectosAsignado = sc.nextInt();
                        System.out.print("Ingrese su lenguaje preferido: ");
                        String lenguajePreferido = sc.next();
                        empleados.add(new Desarrolladores(yearsExperiencia, horasTrabajadas, proyectosAsignado, sueldo, lenguajePreferido, username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                    } catch (Exception e) {
                        System.out.println("OCURRIO UN ERROR EN EL SISTEMA");

                    }
                } else if (opcion == 3) {
                    try {
                        System.out.print("Ingrese su usuario: ");
                        String username = sc.next();
                        System.out.print("Ingrese su contraseña: ");
                        String password = sc.next();
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese su apellido: ");
                        String apellido = sc.next();
                        System.out.print("Ingrese su ID: ");
                        String id = sc.next();
                        System.out.print("Ingrese su nacionalidad: ");
                        String nacionalidad = sc.next();
                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                        int proyectoRealizados = sc.nextInt();
                        System.out.print("Ingrese su años de contrato: ");
                        int yearsContrato = sc.nextInt();
                        System.out.print("Ingrese su años en el puesto: ");
                        int yearsEnPuesto = sc.nextInt();
                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                        int proyectosAsignado = sc.nextInt();
                        double sueldo = 0;
                        empleados.add(new Directores(yearsEnPuesto, proyectosAsignado, sueldo, username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                    } catch (Exception e) {
                        System.out.println("OCURRIO UN ERROR EN EL SISTEMA");

                    }
                } else if (opcion == 4) {
                    try {
                        System.out.print("Ingrese su usuario: ");
                        String username = sc.next();
                        System.out.print("Ingrese su contraseña: ");
                        String password = sc.next();
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.next();
                        System.out.print("Ingrese su apellido: ");
                        String apellido = sc.next();
                        System.out.print("Ingrese su ID: ");
                        String id = sc.next();
                        System.out.print("Ingrese su nacionalidad: ");
                        String nacionalidad = sc.next();
                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                        int proyectoRealizados = sc.nextInt();
                        System.out.print("Ingrese su años de contrato: ");
                        int yearsContrato = sc.nextInt();
                        System.out.print("Ingrese su campo de experiencia: ");
                        String campo = sc.next();
                        System.out.print("Ingrese su tiempo de consultoria: ");
                        int tiempoConsultoria = sc.nextInt();
                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                        int proyectosAsignado = sc.nextInt();
                        System.out.print("Ingrese cuantos consultores tiene: ");
                        int consultores = sc.nextInt();
                        double sueldo = 0;
                        empleados.add(new Consultores(campo, tiempoConsultoria, proyectosAsignado, consultores, sueldo, username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                    } catch (Exception e) {
                        System.out.println("OCURRIO UN ERROR EN EL SISTEMA");

                    }
                } else if (opcion == 5) {
                    try {
                        System.out.print("Ingrese el nombre del proyecto: ");
                        String username = sc.next();
                        System.out.print("Ingrese el nombre de la empresa del proyecto: ");
                        String empresa = sc.next();
                        System.out.print("Ingrese la descripcion: ");
                        String descripcion = sc.next();
                        String estadoActual = "";
                        System.out.print("Ingrese el estado actual(1. Iniciado, 2. Desarrollo, 3. Terminado): ");
                        int p = sc.nextInt();
                        while (p < 1 || p > 3) {
                            System.out.println("*OPCION INVALIDA*");
                            System.out.print("Ingrese el estado actual(1. Iniciado, 2. Desarrollo, 3. Terminado): ");
                            p = sc.nextInt();
                        }
                        if (p == 1) {
                            estadoActual = "Iniciado";
                        } else if (p == 2) {
                            estadoActual = "Desarrollo";
                        } else if (p == 3) {
                            estadoActual = "Terminado";
                        }
                        System.out.print("Ingrese cuantos años tomara el proyecto: ");
                        int years = sc.nextInt();
                        Proyecto pro = new Proyecto(empresa, empresa, descripcion, estadoActual, years);
                        System.out.println("INGRESE DESARROLLADORES");
                        for (int i = 0; i < empleados.size(); i++) {
                            if (empleados.get(i) instanceof Desarrolladores) {
                                System.out.println(empleados.indexOf(empleados.get(i)) + " - " + empleados.get(i));
                            }
                        }
                        int po = 0;
                        while (po != 2) {
                            System.out.println("1. Agregar desarrollador");
                            System.out.println("2. Salir del menu");
                            po = sc.nextInt();
                            if (po == 1) {
                                System.out.println("Ingrese el numero que tiene el lado que desea agregar al usuario");
                                int d = sc.nextInt();
                                pro.getDesarrolladores().add((Desarrolladores) empleados.get(d));
                            }
                        }
                        ///////////////////////////////////////////////////////////////////////////////////////////////
                        System.out.println("INGRESE CONSULTORES");
                        for (int i = 0; i < empleados.size(); i++) {
                            if (empleados.get(i) instanceof Consultores) {
                                System.out.println(empleados.indexOf(empleados.get(i)) + " - " + empleados.get(i));
                            }
                        }
                        po = 0;
                        while (po != 2) {
                            System.out.println("1. Agregar consultor");
                            System.out.println("2. Salir del menu");
                            po = sc.nextInt();
                            if (po == 1) {
                                System.out.println("Ingrese el numero que tiene el lado que desea agregar al usuario");
                                int d = sc.nextInt();
                                pro.getConsultores().add((Consultores) empleados.get(d));
                            }
                        }
                        ///////////////////////////////////////////////////////////////////////////////////////////////
                        System.out.println("INGRESE DIRECTORES");
                        for (int i = 0; i < empleados.size(); i++) {
                            if (empleados.get(i) instanceof Directores) {
                                System.out.println(empleados.indexOf(empleados.get(i)) + " - " + empleados.get(i));
                            }
                        }
                        po = 0;
                        while (po != 2) {
                            System.out.println("1. Agregar consultor");
                            System.out.println("2. Salir del menu");
                            po = sc.nextInt();
                            if (po == 1) {
                                System.out.println("Ingrese el numero que tiene el lado que desea agregar al usuario");
                                int d = sc.nextInt();
                                pro.getDirectores().add((Directores) empleados.get(d));
                            }
                        }
                        proyectos.add(pro);
                        for (int i = 0; i < empleados.size(); i++) {
                            if (empleados.get(i) instanceof Consultores) {
                                ((Consultores) empleados.get(i)).getDesarrolladores().addAll(pro.getDesarrolladores());
                            } else if (empleados.get(i) instanceof Directores) {
                                ((Directores) empleados.get(i)).getDesarrolladoresAsignados().addAll(pro.getDesarrolladores());
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("OCURRIO UN ERROR EN EL SISTEMA");

                    }
                } else if (opcion == 6) {
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println(i + " - " + empleados.get(i));
                    }
                } else if (opcion == 7) {
                    for (int i = 0; i < proyectos.size(); i++) {
                        System.out.println(i + " - " + proyectos.get(i));
                    }
                } else if (opcion == 8) {
                    try {
                        System.out.print("Ingrese la posicion del empleado que desea eliminar: ");
                        int eliminar = sc.nextInt();
                        if (eliminar < empleados.size()) {
                            empleados.remove(eliminar);
                            System.out.println("*SE HA ELIMINADO EXITOSAMENTE*");
                        } else {
                            System.out.println("*EL NUMERO QUE INGRESO NO ESTA DISPONIBLE*");
                        }
                    } catch (Exception e) {
                        System.out.println("*OCURRIO UN ERROR EN EL SISTEMA*");

                    }
                } else if (opcion == 9) {
                    try {
                        System.out.print("Ingrese la posicion del proyecto que desea eliminar: ");
                        int eliminar = sc.nextInt();
                        if (eliminar < proyectos.size()) {
                            proyectos.remove(eliminar);
                            System.out.println("*SE HA ELIMINADO EXITOSAMENTE*");
                        } else {
                            System.out.println("*EL NUMERO QUE INGRESO NO ESTA DISPONIBLE*");
                        }
                    } catch (Exception e) {
                        System.out.println("*OCURRIO UN ERROR EN EL SISTEMA*");

                    }
                } else if (opcion == 10) {
                    try {
                        System.out.print("Ingrese la posicion del empleado que desea modificar: ");
                        int po = sc.nextInt();
                        if (po < empleados.size()) {
                            if (empleados.get(po) instanceof Desarrolladores) {
                                System.out.print("1. Cambiar username\n"
                                        + "2. Cambiar contraseña}n"
                                        + "3. Cambiar nombre\n"
                                        + "4. Cambiar apellido\n"
                                        + "5. Cambiar id\n"
                                        + "6. Cambiar nacionalidad\n"
                                        + "7. Cambiar proyectos realizados\n"
                                        + "8. Cambiar años del contrato\n"
                                        + "9. Cambiar años de experiencia\n"
                                        + "10. Cambiar horas de trabajo\n"
                                        + "11. Cambiar proyectos asignados\n"
                                        + "12. Cambiar lenguaje preferido\n"
                                        + "Ingrese su opcion: ");
                                int option = sc.nextInt();
                                if (option == 1) {
                                    System.out.print("Ingrese su usuario: ");
                                    String username = sc.next();
                                    empleados.get(po).setUsername(username);
                                } else if (option == 2) {
                                    System.out.print("Ingrese su contraseña: ");
                                    String password = sc.next();
                                    empleados.get(po).setPassword(password);
                                } else if (option == 3) {
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = sc.next();
                                    empleados.get(po).setNombre(nombre);
                                } else if (option == 4) {
                                    System.out.print("Ingrese su apellido: ");
                                    String apellido = sc.next();
                                    empleados.get(po).setApellido(apellido);
                                } else if (option == 5) {
                                    System.out.print("Ingrese su ID: ");
                                    String id = sc.next();
                                    empleados.get(po).setId(id);
                                } else if (option == 6) {
                                    System.out.print("Ingrese su nacionalidad: ");
                                    String nacionalidad = sc.next();
                                    empleados.get(po).setNacionalidad(nacionalidad);
                                } else if (option == 7) {
                                    System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                    int proyectoRealizados = sc.nextInt();
                                    empleados.get(po).setProyectosRealizados(proyectoRealizados);
                                } else if (option == 8) {
                                    System.out.print("Ingrese su años de contrato: ");
                                    int yearsContrato = sc.nextInt();
                                    empleados.get(po).setYearsContrato(yearsContrato);
                                } else if (option == 9) {
                                    System.out.print("Ingrese su años de experienda tiene: ");
                                    int yearsExperiencia = sc.nextInt();
                                    ((Desarrolladores) empleados.get(po)).setYearsExperiencia(yearsExperiencia);
                                } else if (option == 10) {
                                    System.out.print("Ingrese cuantas horas trabaja al dia: ");
                                    int horasTrabajadas = sc.nextInt();
                                    ((Desarrolladores) empleados.get(po)).setHorasTrabajdas(horasTrabajadas);
                                } else if (option == 11) {
                                    System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                    int proyectosAsignado = sc.nextInt();
                                    ((Desarrolladores) empleados.get(po)).setProyectosRealizados(proyectosAsignado);
                                } else if (option == 12) {
                                    System.out.print("Ingrese su lenguaje preferido: ");
                                    String lenguajePreferido = sc.next();
                                    ((Desarrolladores) empleados.get(po)).setLenguajePreferido(lenguajePreferido);
                                }
                            } else if (empleados.get(po) instanceof Consultores) {
                                System.out.print("1. Cambiar username\n"
                                        + "2. Cambiar contraseña}n"
                                        + "3. Cambiar nombre\n"
                                        + "4. Cambiar apellido\n"
                                        + "5. Cambiar id\n"
                                        + "6. Cambiar nacionalidad\n"
                                        + "7. Cambiar proyectos realizados\n"
                                        + "8. Cambiar años del contrato\n"
                                        + "9. Cambiar campo\n"
                                        + "10. Cambiar tiempo de consultoria\n"
                                        + "11. Cambiar proyectos asignados\n"
                                        + "12. Cambiar consultores\n"
                                        + "13 Eliminar Desarrollador\n"
                                        + "Ingrese su opcion: ");
                                int option = sc.nextInt();
                                if (option == 1) {
                                    System.out.print("Ingrese su usuario: ");
                                    String username = sc.next();
                                    empleados.get(po).setUsername(username);
                                } else if (option == 2) {
                                    System.out.print("Ingrese su contraseña: ");
                                    String password = sc.next();
                                    empleados.get(po).setPassword(password);
                                } else if (option == 3) {
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = sc.next();
                                    empleados.get(po).setNombre(nombre);
                                } else if (option == 4) {
                                    System.out.print("Ingrese su apellido: ");
                                    String apellido = sc.next();
                                    empleados.get(po).setApellido(apellido);
                                } else if (option == 5) {
                                    System.out.print("Ingrese su ID: ");
                                    String id = sc.next();
                                    empleados.get(po).setId(id);
                                } else if (option == 6) {
                                    System.out.print("Ingrese su nacionalidad: ");
                                    String nacionalidad = sc.next();
                                    empleados.get(po).setNacionalidad(nacionalidad);
                                } else if (option == 7) {
                                    System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                    int proyectoRealizados = sc.nextInt();
                                    empleados.get(po).setProyectosRealizados(proyectoRealizados);
                                } else if (option == 8) {
                                    System.out.print("Ingrese su años de contrato: ");
                                    int yearsContrato = sc.nextInt();
                                    empleados.get(po).setYearsContrato(yearsContrato);
                                } else if (option == 9) {
                                    System.out.print("Ingrese su campo de experiencia: ");
                                    String campo = sc.next();
                                    ((Consultores) empleados.get(po)).setCampo(campo);
                                } else if (option == 10) {
                                    System.out.print("Ingrese su tiempo de consultoria: ");
                                    int tiempoConsultoria = sc.nextInt();
                                    ((Consultores) empleados.get(po)).setTiempoConsultoria(tiempoConsultoria);
                                } else if (option == 11) {
                                    System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                    int proyectosAsignado = sc.nextInt();
                                    ((Consultores) empleados.get(po)).setProyectosAignados(proyectosAsignado);
                                } else if (option == 12) {
                                    System.out.print("Ingrese cuantos consultores tiene: ");
                                    int consultores = sc.nextInt();
                                    ((Consultores) empleados.get(po)).setConsultores(consultores);
                                } else if (option == 13) {
                                    System.out.print("Ingrese la posicion del desarrollador que desea eliminar: ");
                                    int v = sc.nextInt();
                                    if (v < ((Consultores) empleados.get(po)).getDesarrolladores().size()) {
                                        ((Consultores) empleados.get(po)).getDesarrolladores().remove(v);
                                    } else {
                                        System.out.println("*NUMERO NO DISPONIBLE*");
                                    }
                                }
                            } else if (empleados.get(po) instanceof Directores) {
                                System.out.print("1. Cambiar username\n"
                                        + "2. Cambiar contraseña}n"
                                        + "3. Cambiar nombre\n"
                                        + "4. Cambiar apellido\n"
                                        + "5. Cambiar id\n"
                                        + "6. Cambiar nacionalidad\n"
                                        + "7. Cambiar proyectos realizados\n"
                                        + "8. Cambiar años del contrato\n"
                                        + "9. Cambiar años en el puesto\n"
                                        + "10. Cabiar proyectos asignados\n"
                                        + "11. Eliminar un desarrolladorr\n"
                                        + "Ingrese su opcion: ");
                                int option = sc.nextInt();
                                if (option == 1) {
                                    System.out.print("Ingrese su usuario: ");
                                    String username = sc.next();
                                    empleados.get(po).setUsername(username);
                                } else if (option == 2) {
                                    System.out.print("Ingrese su contraseña: ");
                                    String password = sc.next();
                                    empleados.get(po).setPassword(password);
                                } else if (option == 3) {
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = sc.next();
                                    empleados.get(po).setNombre(nombre);
                                } else if (option == 4) {
                                    System.out.print("Ingrese su apellido: ");
                                    String apellido = sc.next();
                                    empleados.get(po).setApellido(apellido);
                                } else if (option == 5) {
                                    System.out.print("Ingrese su ID: ");
                                    String id = sc.next();
                                    empleados.get(po).setId(id);
                                } else if (option == 6) {
                                    System.out.print("Ingrese su nacionalidad: ");
                                    String nacionalidad = sc.next();
                                    empleados.get(po).setNacionalidad(nacionalidad);
                                } else if (option == 7) {
                                    System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                    int proyectoRealizados = sc.nextInt();
                                    empleados.get(po).setProyectosRealizados(proyectoRealizados);
                                } else if (option == 8) {
                                    System.out.print("Ingrese su años de contrato: ");
                                    int yearsContrato = sc.nextInt();
                                    empleados.get(po).setYearsContrato(yearsContrato);
                                } else if (option == 9) {
                                    System.out.print("Ingrese su años en el puesto: ");
                                    int yearsEnPuesto = sc.nextInt();
                                    ((Directores) empleados.get(po)).setYearsEnPuesto(yearsEnPuesto);
                                } else if (option == 10) {
                                    System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                    int proyectosAsignado = sc.nextInt();
                                    ((Directores) empleados.get(po)).setProyectosAsignado(proyectosAsignado);
                                } else if (option == 11) {
                                    System.out.print("Ingrese la posicion del desarrollador que desea eliminar: ");
                                    int v = sc.nextInt();
                                    if (v < ((Directores) empleados.get(po)).getDesarrolladoresAsignados().size()) {
                                        ((Directores) empleados.get(po)).getDesarrolladoresAsignados().remove(v);
                                    } else {
                                        System.out.println("*NUMERO NO DISPONIBLE*");
                                    }
                                }
                            } else if (empleados.get(po) instanceof Empleado) {
                                System.out.print("1. Cambiar username\n"
                                        + "2. Cambiar contraseña}n"
                                        + "3. Cambiar nombre\n"
                                        + "4. Cambiar apellido\n"
                                        + "5. Cambiar id\n"
                                        + "6. Cambiar nacionalidad\n"
                                        + "7. Cambiar proyectos realizados\n"
                                        + "8. Cambiar años del contrato\n"
                                        + "Ingrese su opcion: ");
                                int option = sc.nextInt();
                                if (option == 1) {
                                    System.out.print("Ingrese su usuario: ");
                                    String username = sc.next();
                                    empleados.get(po).setUsername(username);
                                } else if (option == 2) {
                                    System.out.print("Ingrese su contraseña: ");
                                    String password = sc.next();
                                    empleados.get(po).setPassword(password);
                                } else if (option == 3) {
                                    System.out.print("Ingrese su nombre: ");
                                    String nombre = sc.next();
                                    empleados.get(po).setNombre(nombre);
                                } else if (option == 4) {
                                    System.out.print("Ingrese su apellido: ");
                                    String apellido = sc.next();
                                    empleados.get(po).setApellido(apellido);
                                } else if (option == 5) {
                                    System.out.print("Ingrese su ID: ");
                                    String id = sc.next();
                                    empleados.get(po).setId(id);
                                } else if (option == 6) {
                                    System.out.print("Ingrese su nacionalidad: ");
                                    String nacionalidad = sc.next();
                                    empleados.get(po).setNacionalidad(nacionalidad);
                                } else if (option == 7) {
                                    System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                    int proyectoRealizados = sc.nextInt();
                                    empleados.get(po).setProyectosRealizados(proyectoRealizados);
                                } else if (option == 8) {
                                    System.out.print("Ingrese su años de contrato: ");
                                    int yearsContrato = sc.nextInt();
                                    empleados.get(po).setYearsContrato(yearsContrato);
                                }
                            }
                        } else {
                            System.out.println("*EL NUMERO QUE INGRESO NO ESTA DISPONIBLE*");
                        }
                    } catch (Exception e) {
                        System.out.println("*OCURRIO UN ERROR EN EL SISTEMA*");

                    }
                } else if (opcion == 11) {
                    try {
                        System.out.print("Ingrese la posicion del proyecto que desea modificar: ");
                        int po = sc.nextInt();
                        if (po < empleados.size()) {

                        } else {
                            System.out.println("*EL NUMERO QUE INGRESO NO ESTA DISPONIBLE*");
                        }
                    } catch (Exception e) {
                        System.out.println("*OCURRIO UN ERROR EN EL SISTEMA*");

                    }
                } else if (opcion == 12) {
                    System.out.print("Ingrese su usuario: ");
                    String user = sc.next();
                    System.out.print("Ingrese su contraseña: ");
                    String pass = sc.next();
                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i).getUsername().equals(user) && empleados.get(i).getPassword().equals(pass)) {
                            if (empleados.get(i) instanceof Desarrolladores) {
                                int f = 1;
                                while (f != 3) {
                                    System.out.println("1. Ver mi informacion");
                                    System.out.println("2. Eliminar mi cuenta");
                                    System.out.println("3. Salir del menu");
                                    System.out.print("Ingrese su opcion: ");
                                    f = sc.nextInt();
                                    if (f == 1) {
                                        System.out.println(empleados.get(i));
                                    } else if (f == 2) {
                                        empleados.remove(i);
                                        System.out.println("SE HA ELIMINADO EXITOSAMENTE");
                                    }
                                }
                            } else if (empleados.get(i) instanceof Consultores) {
                                int f = 1;
                                while (f != 5) {
                                    System.out.println("1. Ver mi informacion");
                                    System.out.println("2. Eliminar mi cuenta");
                                    System.out.println("3. Modificar mi informacion");
                                    System.out.println("4. Ver proyectos conmigo");
                                    System.out.println("5. Salir del menu");
                                    System.out.print("Ingrese su opcion: ");
                                    f = sc.nextInt();
                                    if (f == 1) {
                                        System.out.println(empleados.get(i));
                                    } else if (f == 2) {
                                        empleados.remove(i);
                                        System.out.println("SE HA ELIMINADO EXITOSAMENTE");
                                    } else if (f == 3) {
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = sc.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = sc.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = sc.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = sc.next();
                                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                        int proyectoRealizados = sc.nextInt();
                                        System.out.print("Ingrese su años de contrato: ");
                                        int yearsContrato = sc.nextInt();
                                        System.out.print("Ingrese su campo de experiencia: ");
                                        String campo = sc.next();
                                        System.out.print("Ingrese su tiempo de consultoria: ");
                                        int tiempoConsultoria = sc.nextInt();
                                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                        int proyectosAsignado = sc.nextInt();
                                        System.out.print("Ingrese cuantos consultores tiene: ");
                                        int consultores = sc.nextInt();
                                        ((Consultores) empleados.get(i)).setApellido(apellido);
                                        ((Consultores) empleados.get(i)).setCampo(campo);
                                        ((Consultores) empleados.get(i)).setConsultores(consultores);
                                        ((Consultores) empleados.get(i)).setId(id);
                                        ((Consultores) empleados.get(i)).setNacionalidad(nacionalidad);
                                        ((Consultores) empleados.get(i)).setNombre(nombre);
                                        ((Consultores) empleados.get(i)).setProyectosAignados(proyectosAsignado);
                                        ((Consultores) empleados.get(i)).setProyectosRealizados(proyectoRealizados);
                                        ((Consultores) empleados.get(i)).setTiempoConsultoria(tiempoConsultoria);
                                        ((Consultores) empleados.get(i)).setYearsContrato(yearsContrato);
                                    } else if (f == 4) {
                                        for (int j = 0; j < proyectos.size(); j++) {
                                            if (proyectos.get(j).getConsultores().contains(empleados.get(i))) {
                                                System.out.println(proyectos.get(j));
                                            }
                                        }
                                    }
                                }
                            } else if (empleados.get(i) instanceof Directores) {
                                int f = 1;
                                while (f != 9) {
                                    System.out.print("1. Crear Desarrollador\n"
                                            + "2. Crear Consultor\n"
                                            + "3. Modificar Desarrolador\n"
                                            + "4. Modificar Consultor\n"
                                            + "5. Listar Desarroladores\n"
                                            + "6. Listar Consultores\n"
                                            + "7. Ver mis proyectos\n"
                                            + "8. Ver todos los proyectos del sistema\n"
                                            + "9. Marcar proyecto como completado\n"
                                            + "10. Salir del menu\n"
                                            + "Ingrese su opcion: ");
                                    f = sc.nextInt();
                                    if (f == 1) {
                                        System.out.print("Ingrese su usuario: ");
                                        String username = sc.next();
                                        System.out.print("Ingrese su contraseña: ");
                                        String password = sc.next();
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = sc.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = sc.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = sc.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = sc.next();
                                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                        int proyectoRealizados = sc.nextInt();
                                        System.out.print("Ingrese su años de contrato: ");
                                        int yearsContrato = sc.nextInt();
                                        double sueldo = 0;
                                        System.out.print("Ingrese su años de experienda tiene: ");
                                        int yearsExperiencia = sc.nextInt();
                                        System.out.print("Ingrese cuantas horas trabaja al dia: ");
                                        int horasTrabajadas = sc.nextInt();
                                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                        int proyectosAsignado = sc.nextInt();
                                        System.out.print("Ingrese su lenguaje preferido: ");
                                        String lenguajePreferido = sc.next();
                                        empleados.add(new Desarrolladores(yearsExperiencia, horasTrabajadas, proyectosAsignado, sueldo, lenguajePreferido, username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                                    } else if (f == 2) {
                                        System.out.print("Ingrese su usuario: ");
                                        String username = sc.next();
                                        System.out.print("Ingrese su contraseña: ");
                                        String password = sc.next();
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = sc.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = sc.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = sc.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = sc.next();
                                        System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                        int proyectoRealizados = sc.nextInt();
                                        System.out.print("Ingrese su años de contrato: ");
                                        int yearsContrato = sc.nextInt();
                                        System.out.print("Ingrese su campo de experiencia: ");
                                        String campo = sc.next();
                                        System.out.print("Ingrese su tiempo de consultoria: ");
                                        int tiempoConsultoria = sc.nextInt();
                                        System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                        int proyectosAsignado = sc.nextInt();
                                        System.out.print("Ingrese cuantos consultores tiene: ");
                                        int consultores = sc.nextInt();
                                        double sueldo = 0;
                                        empleados.add(new Consultores(campo, tiempoConsultoria, proyectosAsignado, consultores, sueldo, username, password, nombre, apellido, id, nacionalidad, proyectoRealizados, yearsContrato));
                                    } else if (f == 3) {
                                        System.out.print("Ingrese la posicion del desarrollador que desea modificar: ");
                                        int g = sc.nextInt();
                                        if (g < empleados.size() && empleados.get(g) instanceof Desarrolladores) {
                                            System.out.print("1. Cambiar username\n"
                                                    + "2. Cambiar contraseña}n"
                                                    + "3. Cambiar nombre\n"
                                                    + "4. Cambiar apellido\n"
                                                    + "5. Cambiar id\n"
                                                    + "6. Cambiar nacionalidad\n"
                                                    + "7. Cambiar proyectos realizados\n"
                                                    + "8. Cambiar años del contrato\n"
                                                    + "9. Cambiar años de experiencia\n"
                                                    + "10. Cambiar horas de trabajo\n"
                                                    + "11. Cambiar proyectos asignados\n"
                                                    + "12. Cambiar lenguaje preferido\n"
                                                    + "Ingrese su opcion: ");
                                            int option = sc.nextInt();
                                            if (option == 1) {
                                                System.out.print("Ingrese su usuario: ");
                                                String username = sc.next();
                                                empleados.get(g).setUsername(username);
                                            } else if (option == 2) {
                                                System.out.print("Ingrese su contraseña: ");
                                                String password = sc.next();
                                                empleados.get(g).setPassword(password);
                                            } else if (option == 3) {
                                                System.out.print("Ingrese su nombre: ");
                                                String nombre = sc.next();
                                                empleados.get(g).setNombre(nombre);
                                            } else if (option == 4) {
                                                System.out.print("Ingrese su apellido: ");
                                                String apellido = sc.next();
                                                empleados.get(g).setApellido(apellido);
                                            } else if (option == 5) {
                                                System.out.print("Ingrese su ID: ");
                                                String id = sc.next();
                                                empleados.get(g).setId(id);
                                            } else if (option == 6) {
                                                System.out.print("Ingrese su nacionalidad: ");
                                                String nacionalidad = sc.next();
                                                empleados.get(g).setNacionalidad(nacionalidad);
                                            } else if (option == 7) {
                                                System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                                int proyectoRealizados = sc.nextInt();
                                                empleados.get(g).setProyectosRealizados(proyectoRealizados);
                                            } else if (option == 8) {
                                                System.out.print("Ingrese su años de contrato: ");
                                                int yearsContrato = sc.nextInt();
                                                empleados.get(g).setYearsContrato(yearsContrato);
                                            } else if (option == 9) {
                                                System.out.print("Ingrese su años de experienda tiene: ");
                                                int yearsExperiencia = sc.nextInt();
                                                ((Desarrolladores) empleados.get(g)).setYearsExperiencia(yearsExperiencia);
                                            } else if (option == 10) {
                                                System.out.print("Ingrese cuantas horas trabaja al dia: ");
                                                int horasTrabajadas = sc.nextInt();
                                                ((Desarrolladores) empleados.get(g)).setHorasTrabajdas(horasTrabajadas);
                                            } else if (option == 11) {
                                                System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                                int proyectosAsignado = sc.nextInt();
                                                ((Desarrolladores) empleados.get(g)).setProyectosRealizados(proyectosAsignado);
                                            } else if (option == 12) {
                                                System.out.print("Ingrese su lenguaje preferido: ");
                                                String lenguajePreferido = sc.next();
                                                ((Desarrolladores) empleados.get(g)).setLenguajePreferido(lenguajePreferido);
                                            }
                                        } else {
                                            System.out.println("*OPCION NO DISPONIBLE*");
                                        }
                                    } else if (f == 4) {
                                        System.out.print("Ingrese la posicion del desarrollador que desea modificar: ");
                                        int g = sc.nextInt();
                                        if (g < empleados.size() && empleados.get(g) instanceof Consultores) {
                                            System.out.print("1. Cambiar username\n"
                                                    + "2. Cambiar contraseña}n"
                                                    + "3. Cambiar nombre\n"
                                                    + "4. Cambiar apellido\n"
                                                    + "5. Cambiar id\n"
                                                    + "6. Cambiar nacionalidad\n"
                                                    + "7. Cambiar proyectos realizados\n"
                                                    + "8. Cambiar años del contrato\n"
                                                    + "9. Cambiar campo\n"
                                                    + "10. Cambiar tiempo de consultoria\n"
                                                    + "11. Cambiar proyectos asignados\n"
                                                    + "12. Cambiar consultores\n"
                                                    + "13 Eliminar Desarrollador\n"
                                                    + "Ingrese su opcion: ");
                                            int option = sc.nextInt();
                                            if (option == 1) {
                                                System.out.print("Ingrese su usuario: ");
                                                String username = sc.next();
                                                empleados.get(g).setUsername(username);
                                            } else if (option == 2) {
                                                System.out.print("Ingrese su contraseña: ");
                                                String password = sc.next();
                                                empleados.get(g).setPassword(password);
                                            } else if (option == 3) {
                                                System.out.print("Ingrese su nombre: ");
                                                String nombre = sc.next();
                                                empleados.get(g).setNombre(nombre);
                                            } else if (option == 4) {
                                                System.out.print("Ingrese su apellido: ");
                                                String apellido = sc.next();
                                                empleados.get(g).setApellido(apellido);
                                            } else if (option == 5) {
                                                System.out.print("Ingrese su ID: ");
                                                String id = sc.next();
                                                empleados.get(g).setId(id);
                                            } else if (option == 6) {
                                                System.out.print("Ingrese su nacionalidad: ");
                                                String nacionalidad = sc.next();
                                                empleados.get(g).setNacionalidad(nacionalidad);
                                            } else if (option == 7) {
                                                System.out.print("Ingrese su cuantos proyectos ha realizado: ");
                                                int proyectoRealizados = sc.nextInt();
                                                empleados.get(g).setProyectosRealizados(proyectoRealizados);
                                            } else if (option == 8) {
                                                System.out.print("Ingrese su años de contrato: ");
                                                int yearsContrato = sc.nextInt();
                                                empleados.get(g).setYearsContrato(yearsContrato);
                                            } else if (option == 9) {
                                                System.out.print("Ingrese su campo de experiencia: ");
                                                String campo = sc.next();
                                                ((Consultores) empleados.get(g)).setCampo(campo);
                                            } else if (option == 10) {
                                                System.out.print("Ingrese su tiempo de consultoria: ");
                                                int tiempoConsultoria = sc.nextInt();
                                                ((Consultores) empleados.get(g)).setTiempoConsultoria(tiempoConsultoria);
                                            } else if (option == 11) {
                                                System.out.print("Ingrese cuantos proyectos tiene asignado: ");
                                                int proyectosAsignado = sc.nextInt();
                                                ((Consultores) empleados.get(g)).setProyectosAignados(proyectosAsignado);
                                            } else if (option == 12) {
                                                System.out.print("Ingrese cuantos consultores tiene: ");
                                                int consultores = sc.nextInt();
                                                ((Consultores) empleados.get(g)).setConsultores(consultores);
                                            } else if (option == 13) {
                                                System.out.print("Ingrese la posicion del desarrollador que desea eliminar: ");
                                                int v = sc.nextInt();
                                                if (v < ((Consultores) empleados.get(g)).getDesarrolladores().size()) {
                                                    ((Consultores) empleados.get(g)).getDesarrolladores().remove(v);
                                                } else {
                                                    System.out.println("*NUMERO NO DISPONIBLE*");
                                                }
                                            } else {
                                                System.out.println("*OPCION NO DISPONIBLE*");
                                            }

                                        }
                                    } else if (f == 5) {
                                        for (int j = 0; j < empleados.size(); j++) {
                                            if (empleados.get(j) instanceof Desarrolladores) {
                                                System.out.println(empleados.indexOf(empleados.get(j)) + " - " + empleados.get(j));
                                            }
                                        }
                                    } else if (f == 6) {
                                        for (int j = 0; j < empleados.size(); j++) {
                                            if (empleados.get(j) instanceof Consultores) {
                                                System.out.println(empleados.indexOf(empleados.get(j)) + " - " + empleados.get(j));
                                            }
                                        }
                                    } else if (f == 7) {
                                        for (int j = 0; j < proyectos.size(); j++) {
                                            if (proyectos.get(j).getDirectores().contains(empleados.get(i))) {
                                                System.out.println(proyectos.indexOf(proyectos.get(j)) + " - " + proyectos.get(j));
                                            }
                                        }
                                    } else if (f == 8) {
                                        for (int j = 0; j < proyectos.size(); j++) {
                                            System.out.println(i + " - " + proyectos.get(j));
                                        }
                                    } else if (f == 9) {
                                        System.out.print("Ingrese la posicion del proyecto que desea terminar: ");
                                        int g = sc.nextInt();
                                        if(g < proyectos.size()){
                                            proyectos.get(g).setEstadoActual("Terminado");
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("");
                    }
                }
            }

        }
    }
}


// porfavor ten piedad :v
