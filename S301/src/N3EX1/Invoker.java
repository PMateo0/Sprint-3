package N3EX1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IExecute> executions = new ArrayList<>();
    public void recieveExecute(IExecute execute){
        this.executions.add(execute);
    }
    public void realizeExecution(){
        this.executions.forEach(x-> x.execute());
        this.executions.clear();
    }
}
