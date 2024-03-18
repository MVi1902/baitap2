package baitap2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Chạy SimpleNotepad
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleNotepad();
            }
        });
        FileManipulationExample.main(args);
    }
}
