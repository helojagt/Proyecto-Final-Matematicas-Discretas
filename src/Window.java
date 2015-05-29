/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Rectangle;

import javax.swing.JLabel;

import java.awt.TextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author federico
 */
public class Window extends javax.swing.JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n; //variable encargada de guardar el numero de ecuaciones
    DefaultTableModel modelo = new DefaultTableModel(); //modelo de la tabla para ingresar las ecuaciones
    Boolean ban = false;
    Procesos misProcesos = new Procesos();
    String pasosAlg = "[#Veces] - Instruccion\n";//Almacena los pasos que realiza el algoritmo
    public int getN(){ //Metodos para inicializar a n, y obtener su valor
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
    
    
    /**
     * Creates new form LUPSOLVE
     */
    public Window() {
    	setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    public String algoritmo(int control)
    {
    	String paso = null;
    	if(control == 0)
    		paso ="n = renglones(A)";
    	if(control == 1)
    		paso ="for i=1 to n do";
    	if(control == 2)
    		paso ="\t m[i] = i"; 
    	if(control == 3)
    		paso ="for k = 1 to n-1 do"; 
    	if(control == 4)
    		paso ="\t p=0"; 
    	if(control == 5)
    		paso ="\t for i = k to n do";
    	if(control == 6)
    		paso ="\t\t if |a(ik)| > p then"; 
    	if(control == 7)
    		paso ="\t\t\t p = |a(ik)|"; 
    	if(control == 8)
    		paso ="\t\t\t k = i"; 
    	if(control == 9)
    		paso ="\t\t if p = 0 then"; 
    	if(control == 10)
    		paso ="\t\t\t error()"; 
    	if(control == 11)
    		paso ="\t\t echange(m[k],m[K])"; 
    	if(control == 12)
    		paso ="\t\t echangeA(k,K)"; 
    	if(control == 13)
    		paso ="\t\t pivote(k)"; 
    	
    	
    	if(control == 14)
    		paso ="u(kk) = a(kk)"; 
    	if(control == 15)
    		paso ="for i = k+1 to n do"; 
    	if(control == 16)
    		paso ="\t i(ik) = a(ik)/u(kk)"; 
    	if(control == 17)
    		paso ="\t u(ki) = a(ki)"; 
    	if(control == 18)
    		paso ="for i = k+1 to n do"; 
    	if(control == 19)
    		paso ="\t for j= k+q to n do "; 
    	if(control == 20)
    		paso ="\t\t a(ij) = a(ij) - I(ik)U(kj)"; 
         
    	
    	return paso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroDeEc = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonLimpiar.addActionListener(this);
        
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LUP - SOLVE");
        setBounds(new Rectangle(0, 0, 820, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "LUP - Solve"));
        jPanel1.setLayout(null);

        jLabel1.setText("N\u00FAmero de Ecuaciones:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 24, 140, 30);
        jPanel1.add(jTextFieldNumeroDeEc);
        jTextFieldNumeroDeEc.setBounds(160, 20, 110, 30);

        jButtonGenerar.setText("Generar ecuaciones");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGenerar);
        jButtonGenerar.setBounds(308, 20, 140, 34);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x"
            }
        ));
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 549, 330);

        jButtonLimpiar.setText("Limpiar");
        jPanel1.add(jButtonLimpiar);
        jButtonLimpiar.setBounds(796, 397, 80, 23);

        jButton2.setText("Resolver sistema");
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 393, 130, 30);

        jLabel2.setText("Pasos:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(591, 28, 45, 20);
        
        btnAyudaMaual = new JButton("Ayuda - Manual");
        btnAyudaMaual.addActionListener(this);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        				.addComponent(btnAyudaMaual, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(btnAyudaMaual)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        			.addContainerGap())
        );
        
        JLabel lblMatrices = new JLabel("Matrices:");
        lblMatrices.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblMatrices.setBounds(591, 264, 60, 34);
        jPanel1.add(lblMatrices);
        
        textAreaPasos = new TextArea();
        textAreaPasos.setEditable(false);
        textAreaPasos.setBounds(657, 24, 339, 234);
        jPanel1.add(textAreaPasos);
        
        textAreaMatrices = new TextArea();
        textAreaMatrices.setEditable(false);
        textAreaMatrices.setBounds(657, 264, 339, 124);
        jPanel1.add(textAreaMatrices);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        // TODO add your handling code here:
        try {
            this.setN(Integer.parseInt(jTextFieldNumeroDeEc.getText())); // convierte el texto del campo de valor de n en entero
            n = this.getN(); //obtiene el valor de n
            
            if(n<=1){ //validacion
               throw new Exception("Numero incorrecto!! Verifique"); //Validar que el numero de ecuaciones sea mayor que 2
            }
            Object columnas[] = new Object[n+2]; //Generar Numero de ecuaciones NxN en la tabla + la columna del numero de ecuacion
            columnas[0] = "No. Ec";
            for (int i = 1; i < n+2; i++) { //for para ir a�adiendo las columnas en la tabla
                if (i < n + 1) {
                    columnas[i] = "x" + (i); //va a�adiendo las incognitas en la tabla x1,x2,x3...xn
                } else{
                    columnas[i] = "B"; // agrega la ultima columna b 
                }
            }
            
 
            modelo = new DefaultTableModel(columnas , n); //modificar el tama�o de la tabla
            
            for(int i = 0; i < n; i++){ // Se generara el un indice del numero de ecuaciones.
            	modelo.setValueAt(i + 1, i, 0);//Inserta los indices del numero de ecuaciones en la columna 0.
            }
            
            
            jTable.setModel(modelo); //dimension de la matriz
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage()); //Error cuando ingresan una letra en ves de un numero
        }
        
    
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldNumeroDeEc;
    private JButton btnAyudaMaual;
    private TextArea textAreaMatrices;
    private TextArea textAreaPasos;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButtonLimpiar){
			textAreaMatrices.setText("");
		}
		
		if(e.getSource() == jButton2){	//El usuario presiona Generar Ecuacion
			int optionSelected = JOptionPane.showConfirmDialog(this, "Seguro que son los datos correctos?", "Confirmacion", JOptionPane.YES_NO_OPTION);
			
			if(optionSelected == JOptionPane.YES_OPTION){ //Si en la ventana selecciono la opcion si, se cargaran los datos a la matriz para resolver el sistema 
				try{
					this.parseMatriz();
					this.parseValoresIndependiente();

				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Los valores no son Numeros reales o no existen, reingresa los datos y/o asegurate de dar [enter] a os valores ingreados!");
				}
				textAreaMatrices.setText("holo holo holo holo");
				for(int a = 0; a<21;a++)
				{
					pasosAlg += "[0]\t" + algoritmo(a)+"\n";
				}
				textAreaPasos.setText(pasosAlg);
			}
		}
		if(e.getSource() == btnAyudaMaual){	
			misProcesos.cargarArchivo();
		}
	}
	private double[][] parseMatriz() {
		// TODO Auto-generated method stub
		double[][] matrizAResolver = new double[n][n];
		for(int i = 0; i <  n; i++){	
			for(int j = 1; j <= n; j++){
				matrizAResolver[i][j-1] = Double.parseDouble((String) jTable.getModel().getValueAt(i, j)); //Ingresa los valores a la clase Solve para resolverlos
			}
		}	
		return matrizAResolver;
	}
	
	private double[] parseValoresIndependiente(){//Obtiene los valores de los valores independientes
		double[] vectorValoresIndependientes = new double[n];
		int ultimaColumna = n + 1;
		for(int i = 0; i < n; i++)
			vectorValoresIndependientes[i]= Double.parseDouble((String) jTable.getModel().getValueAt(i, ultimaColumna ));
		return vectorValoresIndependientes;
	}
}
