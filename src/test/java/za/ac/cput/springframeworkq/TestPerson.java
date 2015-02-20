package za.ac.cput.springframeworkq;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class TestPerson
{
    List<String> pinfo;
    private PersonInterface pa;
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext cntx = new AnnotationConfigApplicationContext(PConfig.class);
        pa = (PersonInterface)cntx.getBean("pa");
        pinfo = new ArrayList<String>();
        pinfo.add("Sipho");
        pinfo.add("Cloete");
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(pinfo,pa.getInfo());
    }

    @After
    public void tearDown() throws Exception
    {
    }
}
