package imageModifier;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageTools {

	public static int RGBToHex(int redCode, int greenCode, int blueCode) {
		return Integer.parseInt(String.format("%02x%02x%02x", redCode, greenCode, blueCode));
	}

	public static int RGBToHex(RGBIndex rgbIndex) {
		return RGBToHex(rgbIndex.getRed(), rgbIndex.getGreen(), rgbIndex.getBlue());
	}

	/*
	 * use the bufferedImage to save
	 * 
	 * @param data
	 * 
	 * @param path : the path you want to save the image
	 * 
	 * @param name : the name you want to save
	 */
	public static void saveImage(BufferedImage data, String path, String name) throws IOException {
		try {
			FileOutputStream out = new FileOutputStream(path + "\\" + name);
			ImageIO.write(data, "jpg", out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * change to image type to buffered bufferedImage
	 * 
	 * @param img
	 */
	public static BufferedImage toBufferedImage(Image img) {
		if (img instanceof BufferedImage) {
			return (BufferedImage) img;
		}

		// Create a buffered image with transparency
		BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		// Draw the image on to the buffered image
		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(img, 0, 0, null);
		bGr.dispose();

		// Return the buffered image
		return bimage;
	}

}
