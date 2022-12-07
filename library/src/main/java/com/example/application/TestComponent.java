import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.littemplate.LitTemplate;

@NpmPackage(value = "@praxo/mre-exports", version = "1.0.0")
@JsModule("@praxo/mre-exports/other.js")
@Tag("test")
public class TestComponent extends LitTemplate {
}