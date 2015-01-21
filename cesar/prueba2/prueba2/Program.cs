using System;
using Gtk;

namespace prueba2
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Application.Init ();//para poner en marcha y que gtk se configure
			MainWindow win = new MainWindow ();//creación de una ventana
			win.Show ();//llamamos a la ventana
			Application.Run ();//inicia aplication, es un bucle
		}
	}
}
