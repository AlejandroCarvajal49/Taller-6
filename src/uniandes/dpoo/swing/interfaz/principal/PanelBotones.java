package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
    /**
     * El comando para el botón para crear un nuevo restaurante
     */
    private static final String NUEVO = "nuevo";

    /**
     * El comando para el botón para ver todos los restaurantes en el mapa
     */
    private static final String VER = "ver";

    private JButton butNuevo;
    private JButton butVerTodos;
    private VentanaPrincipal ventanaPrincipal;

    public PanelBotones(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;

        // Establecer el layout del panel
        setLayout(new FlowLayout());

        // Crear el botón para crear un nuevo restaurante
        JButton butNuevo = new JButton("Nuevo Restaurante");
        // Agregar un ActionListener para manejar el evento del botón
        butNuevo.addActionListener(e -> ventanaPrincipal.mostrarVentanaNuevoRestaurante());

        // Crear el botón para ver todos los restaurantes
        JButton butVerTodos = new JButton("Ver Todos");
        // Agregar un ActionListener para manejar el evento del botón
        butVerTodos.addActionListener(e -> ventanaPrincipal.mostrarVentanaMapa());

        // Agregar los botones al panel
        add(butNuevo);
        add(butVerTodos);
    }
    
    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( NUEVO ) )
        {
            ventanaPrincipal.mostrarVentanaNuevoRestaurante( );
        }
        else if( comando.equals( VER ) )
        {
            ventanaPrincipal.mostrarVentanaMapa( );
        }
    }
}
