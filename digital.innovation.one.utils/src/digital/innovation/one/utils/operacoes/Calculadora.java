package digital.innovation.one.utils.operacoes;

import digital.innovation.one.utils.operacoes.internal.DivHelper;
import digital.innovation.one.utils.operacoes.internal.MultHelper;
import digital.innovation.one.utils.operacoes.internal.SubHelper;
import digital.innovation.one.utils.operacoes.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora() {
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int sum(int a, int b){
       return sumHelper.execute(a,b);
    }
}