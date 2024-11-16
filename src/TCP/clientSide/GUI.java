package TCP.clientSide;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import events.Event;
import events.SimpleEvent;

public class GUI extends JFrame {

    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bathroomManager;
    private javax.swing.JLabel currentOutLabel;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextField ipTextbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
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

    public GUI() {
        initComponents();
    }

    private void initComponents() {

        menu = new javax.swing.JPanel();
        enterButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextbox = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextbox = new javax.swing.JTextField();
        ipLabel = new javax.swing.JLabel();
        ipTextbox = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        portTextbox = new javax.swing.JTextField();
        bathroomManager = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        returnedButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        currentOutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(204, 204, 255));

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        passwordLabel.setText("Password");

        ipLabel.setText("IP");

        portLabel.setText("Port");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel)
                            .addComponent(ipLabel)
                            .addComponent(ipTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(passwordLabel)
                                .addGap(128, 128, 128))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(portLabel)
                                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                        .addComponent(portTextbox)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(enterButton)
                        .addContainerGap())))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portLabel)
                    .addComponent(ipLabel))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addGap(48, 48, 48))
        );

        getContentPane().add(menu, "card2");

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

        jScrollPane1.setViewportView(list);

        currentOutLabel.setText("Coda vuota");

        javax.swing.GroupLayout bathroomManagerLayout = new javax.swing.GroupLayout(bathroomManager);
        bathroomManager.setLayout(bathroomManagerLayout);
        bathroomManagerLayout.setHorizontalGroup(
            bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomManagerLayout.createSequentialGroup()
                .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bathroomManagerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton))
                            .addGroup(bathroomManagerLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(returnedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(73, 73, 73))
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bathroomManagerLayout.setVerticalGroup(
            bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bathroomManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bathroomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bathroomManagerLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(48, 48, 48)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(returnedButton)
                        .addGap(42, 42, 42)
                        .addComponent(currentOutLabel)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bathroomManagerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        getContentPane().add(bathroomManager, "card4");

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

    private void returnedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sendMessage("returned:" + nameTextbox.getText());
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sendMessage("add:" + nameTextbox.getText());
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    public void startClient(){
        Client client = new Client(ipTextbox.getText(), Integer.parseInt(portTextbox.getText()));

        client.stringReceivedEvent().addListener(
            stringReceivedFromServer -> {
                if(!stringReceivedFromServer.equals("Coda Vuota")){
                    String[] temp = stringReceivedFromServer.split(",");
                    list.setListData(temp);
                    currentOutLabel.setText("Turno di: " + temp[0]);
                }
                else{
                    currentOutLabel.setText(stringReceivedFromServer);
                    list.setListData(new String[]{""});
                } 
        });

        client.start();
        sendMessage("name:" + nameTextbox.getText() + ":" + passwordTextbox.getText());
        sendMessage("get");
    }

    /**
     * sends the string to the server
     * @param s
     */
    private static void sendMessage(String s){
        sendStringEvent().trigger(s);
    }
}
