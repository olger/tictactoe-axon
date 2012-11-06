package cqrs.workshop.tictactoe.api


object Events {

  /**
   * positions: a string of 9 "X", "O" and " " characters
   */
  abstract class GameEvent(gameId: String)

  case class GameCreatedEvent(
    gameId: String,
    playerX: String,
    playerO: String,
    positions: String
  ) extends GameEvent(gameId)

  // property 'winner': null when the game is still going, "draw" when the game ended in a draw, otherwise equal to property 'player'
  case class GameMoveEvent(
    gameId: String,
    player: String,
    move: Int,
    positions: String,
    winner: String
  ) extends GameEvent(gameId)

}
