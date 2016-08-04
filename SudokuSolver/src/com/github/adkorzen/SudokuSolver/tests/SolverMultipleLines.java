package com.github.adkorzen.SudokuSolver.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.adkorzen.SudokuSolver.main.Board;

public class SolverMultipleLines {

	// In order for all tests to work comment out System.exit
	// from method decreaseUnsolvedAmount() from Board class

	@Test
	public void SolveBoard_MultipleLinesBoard_CorrectResult() {
		Board board = new Board("res/methods/MultipleLines.txt");
		board.solve();
		int[][] expecteds = { { 8, 4, 9, 5, 3, 2, 6, 1, 7 }, { 5, 3, 6, 7, 1, 4, 2, 8, 9 },
				{ 1, 2, 7, 8, 6, 9, 4, 3, 5 }, { 3, 9, 5, 4, 7, 1, 8, 2, 6 }, { 7, 1, 4, 2, 8, 6, 5, 9, 3 },
				{ 2, 6, 8, 3, 9, 5, 1, 7, 4 }, { 6, 8, 1, 9, 5, 3, 7, 4, 2 }, { 9, 7, 2, 6, 4, 8, 3, 5, 1 },
				{ 4, 5, 3, 1, 2, 7, 9, 6, 8 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_MultipleLines2Board_CorrectResult() {
		Board board = new Board("res/methods/MultipleLines2.txt");
		board.solve();
		int[][] expecteds = { { 8, 5, 1, 3, 7, 2, 6, 9, 4 }, { 4, 3, 2, 9, 1, 6, 8, 7, 5 },
				{ 9, 6, 7, 5, 4, 8, 1, 2, 3 }, { 5, 7, 8, 4, 2, 3, 9, 6, 1 }, { 3, 1, 6, 7, 8, 9, 5, 4, 2 },
				{ 2, 4, 9, 1, 6, 5, 3, 8, 7 }, { 6, 2, 4, 8, 5, 1, 7, 3, 9 }, { 1, 8, 3, 2, 9, 7, 4, 5, 6 },
				{ 7, 9, 5, 6, 3, 4, 2, 1, 8 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

}
