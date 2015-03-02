/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sp.component;

/**
 *
 * @author ita
 */


/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class TextFieldSemantic extends TextField {

    public TextFieldSemantic() {
        super();
        this.setLength(2);
        this.setMinDigit(1);
        this.setMaxDigit(10);
    }
   
}