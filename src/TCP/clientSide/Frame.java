package TCP.clientSide;

import events.Event;
import events.SimpleEvent;

public class Frame extends javax.swing.JFrame {


    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bathroomManager;
    private javax.swing.JLabel currentBathroomState;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextField ipTextbox;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextbox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextbox;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField portTextbox;
    private javax.swing.JButton returnedButton;


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

    public Frame() {
        initComponents();
    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        nameTextbox = new javax.swing.JTextField();
        ipTextbox = new javax.swing.JTextField();
        portTextbox = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextbox = new javax.swing.JTextField();
        bathroomManager = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        returnedButton = new javax.swing.JButton();
        currentBathroomState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 255));
        background.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(204, 204, 255));

        nameLabel.setText("Name");

        ipLabel.setText("IP");

        portLabel.setText("Port");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel)
                                    .addComponent(ipLabel))
                                .addGap(18, 18, 18)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(portLabel)
                                    .addComponent(passwordLabel)
                                    .addComponent(passwordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(ipTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(portTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(enterButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipLabel)
                    .addComponent(portLabel))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addGap(47, 47, 47))
        );

        background.add(menu, "card3");

        bathroomManager.setBackground(new java.awt.Color(204, 204, 255));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        returnedButton.setText("Returned");
        returnedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnedButtonActionPerformed(evt);
            }
        });

        currentBathroomState.setText("null");

        javax.swing.GroupLayout bathroomManagerLayout = new javax.swing.GroupLayout(bathroomManager);
        bathroomManager.setLayout(bathroomManagerLayout);
        bathroomManagerLayout.setHorizontalGroup(
            bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomManagerLayout.createSequentialGroup()
                .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnedButton)
                            .addComponent(addButton)))
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(currentBathroomState, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        bathroomManagerLayout.setVerticalGroup(
            bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(49, 49, 49)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(currentBathroomState)
                .addGap(26, 26, 26)
                .addComponent(returnedButton)
                .addGap(84, 84, 84))
        );

        background.add(bathroomManager, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        bathroomManager.setVisible(false);
        menu.setVisible(true); 
    }

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        startClient();
        menu.setVisible(false);
        bathroomManager.setVisible(true); 
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sendMessage("add:" + nameTextbox.getText());
    }

    private void returnedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sendMessage("returned:" + nameTextbox.getText());
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    public void startClient(){
        Client client = new Client(ipTextbox.getText(), Integer.parseInt(portTextbox.getText()));

        client.stringReceivedEvent().addListener(
            stringReceivedFromServer -> {
                currentBathroomState.setText(stringReceivedFromServer);
        });

        client.start();
        sendMessage("name:" + nameTextbox.getText() + ":" + passwordTextbox.getText());
    }

    /**
     * sends the string to the server
     * @param s
     */
    private static void sendMessage(String s){
        sendStringEvent().trigger(s);
    }
}
