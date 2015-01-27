package com.bitcamp.mustafaademovic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseCoordinates {
	public static void main(String[] args) {
		JFrame window = new JFrame("Window");
		JPanel panel = new JPanel();
		Mouselistener ml = new Mouselistener();

		panel.addMouseMotionListener(ml);
		window.setUndecorated(true);//Bez dekoracije(okvira)
		window.setOpacity(0.2F);//Prozor je proziran
		window.setSize(500, 500);
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	public static class Mouselistener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("X: " + e.getX() + " Y: " + e.getY());

		}

	}

}
