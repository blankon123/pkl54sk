/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.util;

/**
 *
 * @author Thosan Girisona S
 */
public class UserControl {

    private static String nim;
    private static String nama;
    private static String flag, flag2 = "2";

    public static String getNim() {
        return nim;
    }

    public static void setNim(String nim) {
        UserControl.nim = nim;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserControl.nama = nama;
    }

    public static String getFlag() {
        return flag;
    }

    public static void setFlag(String flag) {
        UserControl.flag = flag;
    }

    public static String getFlag2() {
        return "2";
    }

    public static void logOut() {
        nim = null;
    }
}
