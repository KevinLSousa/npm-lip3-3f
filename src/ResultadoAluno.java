import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		int x = 6;
		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "M�dia"));
		
		if( media > x ) {
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		
		else{
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
		
	}

}
