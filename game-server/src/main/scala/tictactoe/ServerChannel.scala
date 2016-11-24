package tictactoe

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorLogging, Props}
import akka.io.Tcp.{Bind, Bound}
import akka.io.{IO, Tcp}

object ServerChannel {
  def apply(address: InetSocketAddress) =
    Props(new ServerChannel(address))
}

/** The game server socket channel bounded to the class injected local address and listens
  * for incoming connections and data to process. */
private final class ServerChannel(address: InetSocketAddress) extends Actor with ActorLogging {
  import context.system

  override def preStart(): Unit = {
    IO(Tcp) ! Bind(self, address)
  }

  override def receive: Receive = {
    case Bound(local) =>
      log.info(s"Bound at $local")

    case message =>
      unhandled(message)
  }
}
