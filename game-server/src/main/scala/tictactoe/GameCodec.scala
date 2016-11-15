package tictactoe

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.{ByteToMessageDecoder, MessageToByteEncoder}

/** Contains codecs related to game networking. */
object GameCodec {
  final class PacketDecoder extends ByteToMessageDecoder with NettyAliases {
    override def decode(ctx: ChannelHandlerContext, in: ByteBuf, out: MessageOutput): Unit = {
      // TODO
    }
  }

  final class PacketEncoder extends MessageToByteEncoder[Packet] {
    override def encode(ctx: ChannelHandlerContext, msg: Packet, out: ByteBuf): Unit = {
      out.writeByte(msg.id)
      out.writeByte(msg.payload.readableBytes())
      out.writeBytes(msg.payload)
    }
  }

  case class Packet(id: Int, payload: ByteBuf)
}
