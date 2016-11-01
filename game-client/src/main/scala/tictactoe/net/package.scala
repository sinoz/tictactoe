package tictactoe

import java.net.SocketAddress
import java.util.concurrent.atomic.AtomicReference

import io.netty.bootstrap.Bootstrap
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioSocketChannel
import io.netty.channel.{Channel, ChannelFuture, ChannelInboundHandlerAdapter, ChannelInitializer}
import io.netty.util.concurrent.GenericFutureListener

package object net {
  /** The state of a currently established channel. */
  private val channel = new AtomicReference[Channel]()

  /** Establishes a remote socket connection with the specified socket address. */
  def connectRemote(onCompletion: Channel => Unit)(implicit address: SocketAddress) = {
    val bootstrap = new Bootstrap()
    bootstrap.channel(classOf[NioSocketChannel])
    bootstrap.connect(address).addListener(new GenericFutureListener[ChannelFuture] {
      override def operationComplete(future: ChannelFuture): Unit = {
        onCompletion(future.channel())
        channel.set(future.channel())
      }
    })
    bootstrap.group(new NioEventLoopGroup())
    bootstrap.handler(SocketChannelInitializer)
  }

  /** Drops a remote socket connection if one had been established. */
  def dropRemote(onCompletion: Unit => Unit) = Option(channel.get()) match {
    case Some(ch) => ch.close().addListener(new GenericFutureListener[ChannelFuture] {
      override def operationComplete(future: ChannelFuture): Unit = {
        onCompletion()
        channel.set(null)
      }
    })

    case None => throw new Exception()
  }

  /** Initializes socket channels by feeding default pipeline channel handlers. */
  private[net] object SocketChannelInitializer extends ChannelInitializer[SocketChannel] {
    override def initChannel(ch: SocketChannel): Unit = {
      ch.pipeline().addLast("handler", new SocketChannelHandler)
    }
  }

  /** Receives channel events and handles them. */
  private[net] final class SocketChannelHandler extends ChannelInboundHandlerAdapter {
    // TODO
  }
}
