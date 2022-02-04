import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SignUp extends Frame implements ActionListener, WindowListener {
    TextField textName;
    TextField textGender;
    TextField textMail;
    TextField textNumber;

    public static void main(String[] args) {
        new SignUp();

    }

    SignUp() {

        addWindowListener(this);
        setSize(800, 600);
        setLayout(new GridLayout(6, 1));
        setVisible(true);
        setTitle("Sign Up");

        Panel panelTitle = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        Panel panelName = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        Panel panelGender = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        Panel panelMail = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        Panel panelNo = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        Panel panelSubmit = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 20));

        Color c1 = new Color(201, 201, 201);

        Label title = new Label("Sign Up", 1);
        Label name = new Label("Name   : ", 2);
        Label gender = new Label("Gender  : ", 2);
        Label email = new Label("Email   : ", 2);
        Label phone = new Label("Phone   : ", 2);

        Button submit = new Button("Submit");

        textName = new TextField(10);
        textGender = new TextField(10);
        textMail = new TextField(10);
        textNumber = new TextField(10);

        textName.setBackground(c1);
        textGender.setBackground(c1);
        textMail.setBackground(c1);
        textNumber.setBackground(c1);

        submit.addActionListener(this);

        panelTitle.add(title);
        panelName.add(name);
        panelName.add(textName);
        panelGender.add(gender);
        panelGender.add(textGender);
        panelMail.add(email);
        panelMail.add(textMail);
        panelNo.add(phone);
        panelNo.add(textNumber);
        panelSubmit.add(submit);

        add(panelTitle);
        add(panelName);
        add(panelGender);
        add(panelMail);
        add(panelNo);
        add(panelSubmit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("\nSign Up Details :  \n\n");
        System.out.println("Name         : " + textName.getText());
        System.out.println("Age          : " + textGender.getText());
        System.out.println("Email        : " + textMail.getText());
        System.out.println("Phone number : " + textNumber.getText());
        System.out.print("\n");
        textGender.setText("");
        textMail.setText("");
        textName.setText("");
        textNumber.setText("");

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}