package ciruy.b.heimerdinger.subbuilder;

import com.app.common_upload.annotation.apt.BuilderClass;

/**
 * @Author xushiyun
 * @Create-time 11/5/19
 * @Pageage ciruy.b.heimerdinger.subbuilder
 * @Project SubBuilder
 * @Email ciruy.victory@gmail.com
 * @Related-classes
 * @Desc
 */
@BuilderClass
public class TestBeanSubClass extends TestBean {
    public TestBeanSubClass(String messageA, String messageB) {
        super(messageA, messageB);
    }
}
