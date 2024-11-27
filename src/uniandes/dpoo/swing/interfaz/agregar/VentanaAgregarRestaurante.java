package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;
    
  
    private JButton btnCrear;
    private JButton btnCerrar;

    

    public VentanaAgregarRestaurante(VentanaPrincipal principal) {
        this.ventanaPrincipal = principal;
        setLayout(new BorderLayout());

        // Agrega el panel donde va a estar el mapa
        panelMapa = new PanelMapaAgregar();
        add(panelMapa);

        // Inicializa el panel de detalles del restaurante
        
        JPanel sur = new JPanel();
        panelDetalles = new PanelEditarRestaurante();
        add(panelDetalles, BorderLayout.SOUTH);

        // Panel para los botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCrear = new JButton("Crear Restaurante");
        btnCrear.addActionListener(e -> agregarRestaurante());
        panelBotones.add(btnCrear);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        panelBotones.add(btnCerrar);
        panelBotones.add(panelDetalles);

        // Agrega el panel de botones al layout
        add(panelBotones, BorderLayout.SOUTH);

        // Configuración final de la ventana
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

	

    void agregarRestaurante( )
    {
		String nombre = panelDetalles.getNombre();
		int calificacion = panelDetalles.getCalificacion();
		int x = panelMapa.getX();
		int y = panelMapa.getY();
		boolean visitado = panelDetalles.isVisible();

		ventanaPrincipal.agregarRestaurante(nombre, calificacion, x, y, visitado);
		cerrarVentana();
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
