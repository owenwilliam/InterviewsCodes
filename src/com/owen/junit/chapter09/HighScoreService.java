package com.owen.junit.chapter09;

import java.util.List;

public interface HighScoreService
{
	List<String> getTopFivePlayers();

	boolean saveHighScore(int score, String playerName);
}
