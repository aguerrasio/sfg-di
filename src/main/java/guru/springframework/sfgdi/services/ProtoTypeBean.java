package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ProtoTypeBean {
    public ProtoTypeBean(){
        System.out.println("I'm in prototype bean !!!");
    }

    public String getMyScope(){
        return "This is prototype";
    }
}
