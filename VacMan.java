package VacMan;


/**
 * This is our main program. It is responsible for creating all of the objects
 * that are part of the MVC pattern and connecting them with each other.
 */
public class VacMan {
	public static void main(String[] args) {
		View view = new View(initFieldLevel1());
		Model model = new Model();
		KeyboardController controller = new KeyboardController(view, model);
	}

	public int[][] initFieldLevel1() {
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
	
	return fieldLevel1;
	}

}
