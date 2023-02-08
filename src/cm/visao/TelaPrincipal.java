package cm.visao;

import javax.swing.JFrame;

import br.com.Yago.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal  extends JFrame{
	
	public TelaPrincipal() {
		
		
		Tabuleiro tabuleiro = new Tabuleiro (16,30,50);
		add(new PainelTabuleiro(tabuleiro));
				
		setTitle("Campo Minado"); // titulo da tela
		setSize(690,438);// tamanho da tela
		setLocationRelativeTo(null); //centraliza a tela
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
