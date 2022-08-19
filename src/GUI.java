import javax.swing.JOptionPane;

public class GUI {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age ?"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
    }
}
