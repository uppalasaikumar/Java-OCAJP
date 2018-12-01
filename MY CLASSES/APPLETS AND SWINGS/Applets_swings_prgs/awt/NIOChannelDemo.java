import java.io.RandomAccessFile;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
class NIOChannelDemo 
{
	public static void main(String[] args) throws IOException
	{
	RandomAccessFile aFile = new RandomAccessFile("C://5pmcore/Demo33.java", "rw");
    FileChannel inChannel = aFile.getChannel();

    ByteBuffer buf = ByteBuffer.allocate(48);

    int bytesRead = inChannel.read(buf);
    while (bytesRead != -1) {
      //System.out.println("Read " + bytesRead);
      buf.flip();
      while(buf.hasRemaining()){
          System.out.print((char) buf.get());
      }
      buf.clear();
      bytesRead = inChannel.read(buf);
    }
    aFile.close();
	}
}
