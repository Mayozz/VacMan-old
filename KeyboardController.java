package VacMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Our controller listens for key events on the main window. Der Controller Part
 * des MVC Patterns beinhaltet alle Kontrollmöglichkeiten, mit welchen ein
 * Benutzer das Programm steuern kann.
 */
public class KeyboardController implements KeyListener {

	/** The world that is updated upon every key press. */
	private Model _model;
	private View _view;

	/**
	 * Creates a new instance.
	 * 
	 * @param world the world to be updated whenever Nick should move.
	 */
	public KeyboardController(View view, Model model) {
		_view = view;
		_model = model;
		_view.loadField(model.currFieldSetUp());
		_view.setVisible(true);
		_view.setBoardListener(this);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			_model.moveVacman(KeyEvent.VK_LEFT);
			_view.updateViews();
		}
		if (key == KeyEvent.VK_RIGHT) {
			_model.moveVacman(KeyEvent.VK_RIGHT);
			_view.updateViews();
		}
		if (key == KeyEvent.VK_UP) {
			_model.moveVacman(KeyEvent.VK_UP);
			_view.reBoard();
		}
		if (key == KeyEvent.VK_DOWN) {
			_model.moveVacman(KeyEvent.VK_DOWN);
			_view.updateViews();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
