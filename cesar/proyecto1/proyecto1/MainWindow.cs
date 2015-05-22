using System;
using Gtk;
using System.IO;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
	protected void OnOpenActionActivated (object sender, EventArgs e)
	{

		throw new NotImplementedException ();
	}


	protected void OnEscribirActivated (object sender, EventArgs e)
	{
		// Clase TextWriter para poder escribir caracteres en un archivo.
		TextWriter tw;

		// Creo la clase y abro el archivo para escritura,
		// - indicandole la ruta de acceso al archivo
		// - y que agregue los datos al final del archivo
		tw = new StreamWriter("/home/mati/archivo.txt", true);

		// Escribo el contenido del TextView en el archivo
		tw.WriteLine(textview1.Buffer.Text);

		// Cierro el archivo
		tw.Close();
	}

}
