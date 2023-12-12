/* Created By Sithira Roneth
 * Date :12/12/23
 * Time :14:16
 * Project Name :dependency-injection
 * */
package lk.ijse;

public class Boy {
    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}
