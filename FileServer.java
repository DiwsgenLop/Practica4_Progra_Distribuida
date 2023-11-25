import java.io.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class FileServer {
    public static void main(String argv[]) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(argv, null);
            // Obtener el nombre del archivo a operar
            if (argv.length != 1) {
                System.out.println("Usage: java FileServer <nombreArchivo>");
                System.exit(0);
            }
            // create the servant and register it with the ORB
            IOArchivo fileRef = new IOArchivo(argv[0]);
            orb.connect(fileRef);
            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContext ncRef = NamingContextHelper.narrow(objRef);
            // Bind the object reference in naming
            NameComponent nc = new NameComponent("FileTransfer", " ");
            NameComponent path[] = { nc };
            ncRef.rebind(path, fileRef);
            System.out.println("Server started....");
            // Wait for invocations from clients
            java.lang.Object sync = new java.lang.Object();
            synchronized (sync) {
                sync.wait();
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}