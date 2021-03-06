package com.github.adkorzen.SudokuSolver.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.adkorzen.SudokuSolver.main.Board;

public class SolverSinglePosition {

	// In order for all tests to work comment out System.exit
	// from method decreaseUnsolvedAmount() from Board class

	@Test
	public void SolveBoard_SinglePositionBoard_CorrectResult() {
		Board board = new Board("res/methods/SinglePosition.txt");
		board.solve();
		int[][] expecteds = { { 9, 4, 6, 1, 3, 5, 7, 2, 8 }, { 7, 3, 5, 6, 8, 2, 9, 4, 1 },
				{ 2, 8, 1, 9, 7, 4, 6, 3, 5 }, { 1, 2, 4, 3, 5, 9, 8, 7, 6 }, { 3, 7, 9, 8, 4, 6, 1, 5, 2 },
				{ 5, 6, 8, 2, 1, 7, 3, 9, 4 }, { 8, 1, 2, 4, 9, 3, 5, 6, 7 }, { 6, 5, 3, 7, 2, 1, 4, 8, 9 },
				{ 4, 9, 7, 5, 6, 8, 2, 1, 3 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_SinglePosition2Board_CorrectResult() {
		Board board = new Board("res/methods/SinglePosition2.txt");
		board.solve();
		int[][] expecteds = { { 9, 7, 2, 1, 3, 5, 8, 6, 4 }, { 4, 3, 8, 2, 7, 6, 1, 5, 9 },
				{ 6, 5, 1, 4, 9, 8, 2, 3, 7 }, { 1, 6, 9, 3, 8, 2, 4, 7, 5 }, { 3, 8, 7, 5, 4, 1, 9, 2, 6 },
				{ 5, 2, 4, 9, 6, 7, 3, 1, 8 }, { 7, 9, 6, 8, 1, 3, 5, 4, 2 }, { 2, 4, 3, 7, 5, 9, 6, 8, 1 },
				{ 8, 1, 5, 6, 2, 4, 7, 9, 3 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}
}
