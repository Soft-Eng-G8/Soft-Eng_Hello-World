package com.softengdev;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;


/**
 * The HelloUI class creates a simple graphical user interface (GUI) application
 * that displays a "Hello world!" message along with the number of times the 
 * program has run.
 * 
 * <p>This class uses Java Swing components to create the GUI and includes methods 
 * to initialize and display the main application window.</p>
 * 
 * <p>Usage:</p>
 * <pre>
 * {@code
 * HelloUI.initializeUI(5);
 * }
 * </pre>
 * 
 * <p>Features:</p>
 * <ul>
 *   <li>Displays a "Hello world!" message in the center of the window.</li>
 *   <li>Displays the number of times the program has run at the bottom of the window.</li>
 * </ul>
 * 
 * <p>Components:</p>
 * <ul>
 *   <li>JFrame: The main application window.</li>
 *   <li>JLabel: Used to display the "Hello world!" message and the run count.</li>
 * </ul>
 * 
 * @param runs The number of times the program has run.
 * @see JFrame
 * @see JLabel
 */
public class HelloUI {

	private JFrame frmTheHelloWorld;

	/**
	 * Initializes the user interface by invoking the UI creation on the Event Dispatch Thread.
	 * 
	 * @param runs the number of runs to be passed to the HelloUI constructor
	 */
	public static void initializeUI(int runs) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloUI window = new HelloUI(runs);
					window.frmTheHelloWorld.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Constructs a new HelloUI instance and initializes it with the specified number of runs.
	 *
	 * @param runs the number of runs to initialize the HelloUI instance with
	 */
	public HelloUI(int runs) {
		initialize(runs);
	}

	/**
	 * Initializes the main frame of the application with a title, background color,
	 * size, and default close operation. It also sets up two labels: one displaying
	 * "Hello world!" and another displaying the number of times the program has run.
	 *
	 * @param runs The number of times the program has been executed.
	 */
	private void initialize(int runs) {
		frmTheHelloWorld = new JFrame();
		frmTheHelloWorld.setTitle("The Hello world");
		frmTheHelloWorld.setBackground(Color.LIGHT_GRAY);
		frmTheHelloWorld.setBounds(100, 100, 463, 329);
		frmTheHelloWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String message = "Number of times this program has run "+ String.valueOf(runs) ;
		frmTheHelloWorld.getContentPane().setLayout(new BorderLayout(0, 0));
		JLabel lblHello = new JLabel("Hello world!");
		lblHello.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblHello.setBackground(Color.LIGHT_GRAY);
		lblHello.setOpaque(true);
		lblHello.setFont(new Font("Helvetica", Font.BOLD, 30));
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setPreferredSize(new Dimension(100,100));
		frmTheHelloWorld.getContentPane().add(lblHello);
		JLabel lbllogin = new JLabel(message);
		lbllogin.setBackground(Color.LIGHT_GRAY);
		lbllogin.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lbllogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogin.setPreferredSize(new Dimension(100,100));
		lbllogin.setOpaque(true);
		frmTheHelloWorld.getContentPane().add(lbllogin, BorderLayout.SOUTH);
		
	}

}
