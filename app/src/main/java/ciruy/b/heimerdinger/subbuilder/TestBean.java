package ciruy.b.heimerdinger.subbuilder;

import com.app.common_upload.annotation.apt.BuilderClass;
import com.app.common_upload.annotation.apt.OmitMethod;
import com.app.common_upload.inter.ISubBuilder;

/**
 * @Author xushiyun
 * @Create-time 10/31/19
 * @Pageage ciruy.b.heimerdinger.subbuilder
 * @Project SubBuilder
 * @Email ciruy.victory@gmail.com
 * @Related-classes
 * @Desc
 */
@BuilderClass
public class TestBean implements ISubBuilder<SubTestBean> {
    String messageA;
    String messageB;
    
    public String getMessageA() {
        return messageA;
    }
    
    @OmitMethod
    public static final void Main(String[] arg) {
        TestBean testBean = new TestBean("A", "B");
        //原来版本
        SubTestBean.__create(testBean)
                .setMessageA("A1")
                .setMessageB("B1");
        //现在版本
        testBean.subBuilder()
                .setMessageA("A2")
                .setMessageB("B2");
    }
    
    public void setMessageA(String messageA) {
        this.messageA = messageA;
    }
    
    public TestBean(String messageA, String messageB) {
        this.messageA = messageA;
        this.messageB = messageB;
    }
    
    public String getMessageB() {
        return messageB;
    }
    
    public void setMessageB(String messageB) {
        this.messageB = messageB;
    }
    
    private void test() {
        this.setMessageA("A");
        this.setMessageB("B");
    }
    
    @Override
    public SubTestBean subBuilder() {
        return SubTestBean.__create(this);
    }
}
