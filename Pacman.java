package VacMan;

import java.awt.Point;

public class Pacman {
	private Point _position;

	public Pacman(int x, int y) {
		_position = new Point(x, y);
	}

	public int getX() {
		return _position.x;
	}

	public int getY() {
		return _position.y;
	}

	public void moveVacman(int x, int y) {
		_position.setLocation(x, y);
	}
}
