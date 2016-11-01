package tictactoe.net

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.{ByteToMessageDecoder, MessageToByteEncoder}

/** A companion object that contains all of the codecs related to login messages. */
object LoginCodec {
  case class LoginRequest(username: String, password: String)
  case class LoginResponse(responseCode: Int)

  type Ctx = ChannelHandlerContext
  type Buffer = ByteBuf
  type Output = java.util.List[AnyRef]

  final class LoginRequestEncoder extends MessageToByteEncoder[LoginRequest] {
    override def encode(ctx: Ctx, msg: LoginRequest, out: Buffer): Unit = {
      out.writeCString(msg.username)
      out.writeCString(msg.password)
    }
  }

  final class LoginResponseDecoder extends ByteToMessageDecoder {
    override def decode(ctx: Ctx, in: Buffer, out: Output): Unit = {
      (in.readableBytes() compare 1) signum match {
        case 0 | 1 => out.add(LoginResponse(in.readUnsignedByte()))
        case -1 => // nothing
      }
    }
  }
}
