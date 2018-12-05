/* Author: MacAnthony Ahaotu */
import javax.swing.*;

public class Atm
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "WELCOME TO GARANTEE TRUST BANK");
		Pin c3 = new Pin();
	}
}

	class Pin
{
	static int pin;

	public Pin()
	{
		pin = Integer.parseInt(JOptionPane.showInputDialog("INPUT YOUR PIN"));
		if (pin == 1234)
		{
			WithDrawal1 c1 = new WithDrawal1();
		}
		else if (pin == 1111)
		{
			WithDrawal2 c1 = new WithDrawal2();
		}
		else if (pin == 2222)
		{
			WithDrawal3 c1 = new WithDrawal3();
		}
		else if (pin == 3456)
		{
			WithDrawal4 c1 = new WithDrawal4();
		}
		else if (pin == 2345)
		{
			WithDrawal5 c1 = new WithDrawal5();
		}
		else if (pin == 3333)
		{
			WithDrawal6 c1 = new WithDrawal6();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please Input The Correct Pin", "Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "      TAKE YOUR CARD");
		}
	}

}

class WithDrawal1
{	
	static int mycheck;
	static int mychoice;
	static int myamount;
	public WithDrawal1()
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. AHAOTU MACANTHONY C.", "By MACANTHONY", JOptionPane.PLAIN_MESSAGE);
		mycheck = 199900000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 199900000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal", "Error", JOptionPane.ERROR_MESSAGE);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
		{
			JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
			int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION)
			{
				Pin pin = new Pin();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
			int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
			if (response == JOptionPane.YES_OPTION)
			{
				Pin pin = new Pin();
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
			}
		}
	}
}

 class WithDrawal2
{
	static int mycheck;
	static int mychoice;
	static int myamount;
	public WithDrawal2()
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. NWOSU KELECHI A.", "By MACANTHONY",JOptionPane.PLAIN_MESSAGE);
		mycheck = 1000000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 100000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int dialogresult = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if ( dialogresult == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. NWOSU KELECHI A.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal",  "Error", JOptionPane.ERROR_MESSAGE );
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
			{
				JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. NWOSU KELECHI A.");
					}
			}
		else
			{ 
				JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
				int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. NWOSU KELECHI A.");
					}
			}
	}
}

 class WithDrawal3
{
	static int mycheck;
	static int mychoice;
	static int myamount;
	
	public WithDrawal3()
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. ADEWALE DAMILOLA D.", "By MACANTHONY",JOptionPane.PLAIN_MESSAGE);
		mycheck = 100000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 10000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int dialogresult = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if ( dialogresult == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADEWALE DAMILOLA D.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal",  "Error", JOptionPane.ERROR_MESSAGE );
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
			{
				JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADEWALE DAMILOLA D.");
					}
			}
		else
			{ 
				JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
				int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADEWALE DAMILOLA D.");
					}
			}
	}
}

 class WithDrawal4
{
	static int mycheck;
	static int mychoice;
	static int myamount;

	public WithDrawal4() 
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MISS. MONDAY EMEM P.", "By MACANTHONY",JOptionPane.PLAIN_MESSAGE);
		mycheck = 10000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 1000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int dialogresult = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if ( dialogresult == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MISS. MONDAY EMEM P.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal",  "Error", JOptionPane.ERROR_MESSAGE );
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
			{
				JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MISS. MONDAY EMEM P.");
					}
			}
		else
			{ 
				JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
				int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MISS. MONDAY EMEM P.");
					}
			}
	}
}

	class WithDrawal5
{	
	static int mycheck;
	static int mychoice;
	static int myamount;
	
	public WithDrawal5()
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. IDOWU IBRAHIM A.", "By MACANTHONY",JOptionPane.PLAIN_MESSAGE);
		mycheck = 1000000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 100000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int dialogresult = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if ( dialogresult == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. IDOWU IBRAHIM A.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal",  "Error", JOptionPane.ERROR_MESSAGE );
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
			{
				JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. IDOWU IBRAHIM A.");
					}
			}
		else
			{ 
				JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
				int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. IDOWU IBRAHIM A.");
					}
			}
	}
}

 class WithDrawal6
{
	static int mycheck;
	static int mychoice;
	static int myamount;

	public WithDrawal6()
	{
		JOptionPane.showMessageDialog(null, "\n WELCOME MR. ADELEYE ABDULLATEEF O.", "By MACANTHONY",JOptionPane.PLAIN_MESSAGE);
		mycheck = 5000000;
		mychoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Withdrawal \n 2. Check Balance"));
		if (mychoice == 1)
		{
			String amount = JOptionPane.showInputDialog(null, "PLEASE ENTER THE AMOUNT");
			myamount = Integer.parseInt(amount);
			int myremain = mycheck - myamount;
			JOptionPane.showMessageDialog(null, "The Amount You Entered is " + amount);
			if (myamount <= 100000000)
			{
				JOptionPane.showMessageDialog(null, "Please Wait Your Transcation Is In Processing");
				JOptionPane.showMessageDialog(null, "Please Take Your Cash");
				JOptionPane.showMessageDialog(null, "Your Available Balance is " + myremain);
				int dialogresult = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if ( dialogresult == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADELEYE ABDULLATEEF O.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, " Sorry You Do Not Have Enough Balance To Make This Withdrawal",  "Error", JOptionPane.ERROR_MESSAGE );
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					Pin pin = new Pin();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. AHAOTU MACANTHONY C.");
				}
			}
		}
		else if(mychoice == 2)
			{
				JOptionPane.showMessageDialog(null, "Your Account Balance Is " + mycheck);
				int reply = JOptionPane.showConfirmDialog(null, "Do You Want To Perform Another Transaction", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
					{
						JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADELEYE ABDULLATEEF O.");
					}
			}
		else
			{ 
				JOptionPane.showMessageDialog(null, "Please Input The Correct Number", "Error", JOptionPane.ERROR_MESSAGE);
				int response = JOptionPane.showConfirmDialog(null, "Do You Want To Try Again", "By MacAnthony", JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION)
					{
						Pin pin = new Pin();
					}
				else 
				{
					JOptionPane.showMessageDialog(null, "Thanks And Have A Nice Day MR. ADELEYE ABDULLATEEF O.");
				}
			}
	}
}
