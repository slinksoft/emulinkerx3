package org.emulinker.kaillera.model.event;

import org.emulinker.kaillera.model.KailleraGame;

public class GameStartedEvent implements GameEvent
{
	private KailleraGame	game;

	public GameStartedEvent(KailleraGame game)
	{
		this.game = game;
	}

	public String toString()
	{
		return "GameStartedEvent";
	}

	public KailleraGame getGame()
	{
		return game;
	}
}
