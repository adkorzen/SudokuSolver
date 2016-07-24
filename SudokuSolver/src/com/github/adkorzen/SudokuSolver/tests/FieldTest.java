package com.github.adkorzen.SudokuSolver.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.github.adkorzen.SudokuSolver.Main.Board;
import com.github.adkorzen.SudokuSolver.Main.Field;
import com.github.adkorzen.SudokuSolver.exceptions.IncorrectValueException;

public class FieldTest {

	private Field field;
	private Board board;

	@Before
	public void setUp() throws Exception {
		board = new Board("res/tests/SudokuTest.txt");
		field = new Field(board, 3, 4);
	}

	@Test (expected = IncorrectValueException.class)
	public void SetFieldValue_FieldWithIncorrectValue_RuntimeException() {
		Field field = new Field(board, 3, 4);
		field.setValue(10);
	}
	
	@Test
	public void FieldConstructor_SetAllValuesPossible_OK() {
		boolean[] expecteds = {true, true, true, true, true, true, true, true, true};
		boolean[] actuals = new boolean[9];
		for (int i = 0; i < 9; i++) {
			actuals[i] = field.isPossible(i + 1);
		}
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void SetImpossibleValue_ValidInput_OK() {
		field.setImpossibleValue(5);
		boolean actual = field.isPossible(5);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}

}
