//Program:        PositiveMaturityApp
//Description:    Program for the Positive Maturity Application. Application has a container
//                frame and switches panels as you navigate through the menu bar located at the top
//                of the frame. The application is connected to the database through the DatabaseConnection.java file.
//                
//Author:         Jauan Davis
//Revised:        10/07/2013
//Language:       Java
//IDE:            NetBeans 7.2
//************************************************************************************************************

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;

public class PositiveMaturityApp {
    Container guiFrame;
    CardLayout cards;
    JPanel cardPanel;
 
 public PositiveMaturityApp(){
     guiFrame = new Container();
     
     //Handles application exiting when the frmae closes
     guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     guiFrame.setTitle("POSITIVE MATURITY");
     guiFrame.setSize(950,720);
     guiFrame.setResizable(false);
     
     //Application location on screen
     guiFrame.setLocationRelativeTo(null);
     guiFrame.setLayout(new BorderLayout());
     
     //Creating border for JPanels
     Border outline = BorderFactory.createLineBorder(Color.BLACK);
     
     //Creatin the menu panel and the navigation buttons which correspond to a specific card in  
     // cardpanel 
     JPanel menuPanel = new JPanel();
     menuPanel.setBorder(outline);
     JButton Home = new JButton("Home");
        Home.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                cards.show(cardPanel, "Home");
            }
        });
        menuPanel.add(Home);
     
     JButton AgencyList = new JButton("Agency List");
        AgencyList.setActionCommand("Agency List");
        AgencyList.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                cards.show(cardPanel, "Agency List");
            }
        });
        menuPanel.add(AgencyList);
                
        JButton Categories = new JButton("Categories");
        Categories.setActionCommand("Categories");
        Categories.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                cards.show(cardPanel, "Services");
            }
        });
        menuPanel.add(Categories);
        
        JButton AddtoNet = new JButton("Add to Network");
        AddtoNet.setActionCommand("Add to Network");
        AddtoNet.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                cards.show(cardPanel, "AddtoNetwork");
                
            }
        });
        menuPanel.add(AddtoNet);
        
        //Adding the menu panel to the main frame and setting its location
        guiFrame.add(menuPanel,BorderLayout.WEST);
        
        //Creating the CardLayout and the cards (panels) to flip through. As a button is pressed in the 
        //  menu panel, the corresponding card will be fliped to and displayed in the main frame. This allows
        //  for multiple panels to be displayed in the same frame. 
        cards = new CardLayout();
        cardPanel = new JPanel();
        //setting cardPanel's layout to CardLayout gives the ability to switch through a list of cards based on its name
        cardPanel.setLayout(cards);
        cards.show(cardPanel, "Home");
        
        //Panels that will be placed into the cardpanel are "cards"
        MainPanel mainpanel = new MainPanel();
        AgencyListPanel agencylist = new AgencyListPanel();
        ServicesPanel services = new ServicesPanel();
        AddtonetworkPanel addtonetwork = new AddtonetworkPanel();
        
        cardPanel.add(mainpanel, "Home");
        cardPanel.revalidate();
        cardPanel.add(agencylist, "Agency List");
        cardPanel.revalidate();
        cardPanel.add(services, "Services");
        cardPanel.revalidate();
        cardPanel.add(addtonetwork, "AddtoNetwork");
        cardPanel.revalidate();
        
        guiFrame.add(menuPanel,BorderLayout.NORTH);
        guiFrame.add(cardPanel,BorderLayout.CENTER);
        guiFrame.setVisible(true);

        
 }
 
  public static void main(String[] args) {
     
         //Use the event dispatch thread for Swing components
         EventQueue.invokeLater(new Runnable()
         {  
            
            @Override
             public void run()
             {
                 
                 new PositiveMaturityApp();         
             }
         });
              
    }//End main class
}//End Class