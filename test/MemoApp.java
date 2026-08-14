import java.awt.*;
import java.awt.event.*;

public class MemoApp extends Frame {
    private TextField textField;
    private TextArea textArea;

    public MemoApp() {
        setTitle("메모 앱");
        setBounds(300, 500, 300, 500);
        setLayout(new BorderLayout(5, 5));

        Panel topPanel = new Panel(new BorderLayout(5, 5));
        textField = new TextField();
        Button confirmButton = new Button("확인");

        topPanel.add(textField, BorderLayout.CENTER);
        topPanel.add(confirmButton, BorderLayout.EAST);

        textArea = new TextArea();
        textArea.setEditable(false);

        add(topPanel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);

        confirmButton.addActionListener(e -> {
            String text = textField.getText();
            if (!text.isEmpty()) {
                textArea.append(text + "\n");
                textField.setText("");
            }
        });

        textField.addActionListener(e -> confirmButton.doClick());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MemoApp();
    }
}
