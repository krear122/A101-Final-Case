import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Testsonuc implements TestWatcher {

    Log log = new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testAdi = context.getDisplayName();
        log.info(testAdi + " Başarılı");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testAdi = context.getDisplayName();
        String hataSebeb = cause.getMessage() ;
        log.error(testAdi + " Hata Sebebi : " + hataSebeb);
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {

    }
}
