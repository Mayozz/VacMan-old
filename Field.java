package VacMan;

import java.util.Random;

public class Field {
	int[][] _currField;
	private Pacman _vacman;
	public static final int WALL = 0, PATH = 1, VACMAN = 2, VIRUS = 3, VACCINE = 4;

	public Field(int level) {
		_vacman = new Pacman(10, 13);
		_currField = new int[21][14];

		switch (level) {
		case 1:
			initFieldLevel1();
			break;
		default:
			System.out.println("Invalid level.");
		}
		initFieldLevel1();
	}

	public void initFieldLevel1() {
		int[][] fieldLevel1 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0 },
				{ 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 1, 4, 3, 4, 1, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 0, 0, 1, 0, 0, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 0, 1, 1, 1, 0, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 1, 1, 0, 1, 3, 1, 0, 1, 1, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 1, 1, 1, 1, 1, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 4, 0, 1, 0, 0, 0, 0, 0, 1, 0, 4, 0, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0 },
				{ 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0 },
				{ 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		_currField = fieldLevel1; // start with the level 1 field, but field never changes whilst the game
		_currField[10][13] = VACMAN; // starting position of vacman
	}

	/** Method to add the different characters to new places on the field. */
	public void addThing(int x, int y, int thing) {
		_currField[x][y] = thing;
	}

	/** Checks if vacman can move to the given place. */
	public boolean isChangeValid(int thing1, int thing2) {
		if (thing1 == WALL || thing2 == WALL) {
			return false;
		}
		return true;
	}

	public void changePositions(int x1, int y1, int thing1, int x2, int y2, int thing2) {
		// implement conditions
	}

	/** Deletes the character from its old place and makes this place a path. */
	public void deleteThing(int x, int y) {
		_currField[x][y] = PATH;
	}

	public int[][] getField() {
		return _currField;
	}

	/** Adds the vaccines to randomized places on the game filed. */
	public void randVaccines() {
		int x, y;
		Random rand = new Random();

		do {
			x = rand.nextInt(21);
			y = rand.nextInt(14);
		}

		while (_currField[x][y] != PATH);
		_currField[x][y] = VACCINE;
	}

	public void VacmanLeft() {
		int vacX = _vacman.getX();
		int vacY = _vacman.getY();
		if (_currField[vacX][vacY - 1] != WALL) {
			_currField[vacX][vacY] = PATH;
			_currField[vacX][vacY - 1] = VACMAN;
			_vacman.moveVacman(vacX, vacY - 1);
		}
	}

	public void VacmanRight() {
		int vacX = _vacman.getX();
		int vacY = _vacman.getY();
		if (_currField[vacX][vacY + 1] != WALL) {
			_currField[vacX][vacY] = PATH;
			_currField[vacX][vacY + 1] = VACMAN;
			_vacman.moveVacman(vacX, vacY + 1);
		}
	}

	public void VacmanUp() {
		int vacX = _vacman.getX();
		int vacY = _vacman.getY();
		if (_currField[vacX - 1][vacY] != WALL) {
			_currField[vacX][vacY] = PATH;
			_currField[vacX - 1][vacY] = VACMAN;
			_vacman.moveVacman(vacX - 1, vacY);
		}
	}

	public void VacmanDown() {
		int vacX = _vacman.getX();
		int vacY = _vacman.getY();
		if (_currField[vacX + 1][vacY] != WALL) {
			_currField[vacX][vacY] = PATH;
			_currField[vacX + 1][vacY] = VACMAN;
			_vacman.moveVacman(vacX + 1, vacY);
		}
	}
}
