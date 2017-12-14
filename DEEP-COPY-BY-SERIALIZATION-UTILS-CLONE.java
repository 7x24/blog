
import org.apache.commons.lang.SerializationUtils;

import java.io.*;
/**
 * Have a nice day!
 * -. --- - .. ... .... . .-.. .-.. --.-. --. -- .- .. .-..
 * Auth : GongFan
 * Mail : notishell@gmail.com
 * Time : 2017/09/28 16:27
 */
public class Main {

    public static void main(String[] argv) throws IOException, InterruptedException {
        D d = new D(new A(199L), new B(new A(444L)), new C(new A(1112L), new B(new A(999L))));
        D e = (D)SerializationUtils.clone(d);
        assert d != e;
    }

    static class A implements Serializable {
        Long x;
        A(Long x) {
            this.x = x;
        }
    }
    static class B implements Serializable {
        A a;
        B(A a) {
            this.a = a;
        }
    }
    static class C implements Serializable {
        A a;
        B b;
        C(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }
    static class D implements Serializable {
        A a;
        B b;
        C c;
        D(A a, B b, C c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
