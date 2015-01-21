using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)//metodo para cerrar
	{
		Application.Quit ();//cierra la aplicacion
		a.RetVal = true;
	}

	protected void OnButtonAceptarClicked (object sender, EventArgs e)
	{
		throw new NotImplementedException ();
		labelsaludo.Text = "Hola " + entryintroduce.Text;

	}
}
