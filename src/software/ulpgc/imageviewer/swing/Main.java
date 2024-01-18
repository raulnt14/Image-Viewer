package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.*;

public class Main {
    public static void main(String[] args) {
        ImageViewer frame = new ImageViewer();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        frame.setVisible(true);
    }
}