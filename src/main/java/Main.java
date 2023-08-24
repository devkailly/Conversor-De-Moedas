import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame {

    public static void main(String[] args) {
        String[] opcoes = {"Conversor de Valores Moeda", "Conversor de Valores Temperatura",};

        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
                JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
        if (type == "Conversor de Valores Moeda"){
            new ControleMoeda();
        }else if (type == "Conversor de Valores Temperatura"){
            new ValoresTemperatura();
        }
    }
    public void loop(){
        String[] opcoes = {"Conversor de Valores Moeda", "Conversor de Valores Temperatura"};

        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
                JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
        if (type == "Conversor de Valores Moeda"){
            new ControleMoeda();
        }else if (type == "Conversor de Valores Temperatura"){
            new ValoresTemperatura();
        }


    }

}