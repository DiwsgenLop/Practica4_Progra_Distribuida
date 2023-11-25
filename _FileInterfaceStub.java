
/**
* _FileInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FileInterface.idl
* s�bado 25 de noviembre de 2023 01:33:59 PM CST
*/

public class _FileInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements FileInterface
{

  public short contarLineas (String nombrearchivo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("contarLineas", true);
                $out.write_string (nombrearchivo);
                $in = _invoke ($out);
                short $result = $in.read_short ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return contarLineas (nombrearchivo        );
            } finally {
                _releaseReply ($in);
            }
  } // contarLineas

  public short cuentavocales (String nombrearchivo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cuentavocales", true);
                $out.write_string (nombrearchivo);
                $in = _invoke ($out);
                short $result = $in.read_short ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return cuentavocales (nombrearchivo        );
            } finally {
                _releaseReply ($in);
            }
  } // cuentavocales

  public void escribe (String nombreArchivoDestino)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("escribe", true);
                $out.write_string (nombreArchivoDestino);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                escribe (nombreArchivoDestino        );
            } finally {
                _releaseReply ($in);
            }
  } // escribe

  public void imprimir ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("imprimir", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                imprimir (        );
            } finally {
                _releaseReply ($in);
            }
  } // imprimir

  public void respaldar (String nombrearchivo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("respaldar", true);
                $out.write_string (nombrearchivo);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                respaldar (nombrearchivo        );
            } finally {
                _releaseReply ($in);
            }
  } // respaldar

  public void copiar (String nombrearchivodestino)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("copiar", true);
                $out.write_string (nombrearchivodestino);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                copiar (nombrearchivodestino        );
            } finally {
                _releaseReply ($in);
            }
  } // copiar

  public void renombrar (String nombrearchivo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("renombrar", true);
                $out.write_string (nombrearchivo);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                renombrar (nombrearchivo        );
            } finally {
                _releaseReply ($in);
            }
  } // renombrar

  public void eliminar (String nombrearchivo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminar", true);
                $out.write_string (nombrearchivo);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                eliminar (nombrearchivo        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminar

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:FileInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _FileInterfaceStub
