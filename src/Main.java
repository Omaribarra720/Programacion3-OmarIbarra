import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ventana ventana= new Ventana();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numbers frame = new Numbers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}