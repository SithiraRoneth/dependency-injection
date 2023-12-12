/* Created By Sithira Roneth
 * Date :12/12/23
 * Time :14:31
 * Project Name :dependency-injection
 * */
package lk.ijse;

public class Boy {
    public void chatWithGirl(){
        Agreement agreement = new Girl();
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
