
/**
* FileInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from FileInterface.idl
* s�bado 25 de noviembre de 2023 01:33:59 PM CST
*/

public final class FileInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public FileInterface value = null;

  public FileInterfaceHolder ()
  {
  }

  public FileInterfaceHolder (FileInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FileInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FileInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FileInterfaceHelper.type ();
  }

}
