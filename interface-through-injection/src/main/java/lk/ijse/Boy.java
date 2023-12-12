/* Created By Sithira Roneth
 * Date :12/12/23
 * Time :14:31
 * Project Name :dependency-injection
 * */
package lk.ijse;

public class Boy implements DI{
    Agreement agreement;
    public void chatWithGirl(){
        agreement.chat();
    }
    public void test(){
        agreement.chat();
    }
    @Override
    public void inject(Agreement a) {
        this.agreement = a;
    }
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
        boy.test();
    }
}
