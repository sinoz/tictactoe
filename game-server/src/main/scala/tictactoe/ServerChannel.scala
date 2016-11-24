package tictactoe

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorLogging, ActorRef, Props}
import akka.io.Tcp.{Bind, Bound, Connected, Register}
import akka.io.{IO, Tcp}

object ServerChannel {
  def apply(address: InetSocketAddress, game: ActorRef) =
    Props(new ServerChannel(address, game))
}

/** The game server socket channel bounded to the class injected local address and listens
  * for incoming connections and data to process. */
private final class ServerChannel(address: InetSocketAddress, game: ActorRef) extends Actor with ActorLogging {
  import context.system

  override def preStart(): Unit = {
    IO(Tcp) ! Bind(self, address)
  }

  override def receive: Receive = {
    case Bound(local) =>
      log.info(s"Bound at $local")

    case Connected(remote, local) =>
      val channelHandler = context actorOf PlayerChannel(game)
      sender() ! Register(channelHandler)

    case message =>
      unhandled(message)
  }
}
