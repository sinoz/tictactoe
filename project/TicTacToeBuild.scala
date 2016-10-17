import sbt._

object TicTacToeBuild extends Build {
  lazy val client = Project(id = "game-client", base = file("game-client"))
  lazy val server = Project(id = "game-server", base = file("game-server"))

  lazy val root = Project(id = "tictactoe", base = file(".")) aggregate(client, server)
}