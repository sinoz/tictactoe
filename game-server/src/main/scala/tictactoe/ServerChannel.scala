package tictactoe

import java.net.{InetSocketAddress, SocketAddress}

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelHandler.Sharable
import io.netty.channel.{Channel, ChannelHandlerContext, ChannelInboundHandlerAdapter, ChannelInitializer}
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import tictactoe.GameCodec.{PacketDecoder, PacketEncoder}

/** A trait to provide DSL-like functions to simplify local server channel establishments. */
trait ServerChannel {
  /** Defines a local socket address. */
  def localAddress(port: Int) = // TODO perhaps an implicit conversion here?
    new InetSocketAddress(port)

  /** Defines a new server socket channel using the given address. This is a blocking operation and
    * should only be called upon startup. */
  def newChannel(address: SocketAddress)(f: Channel => Unit): Channel = {
    val bootstrap = new ServerBootstrap()

    bootstrap.channel(classOf[NioServerSocketChannel])
    bootstrap.group(new NioEventLoopGroup())
    bootstrap.childHandler(RemoteChannelInitializer)
    bootstrap.localAddress(address)

    val channel = bootstrap.bind().sync().channel()
    f(channel)
    channel
  }
}

/** Initializes remote `SocketChannel`s by feeding them the initial pipeline `ChannelHandler`s. */
object RemoteChannelInitializer extends ChannelInitializer[SocketChannel] {
  override def initChannel(ch: SocketChannel): Unit = {
    ch.pipeline().addLast("decoder", new PacketDecoder)
    ch.pipeline().addLast("encoder", new PacketEncoder)
    ch.pipeline().addLast("handler", RemoteChannelHandler)
  }
}

/** Receives and reacts upon remote channel events. */
@Sharable private object RemoteChannelHandler extends ChannelInboundHandlerAdapter {
  @throws[Exception]
  override def channelUnregistered(ctx: ChannelHandlerContext): Unit = {
    // TODO
  }

  @throws[Exception]
  override def exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable): Unit = {
    // TODO
  }
}

/** A collection of type aliases related to Netty. */
trait NettyAliases {
  type MessageOutput = java.util.List[AnyRef]
}
