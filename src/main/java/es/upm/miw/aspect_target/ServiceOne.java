package es.upm.miw.aspect_target;

import es.upm.miw.aspect.MyClassAnnotation;
import es.upm.miw.aspect.MyMethodAnnotation;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@MyClassAnnotation
public class ServiceOne {

    public void method() {
        LogManager.getLogger(this.getClass()).debug("-----------------> ServiceOne:method");
    }

    public void argString(String name) {
        LogManager.getLogger(this.getClass()).debug(String.format("-----------------> ServiceOne:argOneString(name= %s)", name));
    }

    public int returnInt() {
        int result = 666;
        LogManager.getLogger(this.getClass()).debug(String.format("-----------------> ServiceOne:returnInt return= %s", result));
        return result;
    }

    public void exception() throws IOException {
        LogManager.getLogger(this.getClass()).debug("-----------------> ServiceOne:exception");
        throw new IOException(">:o(");
    }

    @MyMethodAnnotation
    public void annotation() {
        LogManager.getLogger("miw").debug("-----------------> ServiceOne:annotation");
    }

}
