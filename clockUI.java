import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.border.Border;

public class clockUI 
{
	private int height = 500;
	private int width = 800;
	JLabel jlTimer = new JLabel();
	JPanel jpMainPanel = new JPanel();
	JFrame jfMainFrame = new JFrame(); 
	int hh =0; //hours
	int mm = 0;//minutes
	int ss = 0;//seconds
	int ms = 0;//milliseconds
	
	long start;
	 boolean stop = false;
	 	JButton jbStart = new JButton("Start");
	JButton jbStop = new JButton("Stop");
	JButton jbLap = new JButton("Lap");
	DefaultListModel<String> model = new DefaultListModel<>();


	JList<String> jlLaps = new JList<String>(model);

	
		
	
public clockUI()
{
	
		JScrollPane jspListBar = new JScrollPane();
	jspListBar.setViewportView(jlLaps);
	
	
	jlTimer.setVerticalTextPosition(JLabel.CENTER);
	jlTimer.setFont(new Font("Serif", Font.PLAIN, 50));
	
	
	jfMainFrame.setSize(width, height);
	jfMainFrame.setLayout(null);
	jpMainPanel.setLocation(75, 75);
	
	jpMainPanel.setSize(300,100);
	
	jpMainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	
	jpMainPanel.add(jlTimer);
	jfMainFrame.add(jpMainPanel);
	
	//Start button
	jbStart.setSize(100,50);
	jbStart.setLocation(20, 400);
	
	jbStart.setVisible(true);
	
	
	//Stop button
	
	jbStop.setSize(100,50);
	jbStop.setLocation(150, 400);
	
	jbStop.setVisible(true);
	
	//Lap Button 
	
	jbLap.setSize(100, 50);
	jbLap.setLocation(350, 400);
	
	jbLap.setVisible(true);
	
	jlLaps.setVisible(true);
	
	//Listbox for laps 
	
	jlLaps.setSize(250,150);
	jlLaps.setLocation(550, 20);
	
	
	//add buttons
	jfMainFrame.add(jbStart);
	jfMainFrame.add(jbStop);
	jfMainFrame.add(jbLap);	
	jfMainFrame.add(jlLaps);
//	timerStart();
	jfMainFrame.setVisible(true);

	model.addElement("Lap times stored here");
	
	jbStart.addActionListener( new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent ae) 
	    {
	
	    	timerStart(true);
	    }
	    
	}
	); //end start action listener
	
	
	
	
}


private void timerStart(boolean status)
{
	
	//int delay = 1000; //milliseconds
	
	ActionListener taskPerformer = new ActionListener() {
	    public void actionPerformed(ActionEvent evt) {
	        //...Perform a task...
	    	
	    	
	    	
	    	ms++;
	    	
	    	if (ms == 1000)
	    	{
	    			ss++;
	    			
	    			ms=0;
	    	
	    	}
	    
	    	
	    //	System.out.println(status);
	    	
	    	jlTimer.setText( hh + " : " + mm + " : "+ss + ": " + ms);
	    
	    	
	    	
	    	if (ss == 60)
	    	{
	    		ss = 0;
	    		mm++;
	    		
	    	}
	    	else 
	    		if(mm==60)
	    	{
	    		mm = 0;
	    		hh++;
	    			
	    	}
	    	
	    	
	    }
	};
	Timer timer = new Timer(0, taskPerformer);

	if(status == true)
	{
	timer.start();
	}
	
	jbStop.addActionListener( new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	     timer.stop();
	        
	    }
	}
	); //end start action listener	
	
	
	jbLap.addActionListener( new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
	     Time test = new Time(hh,mm,ss,ms);
	     
	     
	     
	     
	    String output = (test.getHours() + ":" + test.getMinutes() + " :" +
	     
	    		 test.getSeconds() + " : " + test.getmSeconds()) ;
	    
	    model.addElement(output);
	    
	    System.out.println(output);
	       
	    }
	}
	); //end start action listener	
	
	jfMainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}



		
}


	

