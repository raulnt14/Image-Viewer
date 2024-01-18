package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.ImageDisplay;

import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JFrame {

    public ImageViewer()  {
        this.setTitle("Image Viewer");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
