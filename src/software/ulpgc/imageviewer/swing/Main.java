package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.*;
import software.ulpgc.imageviewer.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        ImageViewer frame = new ImageViewer();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}