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
                                while (f != 3) {
                                    System.out.println("1. Ver mi informacion");
                                    System.out.println("2. Eliminar mi cuenta");
                                    System.out.println("3. Modificar mi informacion");
                                    System.out.println("4. Ver proyectos conmigo");
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
                                        ((Consultores)empleados.get(i)).setApellido(apellido);
                                        ((Consultores)empleados.get(i)).setCampo(campo);
                                        ((Consultores)empleados.get(i)).setConsultores(consultores);
                                        ((Consultores)empleados.get(i)).setId(id);
                                        ((Consultores)empleados.get(i)).setNacionalidad(nacionalidad);
                                        ((Consultores)empleados.get(i)).setNombre(nombre);
                                        ((Consultores)empleados.get(i)).setProyectosAignados(proyectosAsignado);
                                        ((Consultores)empleados.get(i)).setProyectosRealizados(proyectoRealizados);
                                        ((Consultores)empleados.get(i)).setTiempoConsultoria(tiempoConsultoria);
                                        ((Consultores)empleados.get(i)).setYearsContrato(yearsContrato);
                                    }else if(f == 4){
                                        for (int j = 0; j < proyectos.size(); j++) {
                                            if(proyectos.get(j).getConsultores().contains(empleados.get(i))){
                                                System.out.println(proyectos.get(j));
                                            }
                                        }
                                    }
                                }
                            } else if (empleados.get(i) instanceof Directores) {

                            }
                        }
                    }
                }
                System.out.println("");
            }
        }
    }

}
