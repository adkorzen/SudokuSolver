package com.github.adkorzen.SudokuSolver.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.adkorzen.SudokuSolver.main.Board;

public class SolverHiddenPairs {

	// In order for all tests to work comment out System.exit
	// from method decreaseUnsolvedAmount() from Board class

	@Test
	public void SolveBoard_HiddenPairsBoard_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs.txt");
		board.solve();
		int[][] expecteds = { { 8, 2, 1, 7, 5, 6, 3, 9, 4 }, { 3, 5, 6, 4, 1, 9, 7, 8, 2 },
				{ 9, 7, 4, 2, 8, 3, 5, 6, 1 }, { 5, 4, 7, 8, 6, 2, 1, 3, 9 }, { 6, 3, 2, 9, 4, 1, 8, 5, 7 },
				{ 1, 9, 8, 3, 7, 5, 2, 4, 6 }, { 4, 8, 3, 6, 2, 7, 9, 1, 5 }, { 7, 6, 5, 1, 9, 8, 4, 2, 3 },
				{ 2, 1, 9, 5, 3, 4, 6, 7, 8 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_HiddenPairs2Board_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs2.txt");
		board.solve();
		int[][] expecteds = { { 2, 3, 6, 5, 4, 9, 1, 8, 7 }, { 9, 7, 5, 1, 8, 6, 2, 4, 3 },
				{ 8, 4, 1, 2, 7, 3, 5, 6, 9 }, { 7, 1, 2, 4, 9, 8, 3, 5, 6 }, { 6, 8, 3, 7, 5, 2, 4, 9, 1 },
				{ 5, 9, 4, 6, 3, 1, 7, 2, 8 }, { 4, 5, 8, 3, 6, 7, 9, 1, 2 }, { 1, 6, 7, 9, 2, 4, 8, 3, 5 },
				{ 3, 2, 9, 8, 1, 5, 6, 7, 4 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_HiddenPairs3Board_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs3.txt");
		board.solve();
		int[][] expecteds = { { 5, 2, 8, 6, 3, 1, 7, 4, 9 }, { 1, 3, 6, 4, 9, 7, 8, 2, 5 },
				{ 7, 9, 4, 2, 8, 5, 6, 3, 1 }, { 4, 6, 5, 1, 7, 3, 2, 9, 8 }, { 9, 1, 7, 8, 2, 6, 3, 5, 4 },
				{ 3, 8, 2, 5, 4, 9, 1, 6, 7 }, { 2, 4, 1, 3, 5, 8, 9, 7, 6 }, { 8, 5, 9, 7, 6, 2, 4, 1, 3 },
				{ 6, 7, 3, 9, 1, 4, 5, 8, 2 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_HiddenPairs4Board_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs4.txt");
		board.solve();
		int[][] expecteds = { { 3, 7, 2, 4, 5, 8, 1, 6, 9 }, { 1, 5, 8, 9, 6, 3, 7, 2, 4 },
				{ 9, 4, 6, 1, 7, 2, 5, 8, 3 }, { 4, 2, 7, 8, 9, 6, 3, 1, 5 }, { 6, 3, 1, 5, 2, 4, 8, 9, 7 },
				{ 8, 9, 5, 3, 1, 7, 2, 4, 6 }, { 2, 1, 3, 7, 4, 9, 6, 5, 8 }, { 5, 8, 9, 6, 3, 1, 4, 7, 2 },
				{ 7, 6, 4, 2, 8, 5, 9, 3, 1 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_HiddenPairs5Board_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs5.txt");
		board.solve();
		int[][] expecteds = { { 9, 8, 3, 4, 1, 2, 6, 7, 5 }, { 7, 1, 2, 6, 5, 8, 9, 4, 3 },
				{ 5, 6, 4, 7, 3, 9, 8, 1, 2 }, { 2, 3, 8, 1, 4, 7, 5, 6, 9 }, { 1, 5, 7, 8, 9, 6, 3, 2, 4 },
				{ 6, 4, 9, 3, 2, 5, 1, 8, 7 }, { 4, 7, 1, 5, 6, 3, 2, 9, 8 }, { 8, 9, 5, 2, 7, 1, 4, 3, 6 },
				{ 3, 2, 6, 9, 8, 4, 7, 5, 1 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void SolveBoard_HiddenPairs6Board_CorrectResult() {
		Board board = new Board("res/methods/HiddenPairs6.txt");
		board.solve();
		int[][] expecteds = { { 5, 9, 6, 7, 3, 8, 1, 4, 2 }, { 2, 7, 3, 5, 1, 4, 6, 9, 8 },
				{ 4, 8, 1, 9, 6, 2, 7, 5, 3 }, { 3, 6, 2, 4, 8, 7, 9, 1, 5 }, { 8, 1, 5, 2, 9, 6, 4, 3, 7 },
				{ 9, 4, 7, 1, 5, 3, 2, 8, 6 }, { 7, 2, 9, 8, 4, 5, 3, 6, 1 }, { 1, 3, 8, 6, 7, 9, 5, 2, 4 },
				{ 6, 5, 4, 3, 2, 1, 8, 7, 9 } };
		int[][] actuals = board.getResult();

		assertArrayEquals(expecteds, actuals);
	}

}
