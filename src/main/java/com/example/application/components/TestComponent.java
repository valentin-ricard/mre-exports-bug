import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.Component;

@NpmPackage(value = "@praxo/mre-exports", version = "1.0.0")
@JsModule("@praxo/mre-exports/other.js")
public class TestComponent extends Component {
}