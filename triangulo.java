import javax.swing.JOptionPane;
class triangulo {
	public static void main (String args[]) {

		int a,b,c;

		a=Integer.parseInt(JOptionPane.showInputDialog("Lado A"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Lado B"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Lado C"));

		if(a!=0&&b!=0&&c!=0)
		{
			if (a+b>c&&a+c>b&&b+c>a)
			{
				if (a!=b&&a!=c&&b!=c)
				{
					JOptionPane.showMessageDialog(null,"Escaleno");
				}
					else

					{
						if (a==b&&b==c)
						{
							JOptionPane.showMessageDialog(null,"Equil�tero");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Is�celes");
						}

					}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"N�o forma um tri�ngulo");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"N�o forma um tri�ngulo");
		}
	}
}