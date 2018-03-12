import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {        
	public static void main(String[] args) {
		Dimension minSize = new Dimension(400,400);
		JFrame frame = new JFrame ("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(minSize);
		frame.setIconImage(new ImageIcon("C:/Users/noelk/eclipse-workspace/TicTacToe/src/tictactoe.png").getImage());
		frame.setLayout(new GridLayout(4,3));
		frame.add(new Button("1"));
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
		frame.add(new Button("7"));
		frame.add(new Button("8"));
		frame.add(new Button("9"));
		frame.add(new Button("This is a Button"));
		JMenuBar menu = new JMenuBar();
		JMenuItem _new, _clear, _close;
		_new = new JMenuItem("New Game");
		_clear = new JMenuItem("Clear Game");
		_close = new JMenuItem("Close Game");
		menu.add(_new); menu.add(_clear); menu.add(_close);
		frame.setJMenuBar(menu);
		frame.setVisible(true);
	}
}