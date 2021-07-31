import utill.CalculatorImplException;

import java.util.Map;

public interface Calculator {
    public String calculated (Map<String,Object> map, TypeOfLanguage type) throws CalculatorImplException;

}

