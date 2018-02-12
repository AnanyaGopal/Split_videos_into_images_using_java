import java.io.*;
/**
 * 
 * @author uday.p
 *
 */
public class SplitIntoFrames {
    public static void main(String[] args)throws Exception {
       Process p=Runtime.getRuntime().exec("ffmpeg -i videoplayback.mp4 -acodec copy -vcodec copy -ss 0 -t 00:15:00 OUTFILE-1.mp4");
       int i=p.waitFor();
	System.out.println("The status of the video is "+i);
	}
}
	
