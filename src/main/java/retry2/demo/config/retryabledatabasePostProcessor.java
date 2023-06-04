package retry2.demo.config;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Order(value = Ordered.HIGHEST_PRECEDENCE)
@Component
public class retryabledatabasePostProcessor implements BeanPostProcessor {



    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof DataSource) {
            System.out.print("-----> configuring a retryable datasource for beanName = {}"+ beanName);
            return new retryabledatasource((DataSource) bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
