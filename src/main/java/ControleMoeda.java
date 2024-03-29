import javax.swing.*;
import java.text.DecimalFormat;

public class ControleMoeda {
    DecimalFormat df = new DecimalFormat();

    public ControleMoeda(){
        df.applyPattern("#,##0.00");

        Double valor = null;
        Double resultado = null;
        try {
            String[] moeda = {"Dólar para Real", "Euro para Real", "Libra Esterlina para Real",
                    "Peso Argentino para Real", "Peso Chileno para Real", "Real para Dólar", "Real para Euro",
                    "Real para Libra Esterlina", "Real para Peso Argentino", "Real para Peso Chileno" };


            String moedas = JOptionPane.showInputDialog(null, "Escolha a moeda para converter:", "Conversor de Controle Moeda",
                    JOptionPane.PLAIN_MESSAGE, null, moeda, null).toString();
            String input = JOptionPane.showInputDialog("Digite seu Valor:");
            valor = Double.parseDouble(input);
            ValoresMoeda converterMoeda = new ValoresMoeda();
            switch (moedas) {
                case "Dólar para Real": {
                    resultado = converterMoeda.converterDolarEmReal(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"R$");
                }break;

                case "Euro para Real": {
                    resultado = converterMoeda.converterEuroEmReal(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"R$");
                }break;

                case "Libra Esterlina para Real": {
                    resultado = converterMoeda.converterLibraEsterlinaEmReal(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"R$");
                }break;

                case "Peso Argentino para Real": {
                    resultado = converterMoeda.converterPesoArgentinoEmReal(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"R$");
                }break;

                case "Peso Chileno para Real": {
                    resultado = converterMoeda.converterPesoChilenoEmReal(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"R$");
                }break;

                case "Real para Dólar": {
                    resultado = converterMoeda.converterRealEmDolar(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"$");
                }break;

                case "Real para Euro": {
                    resultado = converterMoeda.converterRealEmEuro(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"€");
                } break;

                case "Real para Libra Esterlina":{
                    resultado = converterMoeda.converterRealEmLibraEsterlina(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"£");
                }break;

                case "Real para Peso Argentino": {
                    resultado = converterMoeda.converterRealEmPesoArgentino(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"(ARS)");
                }break;

                case "Real para Peso Chileno": {
                    resultado = converterMoeda.converterRealEmPesoChileno(valor);
                    JOptionPane.showMessageDialog(null, df.format(resultado)+"(CLP)");
                }break;

                default:
                    break;
            }

        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você não digitou um número", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        finally {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outra conversão?");
            if(resposta == JOptionPane.YES_OPTION) {
                Main principal = new Main();
                principal.loop();
            }else{
                JOptionPane.showMessageDialog(null, "obrigado, ate mais!");
            }

        }
    }
}