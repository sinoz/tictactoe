package tictactoe

/** The entry point to this game server application. */
object Server extends App with ServerChannel {
  /** Simple name of the game. */
  val GameName = "TicTacToe"

  /** The default local socket address. */
  val LocalAddress = localAddress(23192)

  /** The game internally inside of an `ActorSystem`. */
  val game = Game.newGame("GameName")

  /** The local hosted server channel. */
  val serverChannel = newChannel(LocalAddress) { channel =>
    // TODO: logging?
  }

  /** Terminates this game server application. */
  def terminate() =
    serverChannel.close()
}
