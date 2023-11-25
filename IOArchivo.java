
//Librerias necesarias para rmi 
import java.io.*;

import org.omg.CORBA.*;

//Clase IOArchivo que implementa la interfaz FileInterface
public class IOArchivo extends _FileInterfaceImplBase {
    private String nombreArchivo;

    // Constructor con parametro para representar el nombre del archivo en el que
    // operar
    public IOArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // Metodo para contarlineas del archivo dado el nombre del archivo String
    public short contarLineas(String nombreArchivo) {
        short contador = 0;
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                contador++;
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return contador;
    }

    // Metodo para contarlas vocales del archivo dado el nombre del archivo String
    public short cuentavocales(String nombreArchivo) {
        short contador = 0;
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) == 'a' || linea.charAt(i) == 'e' || linea.charAt(i) == 'i'
                            || linea.charAt(i) == 'o' || linea.charAt(i) == 'u') {
                        contador++;
                    }
                }
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return contador;
    }

    // Segunda forma para escribe
    public void escribe(String nombreArchivoDestino) {
        try (InputStream is = new FileInputStream(nombreArchivo);
                OutputStream os = new FileOutputStream(nombreArchivoDestino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo en el OutputStream: " + e.getMessage());
        }
    }

    // Metodo para imprimir el contenido del archivo en pantalla
    public void imprimir() {
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }

    // Metodo para respaldar el archivo
    public void respaldar(String nombreArchivoDestino) {
        try (InputStream is = new FileInputStream(nombreArchivo);
                OutputStream os = new FileOutputStream(nombreArchivoDestino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error al respaldar el archivo: " + e.getMessage());
        }
    }

    // Metodo para copiar el contenido del archivo fuente a un archivo destino
    // 'nombrearchivodestino'
    public void copiar(String nombreArchivoDestino) {
        try (InputStream is = new FileInputStream(nombreArchivo);
                OutputStream os = new FileOutputStream(nombreArchivoDestino, true)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            // Si el archivo destino ya tiene contenido, se añade, y se diferencia con un
            // salto de linea
            if (new File(nombreArchivoDestino).length() > 0) {
                os.write('\n');
            }
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

    // Metodo para renombrar el archivo
    public void renombrar(String nuevoNombre) {
        // renombrarlo
        File archivo = new File(nombreArchivo);
        File archivo2 = new File(nuevoNombre);//
        if (archivo.renameTo(archivo2)) {
            System.out.println("Archivo renombrado a:" + nuevoNombre);//
            // Actualizamos el nombre para que tenga referencia
            this.nombreArchivo = nuevoNombre;
        } else {
            System.out.println("Error al renombrar el archivo");
        }
    }

    // Metodo para eliminar el archivo
    public void eliminar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado");
        } else {
            System.out.println("Error al eliminar el archivo");
        }
    }
}