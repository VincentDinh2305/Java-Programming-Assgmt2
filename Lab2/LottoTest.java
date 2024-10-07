import javax.swing.*;
public class LottoTest 
{
    public  static  void main(String[] args)
    {
        Lotto lotto = new Lotto();
        int[] arr = lotto.getArray();
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) 
        {
            sum = sum + arr[i];
        }
        
        int num = 0;
        boolean win = false;

        for (int i = 0; i < 5 ; i++) 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
            while (num < 3 || num > 27) 
            {
                JOptionPane.showMessageDialog(null, "Please enter a number between 3 -> 27");
                num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
            }
            if (num == sum)
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You win!!!");
                win = true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please try again.");
            }
        }
        if(!win)
        {
            JOptionPane.showMessageDialog(null,"You are amazing today, just lack a bit of luck.");
        }
    }
}