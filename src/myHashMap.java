import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class myHashMap 
{
	
	public static HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	
	public static HashMap<Character, Integer> buildMap(String s)
	{
		String str = s;
		
		for(int i = 0; i < s.length(); i++)
		{
			
			char c = str.charAt(i);
			Integer count = hashMap.get(new Character(c));
			if(count != null)
			{
				hashMap.put(c, count+1);
			}
			else
			{
				hashMap.put(c, 1);
			}
			
		}
		
		
		
		return hashMap;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		
		final JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		JPanel north = new JPanel();
		JPanel south = new JPanel();
		
		final JTextField field = new JTextField();
		
		JButton button = new JButton("Submit");
		
		button.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				String input = field.getText();
				buildMap(input);
				System.out.print(hashMap);
				frame.dispose();
				
			}
			
		});
		
		frame.setPreferredSize(new Dimension(300, 300));
		field.setPreferredSize(new Dimension(150, 50));
		
		north.add(field);
		south.add(button);
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(south, BorderLayout.SOUTH);
		
		String string = field.getText();
		frame.pack();
		frame.setVisible(true);
		
		buildMap(string);
		
		
		
		
	}

}
