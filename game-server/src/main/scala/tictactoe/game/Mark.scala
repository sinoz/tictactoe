package tictactoe.game

/** The two possible decisions. */
case object MarkO extends Mark
case object MarkX extends Mark

sealed trait Mark
