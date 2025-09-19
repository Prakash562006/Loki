import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThemeSwitcher extends JFrame {
    private boolean isDark = false;

    public ThemeSwitcher() {
        setTitle("Theme Toggle");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton toggleButton = new JButton("Toggle Theme");

        toggleButton.addActionListener(e -> toggleTheme());

        add(toggleButton, BorderLayout.CENTER);
        setLightTheme(); // Start with light
        setVisible(true);
    }

    private void toggleTheme() {
        if (isDark) {
            setLightTheme();
