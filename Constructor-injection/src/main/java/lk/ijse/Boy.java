/* Created By Sithira Roneth
 * Date :12/12/23
 * Time :14:31
 * Project Name :dependency-injection
 * */
package lk.ijse;

public class Boy {
    Agreement agreement;
    public Boy(Agreement a){
        this.agreement = a;
    }
    public void chatWithGirl(){
        agreement.chat();
    }
    public void test(){
        agreement.chat();
    }
    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
        boy.chatWithGirl();
        boy.test();
    }
}
