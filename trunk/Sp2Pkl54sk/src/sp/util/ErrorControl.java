/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import sp.component.TextField;
import sp.model.Error;
import sp.model.TableErrorModel;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class ErrorControl {

    private static List<Error> errList;
    private static JTable errTab;
    private static TableErrorModel model;

    static {
        errList = new ArrayList<>();
        errTab = new JTable();
    }

    public static void setErrList(List<Error> errList) {
        ErrorControl.errList = errList;
    }

    public static JTable getErrTab() {
        return errTab;
    }

    public static void setErrTab(JTable errTab) {
        ErrorControl.errTab = errTab;
    }

    public static void setError(String code, String desc, int page) {
        Error e = new Error(code, desc, page);
        errList.add(e);
        TableErrorModel temp = new TableErrorModel();
        temp.setData(errList);
        errTab.setModel(temp);
    }

    public static Error getError(int index) {
        return errList.get(index);
    }

    public static void enlistErr(List<TextField> list, int page) {
        for (TextField tf : list) {
            if (tf.getValid() == false) {
                setError(tf.getName(), tf.getText(), page);
            }
        }
        model = new TableErrorModel();
        model.setData(errList);
        errTab.setModel(model);
    }

    public static List<Error> getErrList() {
        return errList;
    }

    public static TableErrorModel getTableRow() {
        return model;
    }
    
    public static void resetErr(){
        errList.clear();
//        model.setData(errList);
//        errTab.setModel(model);
    }
    
    public static void addErr(ArrayList<Error> e){
        for(Error err : e){
            errList.add(err);
        }
        
        model = new TableErrorModel();
        model.setData(errList);
        errTab.setModel(model);
    }
}
