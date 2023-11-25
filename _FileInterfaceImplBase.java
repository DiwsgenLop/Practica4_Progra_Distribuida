
/**
* _FileInterfaceImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FileInterface.idl
* s�bado 25 de noviembre de 2023 01:33:59 PM CST
*/

public abstract class _FileInterfaceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements FileInterface, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _FileInterfaceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("contarLineas", new java.lang.Integer (0));
    _methods.put ("cuentavocales", new java.lang.Integer (1));
    _methods.put ("escribe", new java.lang.Integer (2));
    _methods.put ("imprimir", new java.lang.Integer (3));
    _methods.put ("respaldar", new java.lang.Integer (4));
    _methods.put ("copiar", new java.lang.Integer (5));
    _methods.put ("renombrar", new java.lang.Integer (6));
    _methods.put ("eliminar", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // FileInterface/contarLineas
       {
         String nombrearchivo = in.read_string ();
         short $result = (short)0;
         $result = this.contarLineas (nombrearchivo);
         out = $rh.createReply();
         out.write_short ($result);
         break;
       }

       case 1:  // FileInterface/cuentavocales
       {
         String nombrearchivo = in.read_string ();
         short $result = (short)0;
         $result = this.cuentavocales (nombrearchivo);
         out = $rh.createReply();
         out.write_short ($result);
         break;
       }

       case 2:  // FileInterface/escribe
       {
         String nombreArchivoDestino = in.read_string ();
         this.escribe (nombreArchivoDestino);
         out = $rh.createReply();
         break;
       }

       case 3:  // FileInterface/imprimir
       {
         this.imprimir ();
         out = $rh.createReply();
         break;
       }

       case 4:  // FileInterface/respaldar
       {
         String nombrearchivo = in.read_string ();
         this.respaldar (nombrearchivo);
         out = $rh.createReply();
         break;
       }

       case 5:  // FileInterface/copiar
       {
         String nombrearchivodestino = in.read_string ();
         this.copiar (nombrearchivodestino);
         out = $rh.createReply();
         break;
       }

       case 6:  // FileInterface/renombrar
       {
         String nombrearchivo = in.read_string ();
         this.renombrar (nombrearchivo);
         out = $rh.createReply();
         break;
       }

       case 7:  // FileInterface/eliminar
       {
         String nombrearchivo = in.read_string ();
         this.eliminar (nombrearchivo);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:FileInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _FileInterfaceImplBase