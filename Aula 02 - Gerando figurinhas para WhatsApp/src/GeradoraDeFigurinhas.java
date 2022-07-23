import java.io.File;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.awt.*;;

public class GeradoraDeFigurinhas {
    public void create(InputStream inputStream, String fileName, String texto) throws Exception {
        // Ler imagem
        // InputStream inputStream = new FileInputStream(new
        // File("image/TopMovies_1.jpg"));

        // InputStream inputStream = new
        // URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage imageOriginal = ImageIO.read(inputStream);

        // Criar nova imagem com transparência e com tamanho diferente
        int width = imageOriginal.getWidth();
        int height = imageOriginal.getHeight();
        int newHeight = height + 200;

        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);
        // Copiar imagem oroginal para nova in memory
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(imageOriginal, 0, 0, null);

        // configurar texto imagem
        // var texto = "Topzera";
        var font = new Font(Font.SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);
        FontMetrics fm = graphics.getFontMetrics();
        int x = (newImage.getWidth() - fm.stringWidth(texto)) / 2;
        int y = (fm.getAscent() + (newImage.getHeight() - (fm.getAscent() + fm.getDescent())) / 2);

        // Escrever texto nova imagem
        graphics.drawString(texto, x, newHeight - 100);

        // Escrever nova imagem
        String path = "image/saida/" + fileName+".png";
        File folder = new File(path);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        ImageIO.write(newImage, "png", folder);
    }
}
