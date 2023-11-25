import org.omg.CosNaming.*;

import java.rmi.Naming;

import org.omg.CORBA.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class FileClient {
    public static void main(String argv[]) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(argv, null);
            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContext ncRef = NamingContextHelper.narrow(objRef);
            NameComponent nc = new NameComponent("FileTransfer", " ");
            // Resolve the object reference in naming
            NameComponent path[] = { nc };
            FileInterfaceOperations fileRef = FileInterfaceHelper.narrow(ncRef.resolve(path));
            // Pass IP, operation and parameter
            if (argv.length < 3) {
                System.out.println("Usage: java FileClient <IP> <operation> <parameter>");
                System.exit(0);
            }
            // Values
            String ip = argv[0];
            String operation = argv[1];
            String parameter = argv[2];

            // MOSTRAR nombre del servidor
            String name = "//" + ip + "/FileServer";
            System.out.println("Conectando con el servidor: " + name);
            // Operaciones
            switch (operation) {
                case "contarLineas":
                    // Contar lineas
                    short lineas = fileRef.contarLineas(parameter);
                    System.out.println("El archivo tiene " + lineas + " lineas");
                    break;
                case "cuentavocales":
                    // Contar vocales
                    short vocales = fileRef.cuentavocales(parameter);
                    System.out.println("El archivo tiene " + vocales + " vocales");
                    break;
                case "escribe":
                    // Escribir
                    fileRef.escribe(parameter);
                    System.out.println("Contenido del archivo escrito en " + parameter);
                    break;
                case "imprimir":
                    // Imprimir
                    fileRef.imprimir();
                    break;
                case "respaldar":
                    // Respaldo
                    fileRef.respaldar(parameter);
                    System.out.println("Archivo respaldado en :" + parameter);
                    break;
                case "renombrar":
                    // Renombrar
                    fileRef.renombrar(parameter);
                    System.out.println("Archivo renombrado a " + parameter);
                    break;
                case "copiar":
                    // Copiar
                    fileRef.copiar(parameter);
                    System.out.println("Archivo copiado a " + parameter);
                    break;
                case "eliminar":
                    // Eliminar
                    fileRef.eliminar(parameter);
                    System.out.println("Archivo eliminado");
                    break;
            }
        } catch (Exception e) {
            System.out.println("FileClient Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}