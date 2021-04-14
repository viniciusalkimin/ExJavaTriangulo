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
							JOptionPane.showMessageDialog(null,"Equilátero");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Isóceles");
						}

					}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Não forma um triângulo");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Não forma um triângulo");
		}
	}
}