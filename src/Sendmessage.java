
import com.sinch.xms.ApiConnection;
import com.sinch.xms.SinchSMSApi;
import com.sinch.xms.api.MtBatchTextSmsCreate;
import com.sinch.xms.api.MtBatchTextSmsResult;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;


public class Sendmessage extends JFrame implements ActionListener{
	GridBagConstraints components=new GridBagConstraints();
	JButton b[]=new JButton[10];
	JButton pls=new JButton("+");
	JButton cl=new JButton("CLEAR"),can=new JButton("CANCEL");
	JButton snd=new JButton("SEND"),et=new JButton("*"),dies=new JButton("#");
	JTextField num=new JTextField();
	JTextArea txt=new JTextArea(6,30); 
	JPanel p = (JPanel) this.getContentPane();
	
      
	public Sendmessage() {
        super("App messagerie");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      
        this.setBounds(0,0,600,600); 
        
        p.setLayout(new GridBagLayout());  
        p.setBackground(Color.white);
    	components.gridx=0;
    	components.gridy=0;  
    	components.fill=GridBagConstraints.HORIZONTAL; 
    	p.add(etiq(),components);
    	
    	components.gridx=0;
    	components.gridy=1;  
    	components.fill=GridBagConstraints.HORIZONTAL; 
    	p.add(des(),components);
    	
    	components.gridx=0;
    	components.gridy=2;  
    	components.fill=GridBagConstraints.HORIZONTAL; 
    	p.add(number(),components);
    	
    	components.gridx=0;
    	components.gridy=3;  
    	components.fill=GridBagConstraints.HORIZONTAL; 
    	p.add(msg(),components);
    	
    	components.gridx=0;
    	components.gridy=4;
    	components.fill=GridBagConstraints.HORIZONTAL;
        p.add(text(),components);
        
        components.gridx=0;
        components.gridy=5;
    	p.add(button(),components);
    	
    	components.gridx=0;
        components.gridy=6;
    	p.add(etiq1(),components);
    	
    	components.gridx=0;
        components.gridy=7;
    	p.add(etiq2(),components);
    }
	
	private Font font(int style, int size) {
    	Font font=new Font("Calibri Light",style,size);
    	return font;
    }
	
	private JPanel etiq() {
		JPanel zone=new JPanel(); 
		zone.setBackground(Color.pink);
		Label etiquette=new Label("*************Application de messagerie*************");
		etiquette.setFont(font(2,20)); 
		zone.add(etiquette );	  
        num.setPreferredSize(new Dimension(500,30));          
    	return zone;
    }
	
	private JPanel des() {
		JPanel zone=new JPanel(); 
		Label dest=new Label("Destinataire:");
		dest.setFont(font(1,15)); 
		zone.add(dest);	  
        dest.setPreferredSize(new Dimension(100,30));          
    	return zone;
    }
	
	private JPanel msg() {
		JPanel zone=new JPanel(); 
		Label b=new Label("Message:");
		b.setFont(font(1,15)); 
		zone.add(b);	  
        b.setPreferredSize(new Dimension(100,30));          
    	return zone;
    }
	
	private JPanel etiq1() {
		JPanel zone=new JPanel(); 
		zone.setBackground(Color.pink);
		Label a=new Label("***************************************************************************");
		a.setFont(font(2,20)); 
		zone.add(a);	  
        a.setPreferredSize(new Dimension(500,30));          
    	return zone;
    }
	private JPanel etiq2() {
		JPanel zone=new JPanel(); 
		zone.setBackground(Color.pink);
		Label a=new Label("************************KODADE ILHAME*******************************");
		a.setFont(font(2,18)); 
		zone.add(a);	  
        a.setPreferredSize(new Dimension(500,30));          
    	return zone;
    }
    
    private JPanel text() {    
    	JPanel zone=new JPanel();       	
    	zone.setBackground(Color.pink);
    	zone.add(txt);
    	txt.setFont(font(2,20));     
    	txt.setLineWrap(true);
    	txt.setSize(300,60);   
        JScrollPane scroll=new JScrollPane(txt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        zone.add(scroll);         
    	return zone;
    }
    
    private JPanel number() {
    	JPanel zone=new JPanel(); 
		zone.setBackground(Color.pink);
    	num=new JTextField();	  
      	zone.add(num);
        num.setPreferredSize(new Dimension(500,30));          
    	return zone;
    }
    
    private JPanel button() {
    	JPanel zone =new  JPanel();
    	zone.setSize(50,120);
    	zone.setPreferredSize(new Dimension(50,120));;
    	zone.setLayout(new GridLayout(4,4));
    	b[0]=new JButton("0");
    	b[0].setBackground(Color.lightGray);
		b[0].setFont(font(5,20)); 
		b[0].setPreferredSize(new Dimension(5,5));
		b[0].addActionListener(this);
    	for(int i=1;i<4;i++) {
    		b[i]=new JButton(""+i);
    		b[i].setBackground(Color.lightGray);
    		b[i].setFont(font(5,20)); 
    		b[i].setPreferredSize(new Dimension(5,5));
    		b[i].addActionListener(this);
    	}    
    	 
    	for(int i=4;i<7;i++) {
    		b[i]=new JButton(""+i);
    		b[i].setBackground(Color.lightGray);
    		b[i].setFont(font(5,20)); 
    		b[i].setPreferredSize(new Dimension(5,5));
    		b[i].addActionListener(this);
    	}   
    	
    	for(int i=5;i<10;i++) {
    		b[i]=new JButton(""+i);
    		b[i].setBackground(Color.lightGray);
    		b[i].setFont(font(5,20)); 
    		b[i].setPreferredSize(new Dimension(5,5));
    		b[i].addActionListener(this);
    	}   
    	    for(int i=1;i<4;i++) {
    	    	zone.add(b[i]);
    	    }zone.add(snd);
    	    for(int i=4;i<7;i++) {
    	    	zone.add(b[i]);
    	    }zone.add(can);
    	    for(int i=7;i<10;i++) {
    	    	zone.add(b[i]);
    	    }zone.add(cl);
    	    zone.add(et);
    	    zone.add(b[0]);
    	    zone.add(dies);
    	    zone.add(pls);
     
    	et.addActionListener(this);
    	dies.addActionListener(this);
    	pls.addActionListener(this);
    	can.addActionListener(this);
    	cl.addActionListener(this); 
    	snd.addActionListener(this);
    	
    	can.setFont(font(5,20));
    	can.setBackground(Color.lightGray);
    	cl.setFont(font(5,20)); 
    	cl.setBackground(Color.lightGray);
    	et.setFont(font(5,20)); 
    	et.setBackground(Color.lightGray);
    	dies.setFont(font(5,20)); 
    	dies.setBackground(Color.lightGray);
    	pls.setFont(font(5,20));
    	pls.setBackground(Color.lightGray);
    	snd.setFont(font(5,20));
    	snd.setBackground(Color.lightGray);
    	return zone;
    }
    
    public String getnum() {
    	String n= num.getText();
    	num.setText("");
    	return n;
    }
    
    public String getmsg() {
    	String msg=txt.getText();
    	txt.setText("");
    	return msg;
    }
    
    private boolean numvalid() {
    	boolean a=true;
    	if(empty()) {
    		a=false;}
    	String n=num.getText();
    	if(n.length()==13)
    	{
    		if(n.charAt(0)!='+')
    			a=false;
    	}
    	else {
    		if(n.length()!=10)  a=false;
    	}
    	return a;
    }
    
    private boolean msgvalid() {
    	String sms=txt.getText();
    	if(!sms.equals(""))
    		return true;
    	return false;
    }

    
    private boolean empty() {
    	if(num.getText().equals(" "))
    		return true;
    	return false;
    }
    
    public void actionPerformed(ActionEvent e) {  
    	num.setForeground(Color.black);
    	num.setFont(font(1, 20));
    	String n=num.getText();
    	for(int i=0;i<10;i++) {
    		if(e.getSource()==b[i])
    		{
    		    n= num.getText();
    		    if(!empty())
    		    	n+=e.getActionCommand();
    		    else
    		    	n=e.getActionCommand();
    			num.setText(n);
    		}
    	}
    	if(e.getSource()==cl&&!n.equals("")) {
    		num.setText("");
    	}
    	if(e.getSource()==pls) {
    		num.setText(e.getActionCommand());
    	}
    	if(e.getSource()==et) {
    		if(empty())
    			n=e.getActionCommand();
    		else
    			n+=e.getActionCommand();
    		num.setText(n);
    	}
    	if(e.getSource()==dies) {
    		if(empty())
    			n=e.getActionCommand();
    		else
    			n+=e.getActionCommand();
    		num.setText(n);
    	}
    	if(e.getSource()==can) {
    		
    		if(!empty())
    		{
    			n=num.getText();
        		n=n.substring(0, n.length()-1);
        		num.setText(n);           			
    		}
    	}
    	
    	if(e.getSource()==snd) {
    		if(numvalid()&&msgvalid())
    		{
    			Sender();
        		JOptionPane.showMessageDialog(this, "Message sent!","Received",JOptionPane.PLAIN_MESSAGE);
    		}
    		else
    		{
    			if(!numvalid())
    			{
    				JOptionPane.showMessageDialog(this,"False number!", "Invalid input",JOptionPane.ERROR_MESSAGE);  				
    			}    				
        		else 
        		{   
        			int choix=JOptionPane.showConfirmDialog(this, " Empty message ? Do you want to send it though ?","Non-formatted messsage",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        			if(choix==JOptionPane.YES_OPTION)
        			{
        				Sender();
        				JOptionPane.showMessageDialog(this, "Message sent","Received",JOptionPane.PLAIN_MESSAGE);
        			}
        		}
    		}	
    	
    	}
    }
   
    
    
    
    
	public void Sender() {
		final String RECIPIENTS = num.getText();
		 try (ApiConnection conn =
		        ApiConnection.builder().servicePlanId("03524d815cb44370a5395d1723f8950d").token("e4fe2deffc4243ba9459fa68b9963522").start()) {
		      // Sending a simple Text Message
		      MtBatchTextSmsResult batch =
		          conn.createBatch(
		              SinchSMSApi.batchTextSms()
		                  .sender("+447520650860")
		                  .addRecipient(RECIPIENTS)
		                  .body(txt.getText())
		                  .build());

		      System.out.println("Successfully sent batch " + batch.id());
		    } catch (Exception e) {
		      System.out.println("Batch send failed: " + e.getMessage());
		    }
		}
	
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        Sendmessage a=new Sendmessage();
        a.setSize(1000,1000);
        a.setVisible(true);
    }
}
