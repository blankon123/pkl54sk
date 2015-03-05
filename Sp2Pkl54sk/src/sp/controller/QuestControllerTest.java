/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.controller;

import java.awt.CardLayout;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JViewport;
import sp.componentButton.BackminButton;
import sp.componentButton.Closebutton;
import sp.componentButton.NextButton;
import sp.componentButton.Savebutton;
import sp.model.B1;
import sp.model.B2;
import sp.model.B3;
import sp.model.B4;
import sp.panelcomponent.EntryFormQuestTest;
import sp.util.CardLayoutController;
import sp.util.FormControl;

/**
 *
 * @author M Arif Rosyanto
 */
public class QuestControllerTest {

    CardLayoutController controller;
    EntryFormQuestTest form;
    NextButton nextButton;
    BackminButton backButton;
    Closebutton closebutton;
    Savebutton savebutton;
    JButton updateBtn;
    JPanel Mainpanel;
    String hal = "hal";
    private int i = 1;
    int j = 0;
    private String state;

    public QuestControllerTest(EntryFormQuestTest form, NextButton nextButton, BackminButton backButton, Closebutton closebutton, Savebutton savebutton, JButton updateBtn, JPanel Mainpanel) {

        this.form = form;
        this.nextButton = nextButton;
        this.backButton = backButton;
        this.closebutton = closebutton;
        this.savebutton = savebutton;
        this.updateBtn = updateBtn;
        this.Mainpanel = Mainpanel;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) Mainpanel.getLayout());
        controller.setParentCard(Mainpanel);
        FormControl.init(Mainpanel, controller);

        for (int k = 0; k < Mainpanel.getComponentCount(); k++) {
            JComponent halScroll1 = (JComponent) Mainpanel.getComponent(k);
            JComponent halScroll = (JComponent) halScroll1.getComponent(0);
            setScrollListener((JPanel) halScroll.getComponent(0));
        }
        FormControl.init(Mainpanel, controller);

        updating();

        form.getH1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH1());
                form.setInactive(form.getH2(), form.getH3(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal1");
                setI(1);
            }
        });

        form.getH2().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH2());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal2");
                setI(2);
            }
        });

        form.getH3().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH3());
                form.setInactive(form.getH1(), form.getH2(), form.getH4(), form.getH5(), form.getH6());
                form.controller.show("hal3");
                setI(3);
            }
        });

        form.getH4().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH4());
                form.setInactive(form.getH1(), form.getH3(), form.getH2(), form.getH5(), form.getH6());
                form.controller.show("hal4");
                setI(4);
            }
        });

        form.getH5().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH5());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH2(), form.getH6());
                form.controller.show("hal5");
                setI(5);
            }
        });

        form.getH6().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                form.setActive(form.getH6());
                form.setInactive(form.getH1(), form.getH3(), form.getH4(), form.getH5(), form.getH2());
                form.controller.show("hal6");
                setI(6);
            }
        });

        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //controller.next();
                plus();
                if (getI() % 7 == 0) {
                    plus();

                }
                setState(hal + (getI() % 7));
                controller.show(getState());

            }
        });

        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                minus();
                if (getI() % 7 == 0) {
                    minus();
                } else if (getI() < 0) {
                    setI(6);
                }

                setState(hal + (getI() % 7));
                controller.show(getState());

            }
        });
        
        form.getErrorTable1().getTabelError().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorTable1MouseClicked(evt);
            }

            private void errorTable1MouseClicked(MouseEvent evt) {
                int baris = form.getErrorTable1().getTabelError().getSelectedRow();
                int hal = (int) form.getErrorTable1().getTabelError().getModel().getValueAt(baris, 2);
                switch (hal) {
                    case 1:
                        FormControl.getController().show("hal1");
                        break;
                    case 2:
                        FormControl.getController().show("hal2");
                        break;
                    case 3:
                        FormControl.getController().show("hal3");
                        break;
                    case 4:
                        FormControl.getController().show("hal4");
                        break;
                    case 5:
                        FormControl.getController().show("hal5");
                        break;
                    case 6:
                        FormControl.getController().show("hal6");
                        break;
                    default:
                        FormControl.getController().show("hal1");
                        break;
                }
                form.getErrDesc().setText((String) form.getErrorTable1().getTabelError().getModel().getValueAt(baris, 1));
            }
        });

    }

    public void setI() {

    }

    public void plus() {
        i++;
    }

    public void minus() {
        i--;
    }

    public void show(String name) {
        controller.show(name);

    }

    public String getCardName() {
        return getState();
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    private void setScrollListener(JPanel aThis) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().
                addPropertyChangeListener("focusOwner", new PropertyChangeListener() {

                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {

                        if (!(evt.getNewValue() instanceof JComponent)) {
                            return;
                        }

                        JViewport viewport = (JViewport) aThis.getParent();
                        JComponent focused = (JComponent) evt.getNewValue();
                        if (aThis.isAncestorOf(focused)) {
                            Rectangle rect = focused.getBounds();
                            Rectangle r2 = viewport.getVisibleRect();
                            //System.out.println(aThis);
                            aThis.scrollRectToVisible(new Rectangle(rect.x, rect.y - 300, (int) r2.getWidth(), (int) r2.getHeight()));
                        }
                    }
                });
    }

    private void updating() {
        updateBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                B1 b1 = new B1();
                B2 b2 = new B2();
                B3 b3 = new B3();
                B4 b4 = new B4();
                UpdatingController uc = new UpdatingController(b1, b2, b3, b4,
                        form.getHal11(),
                        form.getHal21(),
                        form.getHal31(),
                        form.getHal41(),
                        form.getHal51(),
                        form.getHal61(),
                        Mainpanel, form.getErrorTable1().getTabelError());
                updateBtn.addActionListener(uc);
            }
        });
    }
}
