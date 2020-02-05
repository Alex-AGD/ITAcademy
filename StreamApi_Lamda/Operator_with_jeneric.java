package StreamApi_Lamda;

public interface Operator_with_jeneric<T> { //использ дженерик если мы не знаем какой тип данным нам может потреоваться.
    T getResult(T value1, T value2);

}
