/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;


import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MYcalculator extends JFrame implements ActionListener
{
	private 
		int i,r;
		JButton jbtgrade = new JButton("GRADE");
		JButton jbttemp = new JButton("C-K");
		JButton jbtfran = new JButton("C-F");
		JButton jbtadd =new JButton("ADD");
		JButton jbtarea =new JButton("AREA_C");
		JButton jbtmoney =new JButton("FOREX");
		JButton jbttranslate =new JButton("TRANSLATE");
                JButton jbtc = new JButton("C");
		char grade;
		int marks;
		int C;
		private final int X=273,Z=32; 
			private final double P=1.8;
	private JButton buttons[];
	private JTextArea field;
	private int num[];
	String output ="";
	private String buttonText = "789/456*123-0.=+";

  private double result = 0;

  private String operator = "";

  private boolean calculating = true;
  private String b;

	private JMenuItem jmiAbout = new JMenuItem("ABOUT US");
	JMenuItem jmiClose = new JMenuItem("CLOSE");
	public MYcalculator()
	{
		num = new int[20];
		JPanel p4 = new JPanel();
    p4.setLayout(new GridLayout(4, 4));

    for (int i = 0; i < buttonText.length(); i++)
    	 {
      JButton b = new JButton(buttonText.substring(i, i + 1));
      p4.add(b);
       b.addActionListener(new ActionListener()
      {
      public void actionPerformed(ActionEvent e) 
      	{
    String cmd = e.getActionCommand();
    if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals("."))
    	 {
      if (calculating)
        field.setText(cmd);
      else
        field.setText(field.getText() + cmd);
      calculating = false;
    } 
    	else
    		 {
      if (calculating) 
      	{
        if (cmd.equals("-"))
        	 {
          field.setText(cmd);
          calculating = false;
        }
         else
          operator = cmd;
      } 
      	else 
      		{
        double x = Double.parseDouble(field.getText());
        calculate(x);
        operator = cmd;
        calculating = true;
      }
    }
  }	
      });
      
     }
     
		JMenuBar jmb = new JMenuBar();
setJMenuBar(jmb);
	JMenu fileMenu = new JMenu("FILE");
  fileMenu.setMnemonic('F');
  fileMenu.add(jmiAbout= new JMenuItem("ABOUT US", 'A'));
jmb.add(fileMenu);
jmiAbout.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
			JOptionPane.showMessageDialog(null,"BASIC CONVERTER\nDESIGNED BY SLAU SOFTWARE COPERATION\nMEET US AT NAIRO AVENUE\nSLAU@gmail.COM\nWWW.SLAU SOFT.org");
	
				}
			});	
	JMenu exitMenu = new JMenu("EXIT");
  exitMenu.setMnemonic('X');
jmb.add(exitMenu);
exitMenu.add(jmiClose = new JMenuItem("CLOSE", 'C'));
jmiClose.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e) 
 	{
System.exit(0);
}
});
	field=new JTextArea(3,28);
JPanel p1 = new JPanel(new FlowLayout());
	p1.add(field);
JPanel p2 = new JPanel(new FlowLayout());	

JPanel p3 = new JPanel(new FlowLayout());

p3.add(jbtc);
jbtc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
				{

field.setText(String.valueOf(""));
	
				}
			});	    
jbttranslate.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	if(field.getText().equals("money"))
	{
	field.setText(String.valueOf("pesa"));	
	}
		if(field.getText().equals("boy"))
	{
	field.setText(String.valueOf("mwana ume"));	
	}
		if(field.getText().equals("pen"))
	{
	field.setText(String.valueOf("kalamu"));	
	}
		if(field.getText().equals("boy"))
	{
	field.setText(String.valueOf("mwana ume"));	
	}
		if(field.getText().equals("girl"))
	{
	field.setText(String.valueOf("mwana uke"));	
	}
		if(field.getText().equals("shoes"))
	{
	field.setText(String.valueOf("viato"));	
	}
		if(field.getText().equals("president"))
	{
	field.setText(String.valueOf("rais"));	
	}
		if(field.getText().equals("posho"))
	{
	field.setText(String.valueOf("ugali"));	
	}
		if(field.getText().equals("alcohol"))
	{
	field.setText(String.valueOf("pombe"));	
	}
		if(field.getText().equals("eyes"))
	{
	field.setText(String.valueOf("macho"));	
	}
		if(field.getText().equals("computer"))
	{
	field.setText(String.valueOf("komputer"));	
	}
		if(field.getText().equals("water"))
	{
	field.setText(String.valueOf("maji"));	
	}
		if(field.getText().equals("stomach"))
	{
	field.setText(String.valueOf("tumbo"));	
	}
		if(field.getText().equals("whats your name"))
	{
	field.setText(String.valueOf("jina lako ni nani"));	
	}
		if(field.getText().equals("one"))
	{
	field.setText(String.valueOf("moja"));	
	}
		if(field.getText().equals("head"))
	{
	field.setText(String.valueOf("kichwa"));	
	}
		if(field.getText().equals("beans"))
	{
	field.setText(String.valueOf("maharagwe"));	
	}
		if(field.getText().equals("clean"))
	{
	field.setText(String.valueOf("safi"));	
	}
		if(field.getText().equals("minutes"))
	{
	field.setText(String.valueOf("ndakika"));	
	}
		if(field.getText().equals("whats the time"))
	{
	field.setText(String.valueOf("sawa nga pi"));	
	}
		if(field.getText().equals("life"))
	{
	field.setText(String.valueOf("maisha"));	
	}
		if(field.getText().equals("many"))
	{
	field.setText(String.valueOf("wingi"));	
	}
		if(field.getText().equals("game"))
	{
	field.setText(String.valueOf("mushezo"));	
	}

}	
}
);
jbtgrade.addActionListener(this);
setLayout(new BorderLayout(2,3));
				add(p1,BorderLayout.NORTH);
				add(p2,BorderLayout.EAST);
					add(p3,BorderLayout.SOUTH);
					add(p4,BorderLayout.CENTER);
					jbtmoney.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
double A,B,C,D,E,F,G;
float money;
int d;
field.setText(String.valueOf("JAVA PROGRAM TO CONVERT CURRENCIES INTO DOLLARS\nPRESS 1 FOR SHILLINGS\n PRESS 2 FOR PES\nPRESS 3 FOR CAD\nPRESS 4 FOR CHI\nPRESS 5 FOR AUS\nPRESS 6 FOR EURO\nPRESS 7 FOR RWANDA FRANC"));
String H=JOptionPane.showInputDialog(null,"PLEASE CHOOSE THE OPTION YOU WANT");
    d = Integer.parseInt(H);
String L = JOptionPane.showInputDialog(null,"Enter the ammount of money you want to convert");
money= Integer.parseInt(L);
A = (money*0.0004);
B = (money*10.8474);
C = (money*0.985);
D = (money*1.1136);
E = (money*0.710);
F = (money*1.6);
G = (money*0.0016);
switch(d)
{
case 1:
field.setText(String.valueOf("THE AMOUNT IS"+A +"DOLLARS"));
break;
case 2:
field.setText(String.valueOf("THE AMOUNT IS"+B +"DOLLARS"));
break;
case 3:
field.setText(String.valueOf("THE AMOUNT IS"+C +"DOLLARS"));
break;
case 4:
field.setText(String.valueOf("THE AMOUNT IS"+D +"DOLLARS"));
break;
case 5:
field.setText(String.valueOf("THE AMOUNT IS"+E +"DOLLARS"));
break;
case 6:
field.setText(String.valueOf("THE AMOUNT IS"+F +"DOLLARS"));
break;
case 7:
field.setText(String.valueOf("THE AMOUNT IS"+G +"DOLLARS"));
break;
default :
field.setText(String.valueOf("INVALID CODE"));
}

   	
			}	
			});
jbtadd.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
 double  A;
    double  B;
double  sum;
  String a=JOptionPane.showInputDialog(null,"ENTER THE FIRST VALUE");
    A = Integer.parseInt(a);
  String b=JOptionPane.showInputDialog(null,"ENTER THE SECOND VALUE");
    B = Integer.parseInt(b);
    sum = A+B;
     field.setText(String.valueOf ("The sum is" + sum));
   	
			}	
			});
			jbtfran.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
				int C= Integer.parseInt(field.getText());
double  F;
final int Z=32;
final double P=1.8;
F=P*C+Z;
field.setText(String.valueOf("Temp in fahreheit is"+F+"°f"));
	
				}
			});	
				
				jbttemp.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
				int C= Integer.parseInt(field.getText());
int K;
final int X=273 ;
K=X+C;
field.setText(String.valueOf("Temp in kelvin is"+K));
	
				}
			});	
						jbtarea.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
				String D =JOptionPane.showInputDialog(null,"ENTER THE RADIUS");
    int r = Integer.parseInt(D);	
double A;
final double pie=3.14 ;
A=pie*r*r;
field.setText(String.valueOf("area of a circle is"+A+"cm²"));
	
				}
			});	
		}
		public void actionPerformed(ActionEvent e)
		{
			
		int marks = Integer.parseInt(field.getText());

if(marks>=80 && marks<=100)
{
field.setText(String.valueOf("your grade is A\n\n COMMENT\n EXCELLENT"));

}
if(marks>=75 && marks<=79)
{
field.setText(String.valueOf("your grade is B+\n\n COMMENT\n VERY GOOD"));
}
if(marks>=70 && marks<=74)
{
field.setText(String.valueOf("your grade is B\n\n COMMENT\n GOOD"));
}
if(marks>=65 && marks<=69)
{
field.setText(String.valueOf("your grade is B-\n\n COMMENT\n FAIR GOOD"));
}
if(marks>=60 && marks<=64)
{
field.setText(String.valueOf("your grade is C+\n\n COMMENT\n FAIR"));
}
if(marks>=55 && marks<=59)
{
field.setText(String.valueOf("your grade is C\n\n COMMENT\n TRIED"));
}
if(marks>=50 && marks<=54)
{
field.setText(String.valueOf("your grade is C-\n\n COMMENT\n PULL UP"));
}if(marks>=0 && marks<=49)
{
field.setText(String.valueOf("your grade is F\n\n COMMENT\n WEAK\n you have to redo the paper\nRETAKE FEE-100000"));
}
if(marks<0 && marks>100)
{

field.setText(String.valueOf("NOT APPLICABLE"));	
}

		}
	 private void calculate(double n) {
    if (operator.equals("+"))
      result += n;
    else if (operator.equals("-"))
      result -= n;
    else if (operator.equals("*"))
      result *= n;
    else if (operator.equals("/"))
      result /= n;
    else if (operator.equals("="))
      result = n;
    field.setText("" + result);
  }
		public static void main(String args[])
		{
			MYcalculator frame = new MYcalculator();
			frame.setSize(400,300);
			frame.setTitle("LWANGA JOSEPH 2015");
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
		}
		
	}
