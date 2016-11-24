package tictactoe

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

/** The entry point to this game server application. */
object Server extends App {
  /** Simple name of the game. */
  val GameName = "TicTacToe"

  /** The system of actors and the supervisor actor of this application's hierarchy of actors. */
  val system = ActorSystem("tictactoe")
  val server = system actorOf(Props(new Server), "root")
}

/** The root supervisor actor within this application. */
private final class Server extends Actor with ActorLogging {
  import ServerConstants._

  /** The socket channel actor. */
  val channel = context actorOf(ServerChannel(LocalAddr), "channel")

  override def receive: Receive = {
    case message =>
      unhandled(message)
  }
}

/** A mixin that provides a collection of constants. */
object ServerConstants { // TODO throw this into a package object instead?
  val LocalAddr = new InetSocketAddress(23192)
}