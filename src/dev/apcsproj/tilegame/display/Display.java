package dev.apcsproj.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display 
{
	/*
	 * Tools used by the display to actually display things
	 */
	private JFrame frame;
	private Canvas canvas;
	
	/*
	 * Characteristics to the display
	 */
	private String myTitle;
	private int myWidth;
	private int myHeight;
	
	/*
	 * Constructor
	 */
	public Display(String title, int width, int height)
	{
		myTitle = title;
		myWidth = width;
		myHeight = height;
		
		createDisplay();
	}
	/*
	 * Used in constructor to use all variables loaded during instanciation
	 */
	private void createDisplay() 
	{
		//Set characteristics of the literal window of the game window
		frame = new JFrame(myTitle);
		frame.setSize(myWidth, myHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//Lets us actually render things to the screen
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(myWidth, myHeight)); //Dimension is basically a wrapper class for dimensions that canvas reads
		canvas.setMaximumSize(new Dimension(myWidth, myHeight)); //restricts canvas size to width & height
		canvas.setMinimumSize(new Dimension(myWidth, myHeight));
		canvas.setFocusable(false);
		
		//Now actually connect the canvas to the frame
		frame.add(canvas);
		
		frame.pack();
	}
	/*
	 * Accessor for canvas
	 */
	public Canvas getCanvas()
	{
		return canvas;
	}
	/*
	 * Accessor for frame
	 */
	public JFrame getFrame()
	{
		return frame;
	}
}
