package py;

import org.python.core.PyDictionary;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class pyUtility {
    public static String pyTest(int a, int b, String context) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile(context+"scripts/test.py");
        PyFunction func = interpreter.get("adder",PyFunction.class);
        //int a = 2010, b = 2 ;
        PyObject pyobj = func.__call__(new PyInteger(a), new PyInteger(b));
        return "anwser = " + pyobj.toString();
    }
}
