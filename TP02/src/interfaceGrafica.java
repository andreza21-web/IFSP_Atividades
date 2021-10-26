import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import java.awt.GridLayout;



public class interfaceGrafica implements ActionListener  {
    
  private List<Aluno> aluno = new ArrayList<Aluno>();

  private JFrame frame = new JFrame();

  private JLabel labelNome= new JLabel("Nome:");
  private JLabel labelIdade = new JLabel("Idade:");
  private JLabel labelEndereco = new JLabel("Endereço:");

  private JTextField fieldNome = new JTextField(10);
  private JTextField fieldIdade= new JTextField(10);
  private JTextField fieldEndereco = new JTextField(10);
  
  private JButton buttonOK  = new JButton();
  private JButton buttonClear = new JButton();
  private JButton buttonShow  = new JButton();
  private JButton buttonExit = new JButton();

  private JPanel p = new JPanel();
  private JPanel panel = new JPanel();
  private JPanel panel2 = new JPanel();

  interfaceGrafica(){

    buttonOK.setText("OK");
    buttonClear.setText("Limpar");
    buttonShow.setText("Mostrar");
    buttonExit.setText("Sair");

    buttonOK.addActionListener(this);
    buttonClear.addActionListener(this);
    buttonShow.addActionListener(this);
    buttonExit.addActionListener(this);

    // 400x180
      frame.setSize(400,180);
	    frame.setLocation(200,200);
	    frame.setTitle("TP02 - LP2l4");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
      panel.setLayout(new GridLayout(3,2,10,10));  
      panel.add(labelNome);
      panel.add(fieldNome);
      panel.add(labelIdade);
      panel.add(fieldIdade);
      panel.add(labelEndereco);
      panel.add(fieldEndereco);

      panel2.add(buttonOK);
      panel2.add( buttonClear);
      panel2.add( buttonShow);
      panel2.add(buttonExit);
      
     
      p.add(panel);
      p.add(panel2);
      frame.add(p);
      frame.setVisible(true);
   
  }  

  
  public static void main(String[] args) {
    new interfaceGrafica();

    System.out.println("Iniciou");
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    String command = event.getActionCommand();

    switch (command) {
      case "OK":
    	  aluno.add(new Aluno(fieldNome.getText(), Integer.parseInt(fieldIdade.getText()), fieldEndereco.getText()));

        fieldNome.setText("");
        fieldEndereco.setText("");
        fieldIdade.setText("");

        break;

      case "Limpar":
        fieldNome.setText("");
        fieldEndereco.setText("");
        fieldIdade.setText("");
        break;

      case "Mostrar":
        String dadosAlunos = new String();

        for (Aluno student : aluno) {

        	dadosAlunos += "Id:" + student.getUUID() + ", ";
        	dadosAlunos += "Nome:" + student.getNome() + ", ";
        	dadosAlunos += "\n";
        }

        JOptionPane.showMessageDialog(null, dadosAlunos);
        break;

      case "Sair":
        frame.dispose();
        break;
    }

  }
}