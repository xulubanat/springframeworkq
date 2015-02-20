package za.ac.cput.springframeworkq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.springframeworkq.Person;
import za.ac.cput.springframeworkq.PersonInterface;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class PConfig
{
    @Bean(name = "pa")
    public PersonInterface getPer()
    {
        return new Person();
    }
}
