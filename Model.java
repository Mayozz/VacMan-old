package VacMan;

import java.awt.event.KeyEvent;

/**
 * Der Model Part des MVC Patterns enthält die Daten, bzw. die Datenzugriffe.
 * 
 * @author larairina
 *
 */
public class Model {
	private Field _field;
	public static int _score;

	/** Starts the game with field of level one and a score of 0. */
	public Model() {
		_field = new Field(1);
		_score = 0;
	}

	/** Method to get the current state of the game field. */
	public int[][] currFieldSetUp() {
		return _field.getField();
	}

	public void moveVacman(int e) {
		switch (e) {
		case KeyEvent.VK_LEFT:
			_field.VacmanLeft();
			break;

		case KeyEvent.VK_RIGHT:
			_field.VacmanRight();
			break;

		case KeyEvent.VK_UP:
			_field.VacmanUp();
			break;

		case KeyEvent.VK_DOWN:
			_field.VacmanDown();
			break;
		}
	}

}
