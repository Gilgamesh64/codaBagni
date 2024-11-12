package TCP.clientSide;

import events.Event;
import events.SimpleEvent;

/**
 *
 * @author Gabriele Urban
 */
public class BathroomManagerGUI extends javax.swing.JPanel {
    private javax.swing.JButton Add;
    private javax.swing.JButton Returned;
    private javax.swing.JTextField Request;
    private javax.swing.JLabel Requestlabel; 
    private javax.swing.JLabel CurrentBathroomLabel; 

    //event to trigger if you want to send a string via the socket
    private static final Event<String> sendString = new SimpleEvent<>();

    /**
     * example: sendStringEvent().trigger("foo")
     * sends foo to every actionListener
     * @return triggerable event
     */
    public static Event<String> sendStringEvent() {
        return sendString;
    }
    

    public BathroomManagerGUI() {
        Client client = new Client("localhost", 5050);

        client.stringReceivedEvent().addListener(
            stringReceivedFromServer -> {
                CurrentBathroomLabel.setText(stringReceivedFromServer);
        });

        client.start();

        initComponents();
    }
    
    private void initComponents() {

        Add = new javax.swing.JButton();
        Returned = new javax.swing.JButton();
        Request = new javax.swing.JTextField();
        Requestlabel = new javax.swing.JLabel();
        CurrentBathroomLabel = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(390, 235));

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Returned.setText("Returned");
        Returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnedActionPerformed(evt);
            }
        });

        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });

        Requestlabel.setText("NAME");
        CurrentBathroomLabel.setText("NULL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(Requestlabel)
                                    .addComponent(Request)
                                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Returned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CurrentBathroomLabel)))
                                .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGap(72, 72, 72)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(218, 218, 218)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Requestlabel)
                .addComponent(Request, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGap(18, 18, 18)
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addComponent(Returned)
                .addGap(18, 18, 18)
                .addComponent(CurrentBathroomLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        String s = Request.getText();
        sendMessage("add " + s);
    }
    private void ReturnedActionPerformed(java.awt.event.ActionEvent evt) {
        sendMessage("back");
    }

    /**
     * sends the string to the server
     * @param s
     */
    private static void sendMessage(String s){
        
        sendStringEvent().trigger(s);
    }
}