package za.ac.cput.springframeworkq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class Person implements PersonInterface
{

    @Override
    public List<String> getInfo()
    {
        List<String> info = new ArrayList<String>();
        info.add("Sipho");
        info.add("Cloete");
        return(info);
    }
}
