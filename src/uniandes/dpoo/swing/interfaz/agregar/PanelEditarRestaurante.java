package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	
    	txtNombre = new JTextField( 20 );
    	JLabel lblNombre = new JLabel( "Nombre:" );
    	JPanel panelNombre = new JPanel( );
    	panelNombre.setLayout( new FlowLayout( FlowLayout.LEFT ) );
    	panelNombre.add( lblNombre );
    	panelNombre.add( txtNombre );
    	add( panelNombre );
    	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	cbbCalificacion = new JComboBox<String>( );
    	cbbCalificacion.addItem( "1" );
    	cbbCalificacion.addItem( "2" );
    	cbbCalificacion.addItem( "3" );
    	cbbCalificacion.addItem( "4" );
    	cbbCalificacion.addItem( "5" );
    	JLabel lblCalificacion = new JLabel( "Calificación:" );
    	JPanel panelCalificacion = new JPanel( );
    	panelCalificacion.setLayout( new FlowLayout( FlowLayout.LEFT ) );
    	panelCalificacion.add( lblCalificacion );
    	panelCalificacion.add( cbbCalificacion );
    	add( panelCalificacion );	
    	

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	cbbVisitado = new JComboBox<String>( );
    	cbbVisitado.addItem( "Visitado" );
    	cbbVisitado.addItem( "No visitado" );
    	JLabel lblVisitado = new JLabel( "Visitado:" );
    	JPanel panelVisitado = new JPanel( );
    	panelVisitado.setLayout( new FlowLayout( FlowLayout.LEFT ) );
    	panelVisitado.add( lblVisitado );
    	panelVisitado.add( cbbVisitado );
    	add( panelVisitado );
    	

        // Agregar todos los elementos al panel
        // TODO completar
    	
    	setLayout( new GridLayout( 3, 1 ) );
    	add( panelNombre );
    	add( panelCalificacion );
    	add( panelVisitado );
    	
    	
    	

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	String visitado = ( String )cbbVisitado.getSelectedItem( );
    	if(visitado.equals("Visitado")) {
    		return true;
    	}
        return false;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText( );
       
    }
}
